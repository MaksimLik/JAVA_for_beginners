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
                "4 - for division: \n");

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
            default:
                System.out.println("Choose from 1 to 4");
        }

    }

}