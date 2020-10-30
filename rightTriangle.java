import java.util.Scanner;

public class rightTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int side1;
        int side2;
        int side3;
        System.out.println("Please enter the lenght of side 1");
        side1 = sc.nextInt();
        System.out.println("Please enter the lenght of side 2");
        side2 = sc.nextInt();
        System.out.println("Please enter the lenght of side 3");
        side3 = sc.nextInt();

        int longSide;
        int shortSide1;
        int shortSide2;

        //check which side is the longest
        if(side1 > side2 && side1 > side3) {
            longSide = side1;
            shortSide1 = side2;
            shortSide2 = side3;
        } else if(side2 > side1 && side2 > side3) {
            longSide = side2;
            shortSide1 = side1;
            shortSide2 = side3;
        } else {
            longSide = side3;
            shortSide1 = side1;
            shortSide2 = side2;
        }

        if (Math.pow(longSide, 2) == Math.pow(shortSide1, 2) + Math.pow(shortSide2, 2)) {
            System.out.println("right triangle");
        } else {
            System.out.println("non-right triangle");
        }
        
    }
}
