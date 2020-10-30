import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {

        // Gathering the three input values and storing them in the variables a, b and c
        System.out.println("Please enter three numbers each followed by return.");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("");

        // check if a<b<c
        if (a <= b && b <= c) {
            System.out.println(a + ", " + b + ", " + c);
        }
        // check if a<c<b
        else if (a <= b && a <= c && b >= c) {
            System.out.println(a + ", " + c + ", " + b);
        }
        // check if b<c<a
        else if (b <= c && c <= a) {
            System.out.println(b + ", " + c + ", " + a);
        }
        // check if b<a<c
        else if (b <= c && b <= a && c >= a) {
            System.out.println(b + ", " + a + ", " + c);
        }
        // check if c<a<b
        else if (c <= a && a <= b) {
            System.out.println(c + ", " + a + ", " + b);
        }
        // check if last possible solution, c<b<a
        else {
            System.out.println(c + ", " + b + ", " + a);
        }
        sc.close();
    }
}
