package entity;

public abstract class Girl {
    protected String hairColor;
    public int mind;
    private int beauty;
    int sociability;
    public String toString() {
        return "Я еще не определилась с цветом волос. Ум " + mind + ". Красота " + beauty + ". Общительность " + sociability + ".";
    }
}
