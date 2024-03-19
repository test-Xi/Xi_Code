package SelfStudy;

import java.util.Random;

public class Role{
    private String name ;
    private int blood;

    public Role(){}

    public Role(String name , int blood){
        setName(name);
        setBlood(blood);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    public String getName(){
        return name;
    }

    public int getBlood(){
        return blood;
    }

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        int remainBlood = role.getBlood() - hurt;
        remainBlood  = remainBlood > 0? remainBlood : 0;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "用拳头打了" + role.getName()+"一下，造成了"+hurt+"的伤害。"+role.getName() +
                "还剩下"+remainBlood+"的血量！");
    }

}