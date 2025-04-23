package assignment9;

import java.awt.Color;
import java.util.Random;

public class ColorUtils {

    // ✅ Generates a random solid RGB color
    // Linked to: Creative portion (snake has colorful segments)
    public static Color solidColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    // Optional transparency utility (unused)
    private static Color transparent(Color c) {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return new Color(r, g, b, 64);
    }

    // ✅ Provides transparent version of a solid color
    public static Color transparentColor() {
        return transparent(solidColor());
    }
}
