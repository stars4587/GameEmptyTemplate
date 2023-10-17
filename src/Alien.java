import processing.core.PApplet;

public class Alien {
    private int x;
    private int y;
    private int yspeed;

    public int getX() {
        return x;
    }

    public  void setX(int x) {
        this.x = x;
    }

    public  int getY() {
        return y;
    }

    public  void setY(int y) {
        this.y = y;
    }

    public Alien(int x, int y, int yspeed) {
        this.x = x;
        this.y = y;
        this.yspeed = yspeed;
    }

    public void draw(PApplet window) {
        window.rect(x, this.y, 30, 20);


    }

    public String toString(){
        return x + "," + y;
    }
}
