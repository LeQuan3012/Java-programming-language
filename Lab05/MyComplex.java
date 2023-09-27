package Lab05;

public class MyComplex {

    private double real, imag;

    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        return this.real == 0;
    }

    public boolean isImaginary() {
        return this.imag == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(this.imag * this.imag + this.real * this.real);
    }

    public double argumentInRadians() {
        return Math.atan2(imag, real);
    }

    public int argumentInDegree() {
        double radians = Math.atan2(imag, real);
        return (int) Math.toDegrees(radians);
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }

    public MyComplex add(MyComplex another) {
        double thuc = this.real + another.real;
        double ao = this.imag + another.imag;
        return new MyComplex(thuc, ao);
    }

    public MyComplex substract(MyComplex another) {
        double thuc = this.real - another.real;
        double ao = this.imag - another.imag;
        return new MyComplex(thuc, ao);
    }

    public MyComplex multiplyWith(MyComplex another) {
        double thuc = (this.real * another.real) - (this.imag * another.imag);
        double ao = (this.real * another.imag) + (this.imag * another.real);
        return new MyComplex(thuc, ao);
    }

    public MyComplex divideBy(MyComplex another) {
        MyComplex conjugateAnother = another.conjugate();
        double divisor = another.magnitude() * another.magnitude();
        double thuc = (this.real * conjugateAnother.real - this.imag * conjugateAnother.imag) / divisor;
        double ao = (this.imag * conjugateAnother.real + this.real * conjugateAnother.imag) / divisor;
        return new MyComplex(thuc, ao);
    }

}
