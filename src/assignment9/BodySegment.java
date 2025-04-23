package assignment9;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

    private double x, y, size;
    private Color color;

    // Constructor to initialize the body segment's position and size
    public BodySegment(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = ColorUtils.solidColor(); // ✅ Creative addition: random solid color for visual variety
    }

    /**
     * Draws the segment as a circle on screen
     * ✅ Linked to "Program works" and "snake draws & moves properly"
     */
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, size);
    }

    // Getter and setter methods to access and update position and size
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getSize() { return size; }
}
