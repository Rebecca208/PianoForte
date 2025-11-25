import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

public class Main {
    static int WIDTH = 800;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        InitWindow(WIDTH, HEIGHT, "Snake");
        SetTargetFPS(60);

        while (!WindowShouldClose()) {
            BeginDrawing();
            ClearBackground(WHITE);
            EndDrawing();
        }
        CloseWindow();
    }
}
