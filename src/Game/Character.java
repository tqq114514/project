package Game;

public abstract class Character {
    protected String name;  //名字
    protected int attackPower; //战斗值
    protected int live;  //生命值

    public Character(String name, int attackPower, int live) {
        this.name = name;
        this.attackPower = attackPower;
        this.live = live;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public abstract int attack(Character enemy);  //敌人间互相攻击

}
