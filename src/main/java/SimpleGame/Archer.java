package SimpleGame;

public class Archer extends Human implements Bow, Knfie {
    public Archer() {
    }

    public Archer(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void def_plus() {
        def += 0;
    }

    @Override
    public void ad_plus() {
        ad += 20;
    }

    @Override
    public void hp_plus() {
        hp += 10;
    }

    @Override
    public void spd_plus() {
        spd+=5;
    }
}
