package com.practise.trumpit.rest;

import com.practise.trumpit.functional.FunctionalTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class FighterRestTest extends FunctionalTest {

    @Test
    public void testGetFighters() {
        given().when()
                .get("/fighters/all")
                .then()
                .statusCode(200);
    }

}
