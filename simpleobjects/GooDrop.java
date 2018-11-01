package simpleobjects;

import goo.Goo;
import java.awt.Graphics;

class GooDrop extends Goo {

    SimpleDrop drop;

    public GooDrop (int width, int height) {

        super(width, height);

        int xpos = width/2;
        int ypos = 0;
        int xvel = 0;
        int yvel = 1;
        int size = 50;

        drop = new SimpleDrop(xpos, ypos, xvel, yvel, size);
    }

    //Overriding the draw method. GooDrop relays the message to the SimpleDrop object. The Grapohics reference is
    //passed as a parameter to the SimpleDrop's drwa
    public void draw(Graphics g) {

        drop.move(getWidth(), getHeight());
        drop.draw(g);
    }
}