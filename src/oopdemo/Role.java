package oopdemo;

/**
 * 角色父类
 */
public abstract class Role {
    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    //攻击行为
    abstract int  attack();

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
