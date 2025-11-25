package it.game.pianoforte;
import com.raylib.Raylib.Color;

public class Tasto {
    private String nota;
    private boolean premuto;
    private Color colorePremuto;
    private Color coloreNormale;
    private int WIDTH;
    private int HEIGHT;

    public Tasto(String nota, boolean premuto, Color colorePremuto, Color coloreNormale, int WIDTH, int HEIGHT) {
        this.nota = nota;
        this.premuto = premuto;
        this.colorePremuto = colorePremuto;
        this.coloreNormale = coloreNormale;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isPremuto() {
        return premuto;
    }

    public void setPremuto(boolean premuto) {
        this.premuto = premuto;
    }

    public Color getColorePremuto() {
        return colorePremuto;
    }

    public void setColorePremuto(Color colorePremuto) {
        this.colorePremuto = colorePremuto;
    }

    public Color getColoreNormale() {
        return coloreNormale;
    }

    public void setColoreNormale(Color coloreNormale) {
        this.coloreNormale = coloreNormale;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}
