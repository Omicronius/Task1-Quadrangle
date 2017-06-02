package com.epam.training.klimov.quadrangle.entity;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Quadrangle extends ObservableShape {
    private long id;
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    ArrayList<Observer> observers;

    public Quadrangle(long id, Point a, Point b, Point c, Point d) {
        super(id);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public long getId() {
        return id;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
        notifyObservers();
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
        notifyObservers();
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
        notifyObservers();
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadrangle that = (Quadrangle) o;

        if (id != that.id) return false;
        if (a != null ? !a.equals(that.a) : that.a != null) return false;
        if (b != null ? !b.equals(that.b) : that.b != null) return false;
        if (c != null ? !c.equals(that.c) : that.c != null) return false;
        if (d != null ? !d.equals(that.d) : that.d != null) return false;
        return observers != null ? observers.equals(that.observers) : that.observers == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (d != null ? d.hashCode() : 0);
        result = 31 * result + (observers != null ? observers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "id=" + id +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", observers=" + observers +
                '}';
    }
}
