package resize;

import shape.circle.Circle;


public class CircleTestReSize {
    public static void main(String[] args) {
        Circle[] o=new Circle[3];
        o[0]=new Circle(10);
        o[1]=new Circle(20);
        o[2]=new Circle(30);
        System.out.println("Pre-resize:");
        for (Circle circle : o) {
            System.out.println("r= "+circle.getRadius());
            System.out.println("perimeter= "+circle.getPerimeter());
        }
        System.out.println("After-resize:");
        for (Circle circle : o) {
            System.out.println("r= "+circle.reSize((double) Math.round(Math.random()*99)+1));
            System.out.println("perimeter= "+circle.getPerimeter());
        }
    }
}
