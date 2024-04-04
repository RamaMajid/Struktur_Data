package Grafkom;

public class DDA {
    public static void drawLine(Point A, Point B) {
        int dx = B.getX() - A.getX();
        int dy = B.getY() - A.getY();

        int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);

        float xIncrement = dx / (float) steps;
        float yIncrement = dy / (float) steps;

        float x = A.getX();
        float y = A.getY();

        for (int i = 0; i <= steps; i++) {
            System.out.println(Math.round(x) + "," + Math.round(y) + " ");
            x += xIncrement;
            y += yIncrement;
        }
    }
}

