package simpleobjects;

import goo.Goo;
import java.awt.Graphics;

class GooDrop {

    SimpleDrop drop;

    public GooDrop extends Goo (int width, int height) {

        super(width, height);

        int xpos = width/2;
        int ypos = 0;
        int xvel = 0;
        int yvel = 1;
        int size = 10;

        drop = new SimpleDrop(xpos, ypos, xvel, yvel, size);
    }

    //Overriding the draw method. GooDrop relays the message to the SimpleDrop object. The Grapohics reference is
    //passed as a paramter
    public void draw(Graphics g) {

        drop.move(getWidth(), getHeight());
        drop.draw(g);
    }
}