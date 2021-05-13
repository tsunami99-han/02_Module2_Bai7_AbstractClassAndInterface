package colorable;

import shape.Shape;
import shape.circle.Circle;
import shape.rectangle.Rectangle;
import shape.square.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(10);
        arr[1] = new Square(10);
        arr[2] = new Rectangle(20, 30);
        for (Shape a : arr) {
            if (a instanceof Square) {
                System.out.println(((Square) a).howToColor());;
            }
        }
    }
}
