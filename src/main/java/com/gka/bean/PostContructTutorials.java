package com.gka.bean;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.logging.Logger;



public class PostContructTutorials {

//    @Autowired
//    Logger LOG ;
//
//    // parametresiz constructor
//    // because this.og is null hatası alırsak post construct yazarak cozerız
////    public PostContructTutorials() {
////        LOG.info("Log info Çağrıldı");
////    }
//
//    //bean henüz baslamadıgından null pointer exception alıyoruz ve burada bağımlılıgı enjecte edemiyoruz .
//    // Görevi : bir bean nesnesi olusturuldugunda hemen olusur ..
//    @PostConstruct
//    public void init(){
//        LOG.info("Log info Çağrıldı");
//    }
//    public static void main(String[] args) {
//        PostContructTutorials beanController = new PostContructTutorials();
//        System.out.println(beanController);
//
//    }
}
