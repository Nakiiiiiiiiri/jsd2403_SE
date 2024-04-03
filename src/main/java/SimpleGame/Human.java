package SimpleGame;
//Saber Lancer Caster Assassin Rider Berserker Archer
public abstract class Human {
    String name;
    int ad = 10;
    int ap = 10;
    int hp = 10;
    int mp = 10;
    int def = 10;
    int spd = 10;
    int level = 1;
    Human(){}

    public Human(String name, int ad, int ap, int hp, int mp, int def, int spd, int level) {
        this.name = name;
        this.ad = ad;
        this.ap = ap;
        this.hp = hp;
        this.mp = mp;
        this.def = def;
        this.spd = spd;
        this.level = level;
    }
     int total(){
        int point =(ad*def+ap*mp)*hp*spd;
        return point;
    }
}


