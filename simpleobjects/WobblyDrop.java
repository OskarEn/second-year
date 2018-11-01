package simpleobjects;

public class WobblyDrop extends Drop{ //Same idea as bluedrop but overriding the move method

    public WobblyDrop (int xpos, int ypos, int xvel, int yvel, int size) {

        super (xpos, ypos, xvel, yvel, size);
    }

    public void move (int width, int height) {

        xpos = xpos + (int) (4 * (Math.random() -0.5));
        ypos = ypos + yvel;

        if (ypos > height) {

            ypos = 0;
            xpos = (int) (Math.random() * width);
        }
    }
}