package oopdemo;
/**
 * 战士类
 */
public class Solider extends Role {

    //TODO 战士武器属性
    private SoliderWeapon soliderWeapon;

    public SoliderWeapon getSoliderWeapon() {
        return soliderWeapon;
    }

    public void setSoliderWeapon(SoliderWeapon soliderWeapon) {
        this.soliderWeapon = soliderWeapon;
    }

    //该行为是战士一次攻击的伤害方法
    @Override
    int attack() {
        if(soliderWeapon == null)
            return super.getLevel();
        return super.getLevel()+soliderWeapon.kill();
    }

    @Override
    public String toString() {
        return "Solider{" +
                "soliderWeapon=" + soliderWeapon +
                '}';
    }
}
