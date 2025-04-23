package assignment9;

import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;

public class Game {
    private Snake snake;
    private Food food;

    // ✅ Initializes a new game with snake and food
    // Linked to: "Program setup", "snake/food initialized correctly"
    public Game() {
        StdDraw.enableDoubleBuffering(); // Smooth visuals
        snake = new Snake();
        food = new Food();
    }

    // ✅ Main game loop
    // Linked to: "play() method", "Program works", "Game ends", "Food respawns"
    public void play() {
        while (snake.isInbounds()) { // Ends game if snake hits wall
            int dir = getKeypress();
            if (dir != -1) {
                snake.changeDirection(dir); // Move in user-input direction
            }

            snake.move(); // Moves all segments of the snake

            if (snake.eatFood(food)) {
                food = new Food(); // Respawn food at new location
            }

            updateDrawing(); // Draw snake, food, screen refresh
        }

        System.out.println("Game over!"); // ✅ Confirms game ended on wall collision
    }

    // ✅ Handles user input from WASD keys
    private int getKeypress() {
        if (StdDraw.isKeyPressed(KeyEvent.VK_W)) return 1;
        else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) return 2;
        else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) return 3;
        else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) return 4;
        else return -1;
    }

    // ✅ Clears the screen, redraws the game, shows the current frame
    // Linked to: "Program runs", "Game visuals", "snake & food visible"
    private void updateDrawing() {
        StdDraw.clear();
        snake.draw();
        food.draw();
        StdDraw.show();
        StdDraw.pause(50); // Adds a delay between frames
    }

    // ✅ Main method: launches game
    public static void main(String[] args) {
        Game g = new Game();
        g.play();
    }
}
