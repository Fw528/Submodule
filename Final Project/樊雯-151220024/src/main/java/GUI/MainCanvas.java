package GUI;

import Creature.Creature;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import Creature.Hululist;
import Creature.Monsterlist;

public class MainCanvas extends Canvas {

    // 游戏地图
    // private GameMap gameMap;
    private GraphicsContext gContext;
    private Image map;
    private Image image;//用于个别图片的测试

    private static int picWidth = 60;
    private boolean isRunning = false;
    private boolean isReplay  = false;
    private long sleep = 100;
    private BattlePlace place =new BattlePlace();
    private Hululist brothers = new Hululist();
    private Monsterlist monsters = new Monsterlist();

    public void init(){
        brothers.huluinit();
        monsters.monsterInit();
        //temp.setPosition(3,4);
        for(Creature temp:brothers.HuluCollection){
            place.setCreature(temp);
        }
        for(Creature temp:monsters.MonsterCollection){
            place.setCreature(temp);
        }

    }
    private Thread Mainthread;{
        Mainthread = new Thread(new Runnable() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public synchronized void run() {
                        draw();
                    }
                });
                while (isRunning == false && isReplay == false) {
                    getParent().getScene().setOnKeyPressed(new EventHandler<KeyEvent>() {
                        @Override
                        public void handle(KeyEvent event) {
                            if (event.getCode() == KeyCode.SPACE) {
                                /**
                                 * 最初始的地方 开始
                                 */
                                isRunning = true;




                            }
                            if (event.getCode() == KeyCode.L && isRunning == false) {
                                //按L读取文件,开启回放模式
                                //考虑加入窗口
                                   /*
                                    FileChooser fileChooser = new FileChooser();
                                    File f = fileChooser.showOpenDialog(stage);
                                    for (Creature hulu : inithulu.HuluBrothers) {
                                        output.resultIn(f, hulu);
                                        hulu.startThreads();
                                    }
                                    for (Creature monster : initmonster.Monsters) {
                                        output.resultIn(f, monster);
                                        monster.startThreads();
                                    }
                                    */
                                isReplay = true;
                            }
                        }
                    });
                }
                while(isRunning == true || isReplay == true){
                    /**
                     * 设置战斗相关内容
                     */

                }
            }
        });
    }
    public MainCanvas(double width, double height) {
        super(width, height);
        //mage = new Image(getClass().getClassLoader().getResourceAsStream("main/resources/scene1.jpg"));
        map = new Image(getClass().getClassLoader().getResourceAsStream("scene1.png"));
        gContext = getGraphicsContext2D();
        gContext.setFont(Font.font("Verdana",80));

        init();
        Mainthread.start();
    }

    public void draw() {
        gContext.drawImage(map,0,0);
        place.draw(gContext);
        //gameMap.drawMap(gContext);
    }

    public void update() {

    }
}