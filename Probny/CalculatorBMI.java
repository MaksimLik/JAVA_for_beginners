package Probny;

public class CalculatorBMI {
    public static void main(String[] args) {
        double wieght = 70;
        float height = 1.75f;

        float bmi = (float) (wieght/Math.pow(height, 2));
        //zaokrąglamy zgodnie z regułami matematycznymi
        System.out.println("Your index BMI it is: " + Math.round(bmi));
        //zaokrąglamy odrzucając część ułamkową
        System.out.println("Your index BMI it is: " + (int)bmi);
        //zaokrąglamy w górę zawsze
        System.out.println("Your index BMI it is: " + (Math.ceil(bmi)));
        //zaokrąglamy w dół zawsze
        System.out.println("Your index BMI it is: " + (Math.floor(bmi)));

    }
}
