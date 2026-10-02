public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();

        Shape cc = new Circle();
        cc.draw();

        Ract r = new Ract();
        r.draw();

        doDrawingStuff(r);
    }
    //upcasting
    public static void doDrawingStuff(Shape s) {
        s.draw();
    }
}