package com.uppercase.Presentation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uppercase.Application.UppercaseService;

@RestController
@RequestMapping("/api/words")
public class UppercaseController {

    @Autowired
    UppercaseService upperCaseService;

    @PostMapping("/uppercase")
    public String toUpperCase(@RequestBody String word) {
        return upperCaseService.convertToUpperCase(word);
    }
}