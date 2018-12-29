package GUI;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import Creature.Creature;

public class BattlePlace {
    private static int M =9;
    private static int N =12;
    private static int P = 15;
    private static int PstartX = 20;
    private static int PstartY = 10;
    private static int PWidth = 60;
    //图片类型总数
    //private Image image[];
    //private static String picPath = "main/resources/";
    private Creature[][] place = new Creature[N][M];
    int [][]map = new int [N][M]; //可能要用？
    public BattlePlace(){
        //image = new Image[P];
        picinit();
    }
    public void picinit(){
        /*
        image[0] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/yeye.png"));
        image[1] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/1.png"));
        image[2] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/2.png"));
        image[3] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/3.png"));
        image[4] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/4.png"));
        image[5] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/5.png"));
        image[6] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/6.png"));
        image[7] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/7.png"));
        image[8] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/SHE.png"));
        image[9] = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/Loulo.png"));
        */
        /**
         * 这段后面被我重构了
         */

    }

    public void setCreature(Creature creature){
        int x = creature.getX();
        int y = creature.getY();
        place[x][y] = creature;
    }
    public void CreatureMove(Creature creature,int x,int y){
        int previoux_x = creature.getX();
        int previous_y = creature.getY();
        place[previoux_x][previous_y] =creature;
        place[previoux_x][previous_y].setPosition(x,y);
    }
    public void turnDead(Creature temp){
        place[temp.getX()][temp.getY()] = null;
    }
    public void draw(GraphicsContext gc){
        for(int i = 0;i < N;i++) {
            for(int j = 0;j < M;j++) {
                if(place[i][j] != null){
                    String picname = place[i][j].getImageName();
                    //String path =picPath+picname;
                    try{
                        Image temp = new Image(getClass().getClassLoader().getResourceAsStream(picname));
                        gc.drawImage(temp,(PstartX+place[i][j].getX()*PWidth),(PstartY+place[i][j].getY()*PWidth));
                    } catch (NullPointerException e){
                        e.printStackTrace();
                        System.out.println("图片载入问题");
                    }
                    /**
                     * 根据生物的名字找到对应图片并且打印
                     */
                }
            }
        }
    }
    public Creature getCreture(int x, int y){
        return place[x][y];
    }

}
