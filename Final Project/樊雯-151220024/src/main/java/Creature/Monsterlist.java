package Creature;

import java.util.ArrayList;
import java.util.List;

public class Monsterlist {
    private static int N = 10;
    public List<Monster> MonsterCollection= new ArrayList<Monster>();
    private Monster SHE;
    private Monster Xiezi;
    private Monster[] Loulo = new Monster[N];
    public void monsterInit(){
        SHE.setImage("SHE.png");
        SHE.setName("蛇精");
        SHE.setBlood(14);
        SHE.setForce(8);  //全场目前最强选手

        Xiezi.setImage("xiezi2.png");
        Xiezi.setName("蝎子");
        Xiezi.setBlood(10);
        Xiezi.setForce(10);  //高攻击高血量选手

        MonsterCollection.add(SHE);
        MonsterCollection.add(Xiezi);

        for(int i = 0 ; i <N;i++){
            String t = i+"";
            Loulo[i].setName("喽啰"+t);
            Loulo[i].setForce(4);
            Loulo[i].setBlood(6);
            Loulo[i].setImage("Loulo.png");
            MonsterCollection.add(Loulo[i]);
        }
        initPosition();

    }
    public void initPosition(){
        SHE.setPosition(8,4);
        Xiezi.setPosition(9,4);
        Loulo[0].setPosition(9,3);
        Loulo[1].setPosition(10,2);
        Loulo[2].setPosition(10,3);
        Loulo[3].setPosition(11,1);
        Loulo[4].setPosition(11,2);
        for(int i = 5;i<N;i++ ){
            int temp = 9 - i ;
            Loulo[i].setPosition(Loulo[temp].getX(),8-Loulo[temp].getY());
        }

    }
    public Monsterlist(){
        SHE = new Monster();
        Xiezi = new Monster();
        for(int i = 0 ; i<N;i++){
            Loulo[i] = new Monster();
        }
    }
}
