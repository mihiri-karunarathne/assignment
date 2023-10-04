 abstract class Shape {
 protected String color = "red";
   protected Boolean filled = true;

  public Shape(String c, boolean f){
    color =c;
    filled = f;
   }
   public String getColor() {
       return color;
   }
   public void setColor(String c) {
       color = c;
   }
   boolean isFilled(){
     return filled;
   }
   public void setFilled(Boolean f) {
       filled = f;
   }
   public abstract double getArea();
   public abstract double getPerimeter();
   
   @Override
    public String toString(){
      return "Shape[color ="+color+", filled = "+filled+ "]";
    }
 }