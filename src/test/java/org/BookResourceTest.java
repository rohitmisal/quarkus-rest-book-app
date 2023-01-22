package org;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldGetAllBooks() {
        given()
        	.header(HttpHeaders.ACCEPT,MediaType.APPLICATION_JSON)
          .when().get("/api/books")
          .then()
             .statusCode(200)
             .body( "size()",is(3));
    }

    @Test
    public void shouldAllBooks() {
        given()
        	.header(HttpHeaders.ACCEPT,MediaType.TEXT_PLAIN)
          .when().get("/api/books/count")
          .then()
             .statusCode(200)
             .body(is("3"));
    }
    @Test
    public void shouldGetBook() {
        given()
        	.header(HttpHeaders.ACCEPT,MediaType.APPLICATION_JSON)
        	.pathParam("id", 1)
          .when().get("/api/books/{id}")
          .then()
             .statusCode(200)
             .body("title",is("Understanding Quarku"))
             .body("yearOfPublication",is(2020));

    }
}