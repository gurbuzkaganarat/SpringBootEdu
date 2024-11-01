package com.gka.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Bilesenin controller olması ıcın @Controller Annotions eklenir
@Controller
public class ThymeleafController {

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1") //URL Yapımız
    // @ResponseBody yapımız herhangi bir sayfaya yonlendırmeyı gosterıyor
    public String getThymeleaf1(){
        return "thymeleaf1";   // burası donecek olan html sayfasını belirtir !
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","Ben Modelden geldim-2");
        model.addAttribute("key_model2","Ben Modelden geldim-2");

        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","Ben Modelden geldim-1");
        model.addAttribute("key_model2","Ben Modelden geldim-2");

        return "thymeleaf_file/thymeleaf3";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model){
        model.addAttribute("key_model1","Ben Modelden geldim-4");
        return "thymeleaf4";
    }
}
