import java.awt.event.KeyEvent;

public class A2_Thickness extends World {
    public int red;
    public int blue;
    public int green;
    //I made a change
    public void go() {
        for (int y = 0; y < 350; y++) {
            for (int x = 0; x < 1000; x++) {
                plane.teleport(x, y);
                plane.setPixelColor(200, 0, y/2);
            }


        }
        plane.trailWidth = 100;
        plane.setColor(255, 255, 0);
        plane.teleport(800, 100);
        sun();
        plane.setColor(0, 0, 0);
        plane.trailWidth = 5;
        for(int y = 50; y < 251; y = y + 100){
        for (int x = 750; x > 50; x = x - 200) {
            plane.teleport(x, y);
            bird(plane.random(5,50));
        }
        }
        for (int y = 350; y < 800; y++) {
            for (int x = 0; x < 1000; x++) {
                plane.teleport(x, y);
                plane.setPixelColor(40, y/4, 200);
            }
        }
        plane.showBackGround();
        for(int y=0; y<800; y++){
            for(int x=0; x<1000; x++){
                plane.teleport(x,y);
                red=plane.howMuchRed();
                green=plane.howMuchGreen();
                blue=plane.howMuchBlue();
                if(red>50){
                plane.setPixelColor((red+green+blue)/3 , (red
                        +green+blue)/3,(red+green+blue)/3);}
            }
        }
    }

    public void sun() {
        plane.isTrail=true;
        for(int x=0;x<60; x++){
            plane.move(2);
            plane.turn(6);
        }
    }
    public void bird(int size){
        plane.turn(-45);
        plane.move(size);
        plane.turn(-90);
        plane.move(size);
        plane.turn(135);
    }


}
