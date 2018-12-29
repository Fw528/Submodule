package Creature;

public abstract class Creature implements Runnable {
    protected int x;
    protected int y; //坐标
    protected String imageName; //存储该生物的图像
    protected boolean ismonster;//暂定用来判断阵营
    protected boolean isalive;//活着没
    protected int force;
    protected int blood;
    private String name;
    //暂时不确定名字需不需要被使用
    private static int tileWidth = 60;//像素宽度
    private static int tileHeight = 60;//像素高度

    public Creature() {
        isalive =true;

    }

    public void setImage(String imageName){ this.imageName = imageName;}

    public String getImageName() {
        return imageName;
    }

    public boolean getIsMonster() {
        return ismonster;
    }
    public void setIsmonster(boolean monster){ismonster = monster;}

    public void setIsalive(boolean isalive){this.isalive =isalive;}
    public boolean getisIsalive() {
        return isalive;
    }

    //判断阵营
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){return name;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * 以上是关于坐标的
     */

    public void setForce(int f){force = f;}
    public int getForce() {
        return this.force;
    }

    public void setBlood(int b){blood = b;}
    public int getBlood() {
        return this.blood;
    }
    public void BloodChange(int add) {
        blood = blood + add;
    }
    //用于扣血量和可能设计的buff

    /*
    public void draw(GraphicsContext gc) {

        gc.drawImage(image, this.x * tileWidth, this.y * tileHeight);
    }//在画布上画出生物
    */
    //移交给别的类去做这件事吧

    /**
     * 武力值 目前是两个相遇的判定因素 A.force/B.force+A.force
     * 没想好是即死类判定还是
     * 血量 目前没想好怎么用图片更新血条
     */
    /**
     * 以下和线程相关
     */
    public synchronized void MoveToLine(int x,int y){
        try{
            //BattleField.Moveto(this, x, y);
            setPosition(x,y);
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("移动问题");
        }
    }

    public synchronized void run(){
        /**
         * 生物的主要代码
         */

    }
    public synchronized void startThreads(){//开始线程
        Thread thread=new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }
}