package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    // 1) distance() → (0,0) noktasına uzaklık
    public double distance(){
        return Math.sqrt((x * x) + (y * y));
    }

    // 2) distance(Point p) → başka bir Point'e uzaklık
    public double distance(Point p){
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 3) distance(int a, int b) → (a,b) noktasına uzaklık
    public double distance(int a, int b){
        int dx = this.x - a;
        int dy = this.y - b;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
