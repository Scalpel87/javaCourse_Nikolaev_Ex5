package entity;

public class Brunette extends Girl{
    protected String hairColor = "брюнетка";
    int mind;
    private int beauty;
    public int sociability;

    @Override
    public String toString() {
        return "Я " + hairColor + ". Ум " + mind + ". Красота " + beauty + ". Общительность " + sociability + ".";
    }

    public Brunette() {
        this.mind = -1;
        this.beauty = -1;
        this.sociability = -1;
    }

    public Brunette(int mind, int beauty, int sociability) {
        this.mind = mind;
        this.beauty = beauty;
        this.sociability = sociability;
    }

    public int getSociability() {
        return sociability;
    }

    public void setSociability(int sociability) {
        this.sociability = sociability;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }
}
