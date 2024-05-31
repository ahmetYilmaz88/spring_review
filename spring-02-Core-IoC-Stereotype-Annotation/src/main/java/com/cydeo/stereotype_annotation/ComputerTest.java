package com.practice.stereotype_annotation;

import com.practice.stereotype_annotation.casefactory.Case;
import com.practice.stereotype_annotation.config.PcConfig;
import com.practice.stereotype_annotation.monitorfactory.Monitor;
import com.practice.stereotype_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase,theMonitor,theMotherboard);
        myPc.powerUp();


    }
}
