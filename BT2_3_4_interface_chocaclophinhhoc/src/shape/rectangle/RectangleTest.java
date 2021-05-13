package shape.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        System.out.println("Area is: "+rectangle.getArea());
//        System.out.println("Perimeter is: "+rectangle.getPerimeter());
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        System.out.println("Area is: "+rectangle.getArea());
//        System.out.println("Perimeter is: "+rectangle.getPerimeter());

        rectangle = new Rectangle("orange", true,10,20);
        System.out.println(rectangle);
        System.out.println("Area is: "+rectangle.getArea());
        System.out.println("Perimeter is: "+rectangle.getPerimeter());
        rectangle.reSize(20);
        System.out.println(rectangle.getPerimeter());
    }

}
