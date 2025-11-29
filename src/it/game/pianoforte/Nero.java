// Java
package it.game.pianoforte;
import com.raylib.Colors;
public class Nero extends Tasto {
    public Nero() {
        setColoreNormale(Colors.RAYWHITE);
        setColorePremuto(Colors.LIGHTGRAY);
        setWidth(30);
        setHeight(180);
    }
}