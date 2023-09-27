
package Lab05;


public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex num1 = new MyComplex(1.1,2.2);
        MyComplex num2 = new MyComplex(3.3,4.4);
        
        System.out.println("Number 1 is: "+num1);
        System.out.println(num1+" "+num1.isReal());
        System.out.println(num1+" "+num1.isImaginary());
        
        System.out.println("\nNumber 2 is: "+num2);
        System.out.println(num2+" "+num2.isReal());
        System.out.println(num2+" "+num2.isImaginary());
        
        System.out.println(num1 +" equal to "+num2+ num2.equals(num1));
        System.out.println(num1+" + "+num2+" = "+num1.add(num2));
        System.out.println(num1+" - "+num2+" = "+num1.substract(num2));
        System.out.println(num1+" * "+num2+" = "+num1.multiplyWith(num2));
        System.out.println(num1+" + "+num2+" = "+num1.divideBy(num2));
    }
}
