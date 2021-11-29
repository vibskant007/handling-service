package com.bre.handlingservice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(ProductControllerTest.class)
public class ProductControllerTest {

        @Autowired
        MockMvc mockMvc;

    @Test
    public void bookRuleTest() throws Exception {
        String body = "{\n" +
                "\t\"orderId\" : \"12345\",\n" +
                "\t\"book\" : {\n" +
                "\t\"price\" : 200,\n" +
                "\t\"quantity\" : 20\n" +
                "\t},\n" +
                "\t\"membership\":{\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t\"physicalOrder\" :{\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t\"video\" :{\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t\"status\" : true\n" +
                "}";

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/v1/api/apply-rule")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(body);

        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.message", is("Processed Packaging & Commission !")));
    }

    //Similarly other json can be posted with Membership / Video & Physical order to trigger different rules and asserted
}
