package com.practice.streotype_annotation;

import com.practice.streotype_annotation.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        PC myPc = container.getBean(PC.class);

        myPc.powerUp();

        System.out.println(myPc.getTheCase().getDimensions().getDepth());
    }
}
