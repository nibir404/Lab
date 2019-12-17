public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public boolean  isPrime(){
        int sqrt = (int)Math.sqrt(value);
        for (int i=2;i<=sqrt;i++){
            if (value %i==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }
}
