package SimpleGame;

public class Saber extends Human implements Sword {
    public Saber() {
    }

    public Saber(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void ad_plus() {
        ad += 20;
    }

    @Override
    public void hp_plus() {
        hp += 25;
    }

    @Override
    public void def_plus() {
        def += 25;
    }

    @Override
    public void spd_plus() {
        spd += 10;
    }
}

