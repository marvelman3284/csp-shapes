package shah.jeevan;

public class Main {
    public static Turtle t = new Turtle();

    public static void main(String[] args) {
        // write your code here
        square(t, 200);
        triangle(t, 200);
        wait(5000);
        t.clear();
        hexagon(t, 200);
        wait(5000);
        t.clear();
        initals(t);
        t.speed(1);
        rose(t, 100, 5);
        spiral(t);
        spiderweb(t);
        pinwheel(t, 5);
    }


    private static void wait(int t) {
        try {
            Thread.sleep(t);
        } catch (Exception e) {
            System.out.println("Caught Exception:" + e);
        }
    }
    private static void square(Turtle t, int sidelength) {
        t.up();
        t.setPosition(0, 0);
        t.down();
        for (int i = 0; i < 4; i++) {
            t.forward(sidelength);
            t.right(90);
        }
        wait(5000);
        t.clear();
    }

    private static void triangle(Turtle t, int sidelength) {
        for (int i = 0; i < 3; i++) {
            t.forward(sidelength);
            t.right(120);
        }
    }

    private static void hexagon(Turtle t, int sidelength) {
        for (int i = 0; i < 6; i++) {
            triangle(t, sidelength);
            t.right(60);
        }
    }

    private static void rose(Turtle t, int a, int n) {
        double theta = 0;
        t.up();
        for (int i = 0; i<360; i++){
            double radians = Math.toRadians(theta);
            t.setPosition(0, 0, theta);
            long move = (long)(a * (Math.cos((n * radians))));
            t.forward(move);
            t.dot();
            theta += 1;
        }
        wait(2000);
        t.clear();
    }

    private static void spiral(Turtle t) {
        t.up();
        t.setPosition(0, 0);
        t.down();
        for (int i = 0; i < 150; i += 1) {
            t.forward(i);
            t.right(70);
        }
        wait(5000);
        t.clear();
    }

    private static void initals(Turtle t) {
        t.up();
        t.setPosition(0, 0);
        t.down();
        t.face(0, -100);
        t.forward(200);
        t.setPosition(-100, -200, 90);
        t.forward(50);
        t.up();
        t.setPosition(100, -200);
        t.down();
        t.right(90);
        t.forward(75);
        t.left(90);
        t.forward(75);
        t.left(90);
        t.forward(75);
        t.right(90);
        t.forward(75);
        t.right(90);
        t.forward(75);
        wait(5000);
        t.clear();
    }

    private static void spiderweb(Turtle t) {
        int sidelength = 0;
        for (int i = 0; i < 5; i++) {
            sidelength += 15;
            hexagon(t, sidelength);
        }
        wait(5000);
        t.clear();
    }

    private static void pins(Turtle t, int pincount, int length) {
        for (int i = 0; i < pincount; i++) {
            triangle(t, length);
            long turn = 360 / pincount;
            t.right(turn);
        }
    }

    private static void pinwheel(Turtle t, int count) {
        int sidelength = 0;
        for (int i = 0; i < 25; i++) {
            sidelength += 4;
            pins(t, count, sidelength);
        }
    }
}