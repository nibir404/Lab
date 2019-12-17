import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();
        System.out.println("1-Circle || 2-TriAngle || 3-RectAngle : ");
        int input = sc.nextInt();

        if(input == 1){
            System.out.println("Enter Radius : ");
            double r = sc.nextDouble();
            System.out.println("the area of circle is "+area.findArea(r));
        }
        else if(input == 2){
            System.out.println("Enter base and height : ");
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println("the area of Triangle is "+area.findArea(0.5,b,h));
        }
        else if(input == 3){
            System.out.println("Enter height and width : ");
            double h = sc.nextDouble();
            double w = sc.nextDouble();
            System.out.println("the area of RectAngle is "+area.findArea(h,w));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
