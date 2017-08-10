# This file is auto-generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'IO.Swagger PetApi' {
    Context 'PetApi' {
        It 'Invoke-PetApiAddPet' {
            $ret = Invoke-PetApiGetPetById -body "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiDeletePet' {
            $ret = Invoke-PetApiGetPetById -petId "TEST_VALUE" -apiKey "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiFindPetsByStatus' {
            $ret = Invoke-PetApiGetPetById -status "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiFindPetsByTags' {
            $ret = Invoke-PetApiGetPetById -tags "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiGetPetById' {
            $ret = Invoke-PetApiGetPetById -petId "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiUpdatePet' {
            $ret = Invoke-PetApiGetPetById -body "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiUpdatePetWithForm' {
            $ret = Invoke-PetApiGetPetById -petId "TEST_VALUE" -name "TEST_VALUE" -status "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'PetApi' {
        It 'Invoke-PetApiUploadFile' {
            $ret = Invoke-PetApiGetPetById -petId "TEST_VALUE" -additionalMetadata "TEST_VALUE" -file "TEST_VALUE"
            #$ret | Should BeOfType IO.Swagger.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
