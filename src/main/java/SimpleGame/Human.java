package SimpleGame;

public abstract class Human {
    String name;
    int ad;
    int ap;
    int hp;
    int mp;
    int def;
    int spd;
    int level;
    Human(){}

    public Human(String name, int ad, int ap, int hp, int mp, int level) {
        this.name = name;
        this.ad = ad;
        this.ap = ap;
        this.hp = hp;
        this.mp = mp;
        this.def = def;
        this.level = level;
        this.spd = spd;
    }
}


