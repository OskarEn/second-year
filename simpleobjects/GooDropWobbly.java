package simpleobjects;

import goo.Goo;
import java.awt.Graphics;

class GooDropWobbly extends Goo {

    Drop wobble;

    public GooDropWobbly (int width, int height) {

        super(width, height);

        int xpos = width/2;
        int ypos = 0;
        int xvel = 0;
        int yvel = 1;
        int size = 40;

        wobble = new WobblyDrop(xpos, ypos, xvel, yvel, size);
    }

    public void draw(Graphics g) {

        wobble.move(getWidth(), getHeight());
        wobble.draw(g);
    }
}