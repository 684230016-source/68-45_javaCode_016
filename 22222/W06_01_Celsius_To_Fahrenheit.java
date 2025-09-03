import java.util.Scanner;

public class W06_01_Celsius_To_Fahrenheit{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double Celsius =1.0;

        System.out.print("Enter ur Celsius = ");
        double Fahrenheit = kb.nextDouble();
        double Convert = (Fahrenheit*1.8)+32;

        System.err.println("Celsius ="+Fahrenheit+"C"+"Convert To"+"Fahrenheit ="+Convert+"F");
        kb.close();
    }
}