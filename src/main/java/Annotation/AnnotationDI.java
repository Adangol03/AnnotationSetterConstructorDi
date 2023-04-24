package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationDI {
    @Bean
    public SelfOwnerOneBHKFlat selfOwnerOneBHKFlat() {
        return new SelfOwnerOneBHKFlat();
    }
    @Bean
    public SelfOwnerTwoBHKFlat selfOwnerTwoBHKFlat() {
        return new SelfOwnerTwoBHKFlat();
    }
    @Bean
    public SelfOwnerThreeBHKFlat selfOwnerThreeBHKFlat(){
        return new SelfOwnerThreeBHKFlat();
    }
    @Bean
    public RentOfOneBHKFlat rentOfOneBHKFlat(){
        return new RentOfOneBHKFlat();
    }
    @Bean
    public RentOfTwoBHKFlat rentOfTwoBHKFlat(){
        RentOfTwoBHKFlat rentOfTwoBHKFlat = new RentOfTwoBHKFlat();
        return rentOfTwoBHKFlat;
    }
    @Bean
    public RentOfThreeBHKFlat rentOfThreeBHKFlat(){
        return  new RentOfThreeBHKFlat();
    }

    @Bean
    public RentOfFlat RentOfFlatConstructor(){
        return new RentOfFlat(rentOfOneBHKFlat(),rentOfTwoBHKFlat(),rentOfThreeBHKFlat());
    }
    @Bean
    public SelfOwnedFlat selfOwnedFlatConstructor(){
        return new SelfOwnedFlat(selfOwnerOneBHKFlat(),selfOwnerTwoBHKFlat(),selfOwnerThreeBHKFlat());
    }
    @Bean
    public Property property(){
        return new Property(RentOfFlatConstructor(), new SelfOwnedFlat(selfOwnerOneBHKFlat(),selfOwnerTwoBHKFlat(),selfOwnerThreeBHKFlat()));
    }


}

