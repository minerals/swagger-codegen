package io.swagger.codegen.languages;

import io.swagger.codegen.*;
import io.swagger.models.Tag;
import io.swagger.models.Swagger;
import io.swagger.util.Yaml;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SwaggerYamlGenerator extends DefaultCodegen implements CodegenConfig {
    public static final String OUTPUT_NAME = "outputFile";

    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerYamlGenerator.class);

    protected String outputFile = "swagger.yaml";

    public SwaggerYamlGenerator() {
        super();
        embeddedTemplateDir = templateDir = "swagger";
        outputFolder = "generated-code/swagger";

        cliOptions.add(new CliOption(OUTPUT_NAME, "output filename"));

        // supportingFiles.add(new SupportingFile("README.md", "", "README.md"));
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.DOCUMENTATION;
    }

    @Override
    public String getName() {
        return "swagger-yaml";
    }

    @Override
    public String getHelp() {
        return "Creates a static swagger.yaml file.";
    }


    @Override
    public void processOpts() {
        super.processOpts();
        if(additionalProperties.containsKey(OUTPUT_NAME)) {
            this.outputFile = additionalProperties.get(OUTPUT_NAME).toString();
        }
    }

    @Override
    public void processSwagger(Swagger swagger) {
        try {
            cleanupSwagger(swagger);
            String swaggerString = Yaml.mapper().writeValueAsString(swagger);
            String outputFile = outputFolder + File.separator + this.outputFile;
            FileUtils.writeStringToFile(new File(outputFile), swaggerString);
            LOGGER.debug("wrote file to " + outputFile);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Override
    public String escapeQuotationMark(String input) {
        // just return the original string
        return input;
    }

    @Override
    public String escapeUnsafeCharacters(String input) {
        // just return the original string
        return input;
    }

    private void cleanupSwagger(Swagger swagger) {
        // sort paths, models, and tags so diffs are consistent
        swagger.setPaths(new TreeMap<>(swagger.getPaths()));
        swagger.setDefinitions(new TreeMap<>(swagger.getDefinitions()));

        Comparator<Tag> comp = new Comparator<Tag>() {
            public int compare(Tag a, Tag b) {
                return a.getName().compareTo(b.getName());
            }
        };
        List<Tag> tags = swagger.getTags();
        tags.sort(comp);
        swagger.setTags(tags);

        // remove auto-generated examples
        for (io.swagger.models.Model def : swagger.getDefinitions().values()) {
            def.setExample(null);
        }
    }

}
