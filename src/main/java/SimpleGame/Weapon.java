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
    void spd_plus();

}
interface Lance extends Weapon{
    void ad_plus();
    @Override
    void hp_plus();
    void def_plus();
    void spd_plus();
}
interface Knfie extends Weapon{
    void ad_plus();
    @Override
    void hp_plus();
    void def_plus();
    void spd_plus();
}
interface Bow extends Weapon{
    void ad_plus();
    @Override
    void hp_plus();
    void def_plus();
    void spd_plus();
}
interface Car extends Weapon{
    @Override
    void hp_plus();
    void spd_plus();
}


