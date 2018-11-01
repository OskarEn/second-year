package simpleobjects;

import java.awt.Color;
import java.awt.Graphics;

class BlueDrop extends Drop {

    Color color = Color.BLUE;

    public BlueDrop (int xpos, int ypos, int xvel, int yvel, int size) {

        super (xpos, ypos, xvel, yvel, size);
    }

    public void draw (Graphics g) {

        g.setColor(color);
        g.fillOval(xpos, ypos, size, size);
    }

}