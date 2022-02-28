package entity;

public class Ginger extends Girl{
    final String hairColor = "рыжая";
    int mind;
    public int beauty;
    private int sociability;

    @Override
    public String toString() {
        return "Я " + hairColor + ". Ум " + mind + ". Красота " + beauty + ". Общительность " + sociability + ".";
    }

    public Ginger() {
        this.mind = -1;
        this.beauty = -1;
        this.sociability = -1;
    }

    public Ginger(int mind, int beauty, int sociability) {
        this.mind = mind;
        this.beauty = beauty;
        this.sociability = sociability;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
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

    public int getSociability() {
        return sociability;
    }

    public void setSociability(int sociability) {
        this.sociability = sociability;
    }
}
