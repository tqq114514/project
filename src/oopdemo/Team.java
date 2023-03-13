package oopdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 团队类
 */
public class Team {
    List<Role> roles = new ArrayList<>();
    //添加角色的方法
    public void addRole(Role role){
        if(roles == null){
            System.out.println("没有对应的战队");
            return;
        }
        roles.add(role);
    }
    //查看角色的方法
    public void selectRole(){
        for (Role role : roles){
            System.out.println(role);
        }
    }
    //计算团队所有成员一次攻击的伤害总和
    public int getSumKill(){
        int sumResult = 0;
        for (Role role : roles){
            if (role != null){
                sumResult += role.attack();
            }
        }
        return sumResult;
    }

}
