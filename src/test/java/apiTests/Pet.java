package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;


public class Pet {


    // Padrão
    // Given = Dado
    // .When = Quando
    // .Then = Então

    // Funções de Apoio
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    @Test
    public void incluirPet() throws IOException { // Create - Post

        String jsonBody = lerJson("src/test/resources/data/pet.json");

        given()                                                     //Dado
                .contentType("application/json")                    //Tipo do Conteúdo
                // "text/xml" para web services sincronos - ex: Correios
                // "application/json" para web services assincronos - ex: ifood
                .log().all()                                        //Registrar tudo do envio
                .body(jsonBody)
        .when()
                .post("https://petstore.swagger.io/v2/pet")      //Comando + endpoint
        .then()                                                       //Então
                .log().all()                                          //Registrar tudo da volta
                .statusCode(200);                                      //Código do Estado



    }

}
