package com.in28minutes.springboot.rest.example;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * I need to launch the spring boot application in this test, from here hit the REST controller endpoints
 * and check the database is updated accordingly.<br><br>
 *
 * We don't need to mock anything. We are testing the actual application along with its components.<br><br>
 *
 * This test should take around 5-10 mins. at most for a spring boot seasoned developer.
 * If you don't remember details, feel free to search anything on internet.
 */


public class ControllerIntegrationTest {

  void test() {
    // check the database has been populated
    //test the controller
    // create students
    // check the database

  }

}
