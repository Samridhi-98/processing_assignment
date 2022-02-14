import processing.core.PApplet;


public class fourBalls extends PApplet {
    private int xDirection=0;
    public static void main(String[] args){
        PApplet.main("fourBalls");
    }

    @Override
    public void settings(){
        super.settings();
        size(640,488);

    }

    @Override
    public void setup(){
        super.setup();
        background(0);
        fill(150);
    }

    @Override
    public void draw(){
        for(int idx=1;idx<=4;idx++){
            int height= (idx*488)/5;
            ellipse(xDirection/idx,height,15,15);
            xDirection+=2;
        }
    }
}
