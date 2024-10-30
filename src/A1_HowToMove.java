public class A1_HowToMove extends World {
    public int red;
    public int green;
    public int blue;

    public void go() {
        plane.showBackGround();
        for(int x=4; x<323; x++){
            for(int y=121; y<361; y++){
                plane.teleport(x,y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if(red>70 && green<50 && blue<50){
                    plane.setPixelColor(red/10, green/10, blue/10);
                }
            }
        }


    }



}

