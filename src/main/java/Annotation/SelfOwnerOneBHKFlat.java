package Annotation;

public class SelfOwnerOneBHKFlat {
    float length = 10.10f;
    float breath = 12.12f;
    float height = 13.13f;

    public float calculatePlot() {
        float area = length * breath * height;
        return area;
    }
    public void finalPriceOfFlat1(){
        float total = 10000*calculatePlot();
        System.out.println("the final price of the plot is :: "+total);
    }


}
