package com.example.concatenate.Presentation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.concatenate.Application.ConcatenateService;


@RestController
@RequestMapping("/api")
public class ConcatenateController {

    @Autowired
    private ConcatenateService concatenateService;

    @GetMapping("/concatenate")
    public String concatenate(@RequestParam String left, @RequestParam String right){
        String concatenateString = concatenateService.concatenateStrings(left, right);
        return concatenateString;
    }

    
}
