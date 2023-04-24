package thruSetter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentOfTwoBHKFlats {
    public  void calculateRentOfFlat2(){
        int noOfPerson=3;
        double rent=(400*noOfPerson);
        System.out.println("the rent is "+rent+" for "+noOfPerson+" tenants");
    }

}
