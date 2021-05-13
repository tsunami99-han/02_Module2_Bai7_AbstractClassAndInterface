package shape.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circless=new Circle[3];
        circless[0]=new Circle(10);
        circless[1]=new Circle(20);
        circless[2]=new Circle(30);

//        Circle circle = new Circle();
//        System.out.println(circle);
//        System.out.println("Area is: "+circle.getArea());
//        System.out.println("Perimeter is: "+circle.getPerimeter());
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        System.out.println("Area is: "+circle.getArea());
//        System.out.println("Perimeter is: "+circle.getPerimeter());
//
//        circle = new Circle( 3.5,"indigo", false);
//        System.out.println(circle);
//        System.out.println("Area is: "+circle.getArea());
//        System.out.println("Perimeter is: "+circle.getPerimeter());
        for(Circle a:circless){
            System.out.println(a.reSize((int)Math.round(Math.random()*99)+1));
        }

    }

}