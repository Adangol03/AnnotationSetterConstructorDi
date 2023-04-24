package Annotation;

public class SelfOwnerTwoBHKFlat {
    float length = 20.10f;
    float breath = 22.12f;
    float height = 23.13f;

    public float calculatePlot() {
        float area = length * breath * height;
        return area;
    }
    public void finalPriceOfFlat2(){
        float total = 30000*calculatePlot();
        System.out.println("the final price of the plot is :: "+total);
    }


}
