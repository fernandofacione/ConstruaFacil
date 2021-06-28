package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class User {
       String uri = "https://petstore.swagger.io/v2/user";
       int userId = 2110;

        // Padrão
        // Given = Dado
        // .When = Quando
        // .Then = Então

        // Funções de Apoio
        public String lerJson(String caminhoJson) throws IOException {
            return new String(Files.readAllBytes(Paths.get(caminhoJson)));

        }

        @Test
        public void incluirUsuario() throws IOException {
             String jsonBody = lerJson("src/test/resources/data/user.json");

             given()
                     .contentType("application/sjon")
                     .log().all()
                     .body(jsonBody)
             .when()
                     .post(uri)
             .then()
                    .log().all()
                    .statusCode(200)
                    .body("code", is(200))
                    .body("code", is("unknown"))
                    .body("message", is(Integer.toString(userId)));

    }


}
