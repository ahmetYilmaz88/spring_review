package com.practice;

import com.practice.casefactory.Case;
import com.practice.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case theCase = container.getBean(Case.class);

        System.out.println("theCase.getDimensions().getDepth() = " + theCase.getDimensions().getDepth());
    }
}
