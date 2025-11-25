package it.game.pianoforte;
import com.raylib.Colors;

public class Negro extends Tasto{
    public Negro(String nota, boolean premuto, Colors colorePremuto, Colors coloreNormale, int WIDTH, int HEIGHT, Colors colorePremuto1, Colors coloreNormale1, int WIDTH1, int HEIGHT1) {
        super(nota, premuto, colorePremuto, coloreNormale, WIDTH, HEIGHT);
        setColorePremuto(Colors.GRAY);
        setColoreNormale(Colors.BLACK);
        setWIDTH(200);
        setHEIGHT(400);
    }
}
