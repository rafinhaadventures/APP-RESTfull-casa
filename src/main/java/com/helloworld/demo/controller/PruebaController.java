/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Alvaro Zaragoza
 */
@RestController 
@RequestMapping(value="/prueba")
public class PruebaController {
    
    @RequestMapping(value="/" , method = RequestMethod.GET)
    public String prueba(@RequestParam( value = "param1" ) String param1 , @RequestParam( value = "param2" ) String param2){
        return "Texto "+param1 + param2;
    }
    
    
}
