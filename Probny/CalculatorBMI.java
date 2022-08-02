package Probny;

public class CalculatorBMI {
    public static void main(String[] args) {
        double wieght = 70;
        float height = 1.75f;

        float bmi = (float) (wieght/Math.pow(height, 2));
        System.out.println("Your index BMI it is: " + bmi);

        

    }
}
