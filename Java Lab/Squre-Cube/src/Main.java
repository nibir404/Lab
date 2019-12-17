import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power p1 = new Power();
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println("The cube of "+number+" is "+p1.find_cube(number));
        System.out.println("The squre of "+number+" is "+p1.find_squre(number));
    }
}
