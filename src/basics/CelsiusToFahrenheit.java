package basics;

import java.util.Scanner;
public class CelsiusToFahrenheit{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a value of Celsius: ");
        double num1 = scan.nextInt();
        double result = (num1 * 1.8)+32;
        System.out.print("Converting the Celsius value to Fahrenheit we get " +result );
    }
}
