public class Factorial {
    int factorial = 1;
    public Factorial(){

    }
    public  Factorial(int number){
        for (int a=1; a<=number ; a++){
            factorial *=a;
        }
    }

    public int getFactorial() {
        return factorial;
    }
}
