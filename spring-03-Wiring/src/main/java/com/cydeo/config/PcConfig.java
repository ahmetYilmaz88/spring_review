package com.practice.config;

import com.practice.casefactory.Case;
import com.practice.casefactory.DellCase;
import com.practice.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public  Dimensions dimensions(){
       return  new Dimensions(50,10,10);
    }


    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B","Dell","240",dimensions);
    }


}
