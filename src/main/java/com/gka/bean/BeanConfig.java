package com.gka.bean;

import com.gka.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  // Config olusturma
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")   // burda tanıtacagım nokta beandto'da initialbeanmethod
    @Scope("singleton") // projede baslar olur  // @Scope("request") // bir istek boyunca calısır//  @Scope("session") // b,r oturum boyunca calısır

    public BeanDto beanDto(){
        return BeanDto  //dtp build etme dto nesnesinin proplarını ekleme
                .builder()
                    .id(0L).beanName("bean Adi").beanData("Bean Data")
                .build();
    }

}
