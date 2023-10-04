public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5.0,"pink", true );
        System.out.println("Circle");
        System.out.println(circle.toString());
        System.out.println("Area: "+ circle.getArea());
        System.out.println("Perimeter: "+ circle.getPerimeter());
        System.out.println();
    
        Rectangle rectangle = new Rectangle(4.0, 3.5, "blue", false);
        System.out.println("Rectangle");
        System.out.println(rectangle.toString());
        System.out.println("Area: "+ rectangle.getArea());
        System.out.println("Perimeter:"+ rectangle.getPerimeter());
        System.out.println();
    
        Square square = new Square(2, "green", true);
        System.out.println("Square");
        System.out.println(square.toString());
        System.out.println("area: "+ square.getArea());
        System.out.println("perimeter: "+ square.getPerimeter());
    }
}
