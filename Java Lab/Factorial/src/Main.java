import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int number =sc.nextInt();
        Factorial f = new Factorial(number);
        System.out.println(f.getFactorial());
    }
}
