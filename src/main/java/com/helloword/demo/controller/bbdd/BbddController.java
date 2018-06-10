/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloword.demo.controller.bbdd;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Alvaro Zaragoza
 */
@RestController 
@RequestMapping(value="/bbdd")
public class BbddController {
    @RequestMapping(value="/create" , method = RequestMethod.GET)
    public String create(@RequestParam( value = "var" ) String var){
        return "Create "+var;
    }
    @RequestMapping(value="/read" , method = RequestMethod.GET)
    public String read(@RequestParam( value = "var" ) String var){
        return "read "+var;
    }
    @RequestMapping(value="/update" , method = RequestMethod.GET)
    public String update(@RequestParam( value = "var" ) String var){
        return "update "+var;
    }
    @RequestMapping(value="/delete" , method = RequestMethod.GET)
    public String Input(@RequestParam( value = "var" ) String var){
        return "delete "+var;
    }
    
}
