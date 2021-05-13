package resize;

import comparable.ComparableCircle;
import shape.rectangle.Rectangle;

import java.util.Arrays;

public class RectangleTestReSize {
    public static void main(String[] args) {
        Rectangle[] a=new Rectangle[3];
        a[0]=new Rectangle(10,20);
        a[1]=new Rectangle(15,30);
        a[2]=new Rectangle(20,25);
        System.out.println("Pre-resize:");
        for (Rectangle rect : a) {
            System.out.println("Area="+rect.getArea());
        }

        System.out.println("After-sorted:");
        for (Rectangle rect : a) {
            rect.reSize((double) Math.round(Math.random()*99)+1);
            System.out.println("Area="+rect.getArea());
        }
    }
}
