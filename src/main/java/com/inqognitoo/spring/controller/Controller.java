package com.inqognitoo.spring.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static boolean isPalindrome(String name){

        int i = 0;
        int j = name.length() - 1;

        while(i < j){

            if(name.charAt(i) != name.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/palindrome",
        produces = "application/json"
    )
    public String palindrome(@RequestParam(value="string") String name){

        JSONObject json = new JSONObject();
        json.put("isPalindrome", isPalindrome(name));

        return json.toString();
    }
}