package it.game.pianoforte;
import com.raylib.Colors;

public class Tasto {
    private String nota;
    private boolean premuto;
    private Colors colorePremuto;
    private Colors coloreNormale;
    private int WIDTH;
    private int HEIGHT;

    public Tasto(String nota, boolean premuto, Colors colorePremuto, Colors coloreNormale, int WIDTH, int HEIGHT) {
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

    public Colors getColorePremuto() {
        return colorePremuto;
    }

    public void setColorePremuto(Colors colorePremuto) {
        this.colorePremuto = colorePremuto;
    }

    public Colors getColoreNormale() {
        return coloreNormale;
    }

    public void setColoreNormale(Colors coloreNormale) {
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
