import java.util.Scanner;
import java.lang.Math;

class Point {
    double x, y;
    Point(double x, double y) { this.x = x; this.y = y; }
}
class Line implements Comparable<Line> {
    Point start, end;
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    double length() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        return Math.abs(this.length() - ((Line)obj).length()) < 1e-9;
    }
    public int compareTo(Line other) {
        double diff = this.length() - other.length();
        return (Math.abs(diff) < 1e-9) ? 0 : (diff < 0 ? -1 : 1);
    }
    public String toString() {
        return String.format("Length=%.3f", length());
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Line 1 -  x1 y1: "); 
        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.print("Line 1 - x2 y2: "); 
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
        Line line1 = new Line(p1, p2);
        System.out.print("Line 2 - x1 y1: "); 
        Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.print("Line 2 - x2 y2: "); 
        Point p4 = new Point(sc.nextDouble(), sc.nextDouble());
        Line line2 = new Line(p3, p4);
        
        System.out.println("\nLine1: " + line1);
        System.out.println("Line2: " + line2);
        System.out.println("Equal? " + line1.equals(line2));
        int compare = line1.compareTo(line2);
        if (compare == 0) System.out.println("Lines equal");
        else System.out.println("Line1 is " + (compare < 0 ? "shorter" : "longer") + " than Line2");
        
        sc.close();
    }
}

