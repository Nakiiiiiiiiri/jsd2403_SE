package SimpleGame;

public interface Weapon {
    abstract void hp_plus();

}
interface Sword extends Weapon{

    void ad_plus();
    @Override
    void hp_plus();
    void def_plus();
    void spd_plus();
}
interface Stick extends Weapon{
    void ap_plus();
    void mp_plus();
    @Override
    void hp_plus();

}
interface lance extends Weapon{
    void ad_plus();


    void hp_plus();
    void def_plus();
    void spd_plus();
}


