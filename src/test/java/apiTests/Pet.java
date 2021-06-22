package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.google.inject.matcher.Matchers.not;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;


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
                .post("https://petstore.swagger.io/v2/pet")        //Comando + endpoint
        .then()                                                         //Então
                .log().all()                                            //Registrar tudo da volta
                .statusCode(200)                                        //ValidarCódigo do Estado
                .body("id", is(1010))                        //Valida o ID
                .body("name", is("Pateta"))                  //Valida o nome do animal
                .body("category.name", is("dog"))            //Valida a categoria do animal
                .body("tags.name", not(contains("nao vermifugado")))      //Valida se contem a palavra chave
                .body("tags.name", contains("vacina em dia"));

    }

}
