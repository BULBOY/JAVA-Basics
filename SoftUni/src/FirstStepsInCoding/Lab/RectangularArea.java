import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Rectangular sides input
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        //Calculating area 
        int area = a * b;
        System.out.println(area);

    }
}
    