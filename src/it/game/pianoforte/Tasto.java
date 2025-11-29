package it.game.pianoforte;
import com.raylib.Colors;
import com.raylib.Raylib;
import com.raylib.Raylib.Color;

public class Tasto {
    private String nota;
    private boolean premuto;
    private Color colorePremuto;
    private Color coloreNormale;
    private int width;
    private int height;
    public void setPremuto(boolean premuto) {
        this.premuto = premuto;
    }
    public void setColoreNormale(Color coloreNormale) {
        this.coloreNormale = coloreNormale;
    }
    public void setColorePremuto(Color colorePremuto) {
        this.colorePremuto = colorePremuto;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void render(int x, int y) {
        Color colore = premuto ? colorePremuto : coloreNormale;
        Raylib.DrawRectangle(x, y, width, height, colore);
        Raylib.DrawRectangleLines(x, y, width, height, Colors.BLACK);
    }
}
