
package lab04;


public class MyTriangle {
    private MyPoint v1,v2,v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3,y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public String toString(){
        return "Triangle @"+this.v1+","+this.v2+","+ this.v3;
    }
    
    public double getPerimeter(){
        double v12 = v1.distance(v2);
        double v23 = v2.distance(v3);
        double v31 = v3.distance(v1);
        return (v12 + v23 + v31);
    }
    
    public String printType(){
        double v12 = v1.distance(v2);
        double v23 = v2.distance(v3);
        double v31 = v3.distance(v1);
        
        if(v12 == v23 && v23 == v31){
            return "equilateral";
        }
        else if(v12 == v23 || v23 == v31 || v31 == v12){
            return "isosceles";
        }
        else{
            return "scalene";
        }
    }
}
