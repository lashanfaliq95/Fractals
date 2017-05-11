


public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public static double getAbsolute(Complex a) {
        return Math.sqrt(a.getReal() * a.getReal() + a.getImaginary() * a.getImaginary());
    }

    public static Complex add(Complex a, Complex b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new Complex(real, imaginary);
    }

    public static Complex sqr(Complex a) {
        double real = a.getReal() * a.getReal() - a.getImaginary() * a.getImaginary();
        double imaginary = 2 * a.getImaginary() * a.getReal();
        return new Complex(real, imaginary);
    }
}
