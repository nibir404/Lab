public class Area {
    private double result,pi=3.1416;

    public double findArea(double x, double y){
        result = x*y;
        return result;
    }
    public double findArea(double c,double x,double y){
        result = c*x*y;
        return result;
    }
    public double findArea(double r){
        result = pi*r*r;
        return result;
    }
}
