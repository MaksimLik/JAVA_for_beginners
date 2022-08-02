import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Enter first and second number:");

        Scanner number = new Scanner(System.in);

        double num1, num2;

        num1 = number.nextDouble();
        num2 = number.nextDouble();

        System.out.println("Enter your selection: \n1 - for addition \n" +
                "2 - for substraction \n" +
                "3 - for multiplication \n" +
                "4 - for division: \n" +
                "5 - the square root of the numbers");

        int choose;
        choose = number.nextInt();

        switch (choose) {
            case 1:
                double addition = num1 + num2;
                System.out.println(addition);
                break;
            case 2:
                double substraction = num1 - num2;
                System.out.println(substraction);
                break;
            case 3:
                double multiplication = num1 * num2;
                System.out.println(multiplication);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero");
                } else {
                    double division = num1 / num2;
                    System.out.println(division); }
                break;
            case 5:
                double sqrt1 = Math.sqrt(num1);
                double sqrt2 = Math.sqrt(num2);
                System.out.println("Square from first num: \n" + sqrt1 + "\n Square from second num: \n" + sqrt2);
                break;
            default:
                System.out.println("Choose from 1 to 5");
        }

    }

}