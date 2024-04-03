package SimpleGame;

public class Caster extends Human implements Stick {
    public Caster() {
    }

    public Caster(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        super(name, ad, ap, hp, mp, def, spd, level);
    }

    @Override
    public void ap_plus() {
        ap += 20;
    }

    @Override
    public void mp_plus() {
        mp += 20;
    }

    @Override
    public void hp_plus() {
        hp += 10;
    }

    @Override
    public void spd_plus() {
        spd -= 10;
    }
}
