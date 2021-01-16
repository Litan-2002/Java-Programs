public class litan8 {
     protected double l;
    litan8(double l){
        this.l = l;
    }
}
class square extends litan8{
    square(double l){
        super(l);
    }
    void area(){
        System.out.println("area of the square is ="+(l*l));
    }
}
class rectangle extends square {
    private double  b;
    rectangle (double l, double y){
        super(l);
        b=y;
    }

void area (){
    System.out.println("area of the rectangle is "+(l*b));
    }
}
class inherit {
    public static void main (String args[]){
        square s=new square(12);
        s.area();
        rectangle r =new rectangle(1.29,17);
        r.area();
    }
}