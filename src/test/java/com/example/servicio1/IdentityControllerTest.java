package com.example.servicio1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class IdentityControllerTest {

    private MockMvc mockMvc;

    @Test
    void testCIExists() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/checkCI")
                        .param("ci", "12345678"))
                .andExpect(status().isOk());
    }

    @Test
    void testCINotExists() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/checkCI")
                        .param("ci", "99999999"))
                .andExpect(status().isOk());
    }
}