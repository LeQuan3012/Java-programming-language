
package lab04;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle x = new MyTriangle(new MyPoint(-1,1), new MyPoint(3,1), new MyPoint(2,4));
        MyTriangle y = new MyTriangle(-5,-1,-1,4,3,2);
        System.out.println(x);
        System.out.println(y);
        System.out.println("Chu vi tam giac x: " + x.getPerimeter());
        System.out.println("Chu vi tam giac y: " + y.getPerimeter());
    }
}
