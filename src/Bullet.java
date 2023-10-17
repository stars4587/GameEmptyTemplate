import processing.core.PApplet;

public class Bullet {
    int bullets;
    int ySpeed;
    int x;
    int y;

public Bullet(int ySpeed, int bullets, PApplet window){
    this.bullets=bullets;
    this.ySpeed=ySpeed;
    this.x = window.mouseX;
    this.y = window.mouseY;

}
public void Speed(){
        ySpeed++;

}

public void draw(PApplet window){
        window.fill(0,0,255);
        //window.ellipse();

    }

public void act(PApplet window){

}
public void mouseReleased(PApplet window){
    window.ellipse(x , y, 5,10);
    }
}

