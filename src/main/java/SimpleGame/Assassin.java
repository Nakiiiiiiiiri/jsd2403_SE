package SimpleGame;

public class Assassin extends Human implements Knfie {
    public Assassin() {
    }

    public Assassin(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void ad_plus() {
        ad+=10;
    }

    @Override
    public void hp_plus() {
        hp+=0;
    }

    @Override
    public void def_plus() {
        def+=5;
    }

    @Override
    public void spd_plus() {
        spd+=20;
    }
}
