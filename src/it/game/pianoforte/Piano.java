package it.game.pianoforte;
import com.raylib.Raylib;
import static com.raylib.Raylib.*;

public class Piano {
    private Tastiera tastiera;
    private PianoRenderer renderer;
    private InputHandler inputHandler;

    public void inizializza() {
        tastiera = new Tastiera(24);
        renderer = new PianoRenderer();
        inputHandler = new InputHandler();
        renderer.inizializzaFinestra(800, 600, "PianoForte");
    }

    public void aggiorna() {
        inputHandler.leggiEventi();
        inputHandler.aggiornaStato(tastiera);
    }

    public void render() {
        BeginDrawing();
        ClearBackground(RAYWHITE);
        renderer.disegnaPiano(tastiera);
        EndDrawing();
    }

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.inizializza();

        while (!WindowShouldClose()) {
            piano.aggiorna();
            piano.render();
        }

        CloseWindow();
    }
}
