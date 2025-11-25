package it.game.pianoforte;
import com.raylib.Colors;
import com.raylib.Raylib.Color;

public class Negro extends Tasto{
    public Negro(String nota, boolean premuto, Color colorePremuto, Color coloreNormale, int WIDTH, int HEIGHT, Color colorePremuto1, Color coloreNormale1, int WIDTH1, int HEIGHT1) {
        super(nota, premuto, colorePremuto, coloreNormale, WIDTH, HEIGHT);
        setColorePremuto(Colors.GRAY);
        setColoreNormale(Colors.BLACK);
        setWIDTH(200);
        setHEIGHT(400);
    }
}
