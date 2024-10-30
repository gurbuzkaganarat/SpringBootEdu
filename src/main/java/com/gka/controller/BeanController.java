package com.gka.controller;

import com.gka.bean.BeanConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller // controller oldugu belirtmek
public class BeanController {

        // BeanConfig yapısını ınject etmemız gerekiyor
     // bu annotaıons ınject etmeye yarıyor  config yapısını cagırmak ıcın
                // ******* projelerde hazır bilesen kullanabilmek icin bu yapıyı kurmamız gerekıyor bean config *********
                // bean config  @bean olusturma  @config  olusturma  controller'da  kullanma  ***
         @Autowired
        BeanConfig beanConfig;


    // Hepsi cok onemli
     // GetMapping yapısı asında URL yapısıdır.  http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") // URL
    @ResponseBody // html olmadan direkt ekranda göster
    public String getBeanDto(){
        // bu gosterdıgımız bılesenı Strın deger verdıgımız ıcın ya dto yada cast edıcez
        return beanConfig.beanDto()+""; // dto'yu stringe  //  +" " //  cast etmeye yarıyor
    }







}
