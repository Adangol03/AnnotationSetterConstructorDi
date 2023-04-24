package thruSetter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentOfThreeBHKFlats {
    public void calculateRentOfFlat3(){
        int noOfPerson=4;
        double rent=(600*noOfPerson);
        System.out.println("the rent is "+rent+" for "+noOfPerson+" tenants");
    }

}
