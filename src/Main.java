import entity.Blonde;
import entity.Brunette;
import entity.Ginger;

public class Main {
    public static void main(String[] args) {
        Blonde sveta = new Blonde(3, 5, 4);
        Brunette lena = new Brunette(5, 4, 3);
        Ginger kate = new Ginger(4, 3, 5);

        System.out.println("У нас есть девушки:\n" +
                sveta.toString() + "\n" +
                lena.toString() + "\n" +
                kate.toString() + "\n");
        System.out.println("Теперь " + sveta.getHairColor() + " пойдет учиться, " +
                lena.getHairColor() + " получит бокал вина, а " + kate.getHairColor() + " пойдет в салон красоты.");
        sveta.setMind(sveta.getMind() + 1);
        lena.setSociability(lena.getSociability() + 1);
        kate.setBeauty(kate.getBeauty() + 1);
        System.out.println("У нас теперь обновленные девушки:\n" +
                sveta.toString() + "\n" +
                lena.toString() + "\n" +
                kate.toString());
    }
}
