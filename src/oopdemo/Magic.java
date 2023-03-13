package oopdemo;

public class Magic extends Role{
    //TODO 法师武器的属性
    private MagicWeapon magicWeapon;

    public MagicWeapon getMagicWeapon() {
        return magicWeapon;
    }

    public void setMagicWeapon(MagicWeapon magicWeapon) {
        this.magicWeapon = magicWeapon;
    }

    //该方法是法师装配武器之后一次攻击的伤害方法
    @Override
    int attack() {
        if(magicWeapon == null)
            return getLevel();
        return getLevel()+magicWeapon.kill();
    }

    @Override
    public String toString() {
        return "Magic{" +
                "magicWeapon=" + magicWeapon +
                '}';
    }
}
