package simpleobjects;

import java.awt.Color;
import java.awt.Graphics;

class Drop {

    int xpos, ypos, xvel, yvel, size;

    public Drop(int xp, int yp, int xv, int yv, int si) {

        xpos = xp;
        ypos = yp;
        xvel = xv;
        yvel = yv;
        size = si;
    }

    //Can use a Graphics objects and use its methods for my drawing puropses
    public void draw(Graphics g) {

        g.setColor(Color.RED);
        g.fillOval(xpos, ypos, size, size); //fillOval uses height and width to compute
    }

    //xpos and ypos are updated with the velocities. Width and height are passed but not used in the implementation
    public void move(int width, int height) {

        xpos = xpos + xvel;
        ypos = ypos + yvel;

        if (ypos > height) {

            ypos = 0;
            xpos = (int) (Math.random() * width);
        }
    }
}