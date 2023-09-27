
package lab04;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle x = new MyCircle(new MyPoint(1,1),2);
        
        System.out.println("Lay gia tri raidus = " + x.getRadius());
        x.setRadius(3);
        System.out.println("Gia tri radius sau khi sua = " + x.getRadius());
        System.out.println("Lay gia tri center: "+ x.getCenter());
        x.setCenter(new MyPoint(2,2));
        System.out.println("Gia tri center sau khi sua: "+ x.getCenter());
        System.out.println("Gia tri center x: "+x.getCenterX());
        System.out.println("Gia tri center y: "+x.getCenterY());
        x.setCenterXY(4, 4);
        System.out.println("Gia tri center sau khi sua: "+ x.getCenter());
        System.out.println("Gia tri: "+x);
        System.out.println("Dien tich: "+ x.getArea());
        
        
        
    }
}
