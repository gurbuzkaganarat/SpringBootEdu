package com.gka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;


    // baslangıc  bean methodu
    public void initialBeanMethod(){
        log.info("Bean başlamadan önce ben varım");
        System.out.println("Bean baslamadan once calısacak method");

    }

    //  bitiş
    public void destroyBeanMethod(){

        log.info("Bean bittikten sonra ben varım");
        System.err.println("Bean bittikten sonra  calısacak method");

    }

}
