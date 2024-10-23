package com.example.concatenate.Application;

import org.springframework.stereotype.Service;

@Service
public class ConcatenateService {

    public String concatenateStrings(String left, String right) {
        return left + right;
    }

}
