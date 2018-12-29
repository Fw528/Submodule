package Creature;

import java.util.ArrayList;
import java.util.List;

public class Hululist {
    public List<Huluwa> HuluCollection= new ArrayList<Huluwa>();
    private Huluwa Red;
    private Huluwa Orrange;
    private Huluwa Yellow;
    private Huluwa Green;
    private Huluwa Cyan;
    private Huluwa Blue;
    private Huluwa Purple;
    private Huluwa Yeye;
    private void setInitposition(){ //
        /**
         * 以某种方式初始化葫芦娃的站位
         * 目测replay依旧可能需要？？
         * 没想好
         */
        Red.setPosition(1,1);
        Orrange.setPosition(1,2);
        Yellow.setPosition(1,3);
        Green.setPosition(1,4);
        Cyan.setPosition(1,5);
        Blue.setPosition(1,6);
        Purple.setPosition(1,7);
        Yeye.setPosition(0,4);  //爷爷当然不都打前锋啊

    }
    public void huluinit(){


        Red.setImage("1.png");
        Red.setName("大娃");
        Red.setBlood(6);
        Red.setForce(10);  //大娃力大无穷因此高攻击

        Orrange.setImage("2.png");
        Orrange.setName("二娃");
        Orrange.setBlood(8);
        Orrange.setForce(6); //千里眼二娃不是攻击系的因此force较少

        Yellow.setImage("3.png");
        Yellow.setName("三娃");
        Yellow.setBlood(12);
        Yellow.setForce(4);  //三娃刀枪不入 因此血最厚

        Green.setImage("4.png");
        Green.setName("四娃");
        Green.setBlood(6);
        Green.setForce(10);  //四娃火系高攻击选手

        Cyan.setImage("5.png");
        Cyan.setName("五娃");
        Cyan.setBlood(8);
        Cyan.setForce(8);  //五娃水系平衡选手

        Blue.setImage("6.png");
        Blue.setName("六娃");
        Blue.setBlood(8);
        Blue.setForce(8);  //六娃特质系平衡选手

        Purple.setImage("7.png");
        Purple.setName("七娃");
        Purple.setBlood(8);
        Purple.setForce(10);  //七娃特质系高攻击选手

        Yeye.setImage("yeye.png");
        Yeye.setName("爷爷");
        Yeye.setBlood(8);
        Yeye.setForce(2);  //爷爷就是个吉祥物

        setInitposition();  //位置的初始化

        HuluCollection.add(Red);
        HuluCollection.add(Orrange);
        HuluCollection.add(Yellow);
        HuluCollection.add(Green);
        HuluCollection.add(Cyan);
        HuluCollection.add(Blue);
        HuluCollection.add(Purple);
        HuluCollection.add(Yeye);

    }
    public Hululist(){
        Red = new Huluwa();
        Orrange =new Huluwa();
        Yellow = new Huluwa();
        Green = new Huluwa();
        Cyan = new Huluwa();
        Blue = new Huluwa();
        Purple = new Huluwa();
        Yeye = new Huluwa();
    }
}
