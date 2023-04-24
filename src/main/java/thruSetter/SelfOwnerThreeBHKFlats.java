package thruSetter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelfOwnerThreeBHKFlats {
    float length = 30.10f;
    float breath = 32.12f;
    float height = 33.13f;

    public float calculatePlot() {
        float area = length * breath * height;
        return area;
    }
    public void finalPriceOfFlat3(){
        float total = 50000*calculatePlot();
        System.out.println("the final price of the plot is :: "+total);
    }


}
