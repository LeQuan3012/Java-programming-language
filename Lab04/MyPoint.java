
package lab04;

public class MyPoint {
    private int x,y;
    
    public MyPoint(){
        this.x = this.y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "("+x+", "+y+")";
    }
    
    public double distance(int x, int y){
        int xdis = this.x - x;
        int ydis = this.y - y;
        return Math.sqrt(xdis*xdis + ydis*ydis);
    }
    
    public double distance(MyPoint another){
        int xdis = this.x - another.x;
        int ydis = this.x - another.y;
        return Math.sqrt(xdis*xdis + ydis*ydis);
    }
    
    
}
