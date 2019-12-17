public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,2);
        System.out.println("Complex number 1: "+c1.real+" +i "+c1.imaginary);
        Complex c2= new Complex(9,5);
        System.out.println("Complex number 2: "+c2.real+" +i "+c2.imaginary);
        Complex c3 = new Complex();
        c3 = c3.addcomp(c1,c2);
        System.out.println("Sunm of compolex number : "+c3.real+" +i "+c3.imaginary);
    }
}
