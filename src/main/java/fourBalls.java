import processing.core.PApplet;


public class fourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 488;
    public static  final int DIAMETER = 20;
    int xDirection=0;

    public static void main(String[] args){
        PApplet.main("fourBalls");
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);

    }
    @Override
    public void setup(){
    }
    @Override
    public void draw(){
        for(int idx=1;idx<5;idx++){
            drawCircle(idx);
        }
    }
    private void drawCircle(int idx) {
        int height= (idx*HEIGHT)/5;
        ellipse(xDirection/idx,height,DIAMETER,DIAMETER);
        xDirection+=2;
    }
}
