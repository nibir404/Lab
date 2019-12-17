public class Complex {
    int real,imaginary;
    Complex(){

    }
    Complex(int tempReal, int tempImg){
        real = tempReal;
        imaginary = tempImg;
    }
    Complex addcomp(Complex c1,Complex c2){
        Complex temp = new Complex();
        temp.real=c1.real+c2.real;
        temp.imaginary=c1.imaginary+c2.imaginary;
        return temp;
    }
}
