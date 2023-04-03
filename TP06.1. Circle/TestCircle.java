import java.text.DecimalFormat;
import java.text.NumberFormat;

class circle {
    Point center = new Point();
    Point p = new Point();
    circle(Point _center,Point _p){
        center = _center;
        p = _p;
    }

    double surface(){
        double r = p.distance(center); 
        double s = 3.14 * r * r;
        return s;
    }
    double radius(){
        double r = p.distance(center); 
        return r;
    }

    double length(){ //perimeter
        double r = radius(); 
        double result = 2 * r * 3.14;
        return result;
    }

}


class Point {
    int x;
    int y;
    Point(){
        this.x = 0 ;
        this.y = 0;
    }
    Point(int x){
        this.x = x;
        this.y = 0;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distance(Point anotherPoint){//ot jes te
        double d = Math.pow((anotherPoint.x - this.x),2) + Math.pow((anotherPoint.y - this.y),2);
        d = Math.sqrt(d);
        return d;

    }
}

public class TestCircle {
    public static void main(String[] args) {
        System.out.print("Testing Circle class: ");
        Point p1 = new Point(4,2);
        Point p2 = new Point(2,4);
        
        NumberFormat f = new DecimalFormat("#0.0000");
        System.out.println("\nLength = "+ f.format(new circle(p1, p2).length()));
        System.out.println("surface = "+ f.format(new circle(p1, p2).surface()));
        System.out.println("radius = "+ f.format(new circle(p1, p2).radius()));

    }
}

