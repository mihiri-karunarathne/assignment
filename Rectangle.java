public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double w, double l, String c, boolean f){
       super(c, f);
        width = w;
        length = l;   
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        length = l;
    }
    public double getArea(){
       return length *width;
    }
    public double getPerimeter(){
     return ((length *2) + (width * 2));
    }
    public String toString(){
        return "Rectangle [ Shape [ color ="+getColor()+", filled = "+isFilled()+"] , width = "+width+", length = "+length+ "]" ;
    }
}
