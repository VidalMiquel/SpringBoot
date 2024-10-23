package com.uppercase.Application;

import org.springframework.stereotype.Service;

@Service
public class UppercaseService {
    
    public String convertToUpperCase(String word){
        if(word != null){
            return word.toUpperCase();
        }
        return null;
           
    }
}
