package shape.square;

import colorable.Colorable;
import shape.Shape;

public class Square extends Shape implements Colorable {
    private int size;

    public Square() {
        this.size = 1;
    }

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String howToColor() {
        return " Color all four sides";
    }
}
