package designpattern;

public class Point {
    private double X = Math.random() * 20 + 5;;
    private double Y = Math.random() * 20 + 5;;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
