package Game;

public class Mage extends Character {
    //TODO 法师武器属性
    public Mage(String name, int attackPower, int live) {
        super(name, attackPower, live);
    }

    @Override
    public int attack(Character enemy) {
        System.out.println(name + " casts a magic missile at " + enemy.name + "!");
        enemy.live -= attackPower;
        return  0;
    }
}