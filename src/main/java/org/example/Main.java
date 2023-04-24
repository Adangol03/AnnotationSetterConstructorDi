package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Annotation.*;
import thruConstructor.*;
import thruSetter.*;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationDI.class);
        Property property= context.getBean(Property.class);

        RentOfFlat rentOfFlat = property.getRentOfFlatConstructor();
        RentOfOneBHKFlat rentOfOneBHKFlat = rentOfFlat.getRentOfOneBHKFlat();
        rentOfOneBHKFlat.calculateRentOfFlat1();
        RentOfTwoBHKFlat rentOfTwoBHKFlat = rentOfFlat.getRentOfTwoBHKFlat();
        rentOfTwoBHKFlat.calculateRentOfFlat2();
        RentOfThreeBHKFlat rentOfThreeBHKFlat= rentOfFlat.getRentOfThreeBHKFlat();
        rentOfThreeBHKFlat.calculateRentOfFlat3();

        SelfOwnedFlat selfOwnedFlat= property.getSelfOwnedFlatConstructor();
        SelfOwnerOneBHKFlat selfOwnerOneBHKFlat = selfOwnedFlat.getSelfOwnerOneBHKFlat();
        selfOwnerOneBHKFlat.calculatePlot();
        selfOwnerOneBHKFlat.finalPriceOfFlat1();
        SelfOwnerTwoBHKFlat selfOwnerTwoBHKFlat=selfOwnedFlat.getSelfOwnerTwoBHKFlat();
        selfOwnerTwoBHKFlat.calculatePlot();
        selfOwnerTwoBHKFlat.finalPriceOfFlat2();
        SelfOwnerThreeBHKFlat selfOwnerThreeBHKFlat =selfOwnedFlat.getSelfOwnerThreeBHKFlat();
        selfOwnerThreeBHKFlat.finalPriceOfFlat3();
        System.out.println("-----------------------------------------------------------------");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("bean_for_constructor.xml");
        PropertyConstructor propertyConstructor=context1.getBean(PropertyConstructor.class);
        RentOfFlatConstructor rentOfFlat1 =propertyConstructor.rentOfFlatConstructor;
        RentOfOneBHK rentOfOneBHK = rentOfFlat1.rentOfOneBHK;
        rentOfOneBHK.calculateRentOfFlats1();

        SelfOwnedFlatConstructor selfOwnedFlatConstructor = propertyConstructor.selfOwnedFlatConstructor;
        SelfOwnedOneBHK selfOwnedOneBHK = selfOwnedFlatConstructor.selfOwnedOneBHK;
        selfOwnedOneBHK.finalPriceOfFlat1();
        SelfOwnedTwoBHK selfOwnedTwoBHK =selfOwnedFlatConstructor.selfOwnedTwoBHK;
        selfOwnedTwoBHK.finalPriceOfFlat2();
        SelfOwnedThreeBHK selfOwnedThreeBHK = selfOwnedFlatConstructor.selfOwnedThreeBHK;
        selfOwnedThreeBHK.finalPriceOfFlat3();
        System.out.println("-----------------------------------------------------------------------");


        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean_for_setter.xml");
        PropertySetter prop = context2.getBean(PropertySetter.class);
        SelfOwnedFlatSetter selfOwnedFlatSetter = prop.selfOwnedFlatSetter;
        SelfOwnedOneBHKFlats selfOwnedOneBHKFlats = selfOwnedFlatSetter.selfOwnedOneBHKFlats;
        selfOwnedOneBHKFlats.finalPriceOfFlat1();
        SelfOwnerTwoBHKFlats selfOwnerTwoBHKFlats=selfOwnedFlatSetter.selfOwnerTwoBHKFlats;
        selfOwnerTwoBHKFlats.finalPriceOfFlat2();
        SelfOwnerThreeBHKFlats selfOwnerThreeBHKFlats = selfOwnedFlatSetter.selfOwnerThreeBHKFlats;
        selfOwnerThreeBHKFlats.finalPriceOfFlat3();
        RentOfFlatSetter rentOfFlatSetter= prop.rentOfFlatSetter;
        RentOfOneBHKFlats rentOfOneBHKFlats =rentOfFlatSetter.rentOfOneBHKFlats;
        rentOfOneBHKFlats.calculateRentOfFlats1();


    }
}