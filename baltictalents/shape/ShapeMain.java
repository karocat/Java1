package lt.baltictalents.shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(4, 6);

        Shape circle = new Circle(1);
        Circle circle2 = new Circle(2);

        ShapePolymoTest test = new ShapePolymoTest();

        test.printArea(rectangle);
        test.printArea(rectangle2);

        test.printArea(circle);
        test.printArea(circle2);
    }
}
