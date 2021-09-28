package com.example.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

@RestController
@RequestMapping(path = "/pure")
public class mycontroller {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<?> myJson() throws IOException {

//        ObjectMapper om =new ObjectMapper()
        File fl = ResourceUtils.getFile("classpath:myfile.json");
        String result = new String(Files.readAllBytes(fl.toPath()));
        String map = new HashMap<String, String>() {{
            {
                put("message", result);
            }
        }}.toString();
        return new ResponseEntity<>(map, HttpStatus.OK);


    }
}
