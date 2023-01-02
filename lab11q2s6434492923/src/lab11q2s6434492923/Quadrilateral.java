/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11q2s6434492923;

/**
 *
 * @author karn
 */
import java.awt.Point;
import static java.awt.geom.Point2D.distance;
import java.util.Arrays;
public abstract class Quadrilateral {
    private Point a, b, c, d;
    
    public Quadrilateral(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    
    public double[] getSortedDist() {
        double[] dis = new double[6];
        double wait;
        dis[0] = distance(a.getX(), a.getY(), b.getX(), b.getY());
        dis[1] = distance(b.getX(), b.getY(), c.getX(), c.getY());
        dis[2] = distance(c.getX(), c.getY(), d.getX(), d.getY());
        dis[3] = distance(d.getX(), d.getY(), a.getX(), a.getY());
        dis[4] = distance(b.getX(), b.getY(), d.getX(), d.getY());
        dis[5] = distance(c.getX(), c.getY(), a.getX(), a.getY());
        for (int i = 0; i < dis.length; i++) {
            for (int j = i+1; j < dis.length; j++) {
                if (dis[i] > dis[j]) {
                    wait = dis[i];
                    dis[i] = dis[j];
                    dis[j] = wait;
                }
            }
        }
        return dis;
    }
    
    @Override
    public String toString() {
        return (a+"\n"+b+"\n"+c+"\n"+d+"\n"+Arrays.toString(getSortedDist()));
    }
    
    public abstract double area();
}
/*double[] p = new double[6];
        p[0] = distance(a.getX(), a.getY(), b.getX(), b.getY());
        p[1] = distance(b.getX(), b.getY(), c.getX(), c.getY());
        p[2] = distance(c.getX(), c.getY(), d.getX(), d.getY());
        p[3] = distance(d.getX(), d.getY(), a.getX(), a.getY());
        p[4] = distance(a.getX(), a.getY(), c.getX(), c.getY());
        p[5] = distance(b.getX(), b.getY(), d.getX(), d.getY());
        double temp;
        for (int i = 0; i <= p.length; i++) {
            for (int j = i+1; j < p.length; j++) {
                if (p[i] > p [j]) {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        return p;*/