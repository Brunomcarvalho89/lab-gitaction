package com.gitaction.labgitaction.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bcmariz
 */
@RestController
@RequestMapping(path = "/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello world!!!");
    }

}
