package SimpleGame;

public class Rider extends Human implements Car, Sword {
    public Rider() {
    }

    public Rider(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void ad_plus() {
        ad += 15;
    }

    @Override
    public void def_plus() {
        def += 15;
    }

    @Override
    public void hp_plus() {
        hp += 20;
    }

    @Override
    public void spd_plus() {
        spd += 20;
    }
}
