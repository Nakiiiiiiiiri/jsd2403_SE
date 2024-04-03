package SimpleGame;

public class Lancer extends Human implements Lance {
    public Lancer() {
    }

    public Lancer(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void ad_plus() {
        ad += 15;
    }

    @Override
    public void hp_plus() {
        hp += 10;
    }

    @Override
    public void def_plus() {
        def += 10;
    }

    @Override
    public void spd_plus() {
        spd += 15;
    }
}
