package assignment9;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class Food {

    public static final double FOOD_SIZE = 0.02;
    private double x, y;

    // ✅ Creates food at a random position inside game bounds
    // Linked to: "Food respawns randomly", "snake eats and grows"
    public Food() {
        Random rand = new Random();
        x = FOOD_SIZE + (1 - 2 * FOOD_SIZE) * rand.nextDouble();
        y = FOOD_SIZE + (1 - 2 * FOOD_SIZE) * rand.nextDouble();
    }

    // ✅ Draws food as a red circle
    public void draw() {
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledCircle(x, y, FOOD_SIZE);
    }

    // ✅ Accessor methods used for collision detection
    public double getX() { return x; }
    public double getY() { return y; }
}
