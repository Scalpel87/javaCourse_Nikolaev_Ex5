package entity;

public class Blonde extends Girl{
    protected String hairColor = "блондинка";
    public int mind;
    private int beauty;
    int sociability;

    @Override
    public String toString() {
        return "Я " + hairColor + ". Ум " + mind + ". Красота " + beauty + ". Общительность " + sociability + ".";
    }

    public Blonde() {
        this.mind = -1;
        this.beauty = -1;
        this.sociability = -1;
    }

    public Blonde(int mind, int beauty, int sociability) {
        this.mind = mind;
        this.beauty = beauty;
        this.sociability = sociability;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }

    public int getSociability() {
        return sociability;
    }

    public void setSociability(int sociability) {
        this.sociability = sociability;
    }
}
