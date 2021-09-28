package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class mycontrollerTest {
        @Mock
    private  mycontroller controller;

       @Autowired
       private MockMvc mmvc;

       @Test
    public void jsonMethod() throws Exception{
           mmvc.perform(MockMvcRequestBuilders.get("/pure").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
       }

}