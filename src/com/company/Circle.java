package com.company;

public class Circle {
    public double R;

    public Circle(double R) {
        this.R=R;
    }

    public double CircleS() {
        return Math.PI * Math.pow(R,2);
}

    public double CircleL() {
        return 2*Math.PI*R;
    }
}
