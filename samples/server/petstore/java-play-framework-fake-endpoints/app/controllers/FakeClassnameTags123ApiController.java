package controllers;

import apimodels.Client;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.IOException;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;

import swagger.SwaggerUtils.ApiAction;


public class FakeClassnameTags123ApiController extends Controller {

    private final FakeClassnameTags123ApiControllerImpInterface imp;
    private final ObjectMapper mapper;

    @Inject
    private FakeClassnameTags123ApiController(FakeClassnameTags123ApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result testClassname() throws Exception {
        JsonNode nodebody = request().body().asJson();
        Client body;

        body = mapper.readValue(nodebody.toString(), Client.class);
        body.validate();

        Client obj = imp.testClassname(body);
        obj.validate();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
        
    }
}
