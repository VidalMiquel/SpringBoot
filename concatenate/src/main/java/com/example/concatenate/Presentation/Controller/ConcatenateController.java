package com.example.concatenate.Presentation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.concatenate.Application.ConcatenateService;


@RestController
@RequestMapping("/api")
public class ConcatenateController {

    @Autowired
    private ConcatenateService concatenateService;

    @PostMapping("/concatenate")
    public String concatenate(@RequestParam String left, @RequestParam String right){
        String concatenateString = concatenateService.concatenateStrings(left, right);
        return concatenateString;
    }

    
}
