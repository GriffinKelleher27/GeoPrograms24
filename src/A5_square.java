public class A5_square extends World {

    public void go() {
        for (int y = 0; y < 300; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                plane.setPixelColor(0,  y/2, 150);
            }

        }
        for (int y = 300; y < 1000; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                plane.setPixelColor(y/5,  250, 0);
            }

        }
        plane.trailWidth=10;
        for(int x=0;x<601;x=x+200){
        plane.teleport(100+x,200);
        plane.house(100);}



    }

    }




