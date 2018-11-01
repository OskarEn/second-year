package simpleobjects;

public class GooDropLauncher {

    public static void main(String[] args) {

        int width = 800;
        int height = 500;

//        GooDrop gd = new GooDrop(width, height);
//        gd.smooth();
//        gd.go();

        GooDropColor gdc = new GooDropColor(width, height);
        gdc.smooth();
        gdc.go();
    }
}