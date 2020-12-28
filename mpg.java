package Java;
import java.util.Scanner;

public class mpg {
    public static void main(String args[]) {
        // clear unnecessary output in Terminal
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        System.out.println("Please enter your car consumption in l/100km:");

        double input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();
        double mpgfactor = 235.215;

        double output = (mpgfactor/input);
        // format the output
        String result = String.format("%.4g", output);
        System.out.println("Your consumption of " + input + " l/100km equals an endurance of " + result + " miles per gallon.");
        sc.close();
    }
}
