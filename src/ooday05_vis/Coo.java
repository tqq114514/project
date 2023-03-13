package ooday05_vis;

import ooday05.Aoo;

public class Coo {
    void show(){
        Aoo aoo = new Aoo();
        aoo.a = 1;
        //aoo.b = 2;  //protected 垮包不能访问
        //aoo.c = 3;  //默认权限不能垮包访问
        //aoo.d = 4;  //私有不能垮包访问
    }
    /*垮包继承*/
}
class Doo extends Aoo{   //垮包继承
    void show(){
        a= 1;
        b =2;  //protected可以访问子类
        /*c =3;*/
        /*d =4;*/
    }
}
