import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int SomeValue = in.nextInt();
        MyInteger myInt = new MyInteger(SomeValue);
        System.out.println("weather is Prime? : ");
        System.out.println(myInt.isPrime());
        System.out.println("weather is Prime? : ");
        System.out.println(MyInteger.isPrime(myInt));
    }
}
