package oopdemo;

/**
 * 机考题：
 *   游戏中有不同的角色(战士，法师），
 *   可以使用不同的武器（大刀，魔法球）并且能组成对应的团队，
 *   最终计算团队的战斗值？
 * 需求分析：
 *   1：不同的角色应该可以抽取一个父类， 包括属性：角色名称，等级信息等。
 *      包括行为：attack（）；
 *   2：不同的角色应该继承抽象父类，并且要实现角色本身应有特有属性
 *   3：武器应该用接口来进行实现，不同的武器应该有一个公共的武器接口。
 *   4：不同的角色应该拥有自己独有的武器类型，应该定义成接口传递给角色。
 *   5：不同的角色可以组成对应的战队，同事计算团队的战斗值。
 *
 * 技术栈：变量，数据类型，结构语句，数组（集合），
 * 封装，继承，多态，抽象类，接口
 */
public class OopTest{
    public static void main(String[] args) {

        //构建武器
        MagicBall mb = new MagicBall();//强引用
        SoliderWord sd = new SoliderWord();
        //构建角色
        Magic m1 = new Magic();
        m1.setName("壮壮");
        m1.setLevel(10);
        m1.setMagicWeapon(mb);//装配法师武器，痛苦棉球

        Solider s1= new Solider();
        s1.setName("葛二蛋");
        s1.setLevel(100);
        s1.setSoliderWeapon(sd);//装配战士武器，大宝剑

        Team team = new Team();
        team.addRole(m1);
        team.addRole(s1);


        System.out.println("法师一次攻击的伤害值是："+m1.attack());
        System.out.println("战士一次攻击的伤害值是："+s1.attack());
        System.out.println("达内战队一次伤害的总值是："+team.getSumKill());
    }
}
