package thruSetter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentOfOneBHKFlats {
    public void calculateRentOfFlats1(){
        int noOfPerson=2;
        double rent=(250*noOfPerson);
        System.out.println("the rent is "+rent+" for "+noOfPerson+" tenants");
    }

}
