public class Square extends Rectangle {
    private double side = 1.0;

    public Square (double s, String c, boolean f){
        super(s,s,c,f);
        side = s; 
    }
    public double getSide() {
        return side;
    }
    public void setSide(double s) {
        side = s;
        setWidth(s);
        setLength(s);
    }
    @Override
    public void setWidth(double w){
        super.setWidth(w);
        super.setLength(w);
    }
    @Override
    public void setLength(double l){
        super.setLength(l);
        super.setWidth(l);
    }
    @Override
    public String toString(){
     return "Square[" + "square[" + super.toString() + ", width = "+ getWidth()+", length ="+ getLength()+ "]"+ "]";
    }
}
