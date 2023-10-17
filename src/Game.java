import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    // TODO: declare game variables
    ArrayList<Alien> aliens = new ArrayList<>();
    int yspeed;

    public void settings() {
        size(800, 800);   // set the window size
    }

    public void setup() {
        yspeed = 0;

        for (int j = 50; j < 250; j += 50) {
           for (int i = 50; i < 730; i += 75) {
               System.out.println(i);
               System.out.println(j);
              Alien a = new Alien(i, j, yspeed);
              aliens.add(a);

            }

        }
        System.out.println(aliens.toString());
    }
        // TODO: initialize game variables


    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(255);    // paint screen white
        fill(0,255,0);          // load green paint color
        rect(mouseX, 700, 100, 20);  // draw circle at mouse loc
        //for (int j = 50; j < 250; j+=50) {
          //  for (int i = 50; i < 730; i+=75) {
                //Alien.draw(this);
            //}

        //}
        for(Alien a: aliens) {
            a.draw(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }

}
