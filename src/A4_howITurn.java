import java.awt.*;
import java.awt.event.KeyEvent;

public class A4_howITurn extends World {
    public int fishsize ;
    public int birdsize ;


    public void go() {
        fishsize = plane.random(1,3);
         birdsize = plane.random(100,150);
        plane.pausetime=1/2;
        plane.isTrail=false;
        plane.move(300);
        plane.turn(-90);
        plane.move(200);
        plane.turn(180);
        plane.isTrail=true;
        plane.move(1000);
        plane.turn(-90);
        plane.isTrail=false;
        plane.move(50);
        plane.turn(-90);
        plane.move(100);
        plane.turn(90);
        Fish();
        for(int x=1;x<7;x++){
            plane.isTrail=false;
            plane.turn(45);
            plane.move(200);
            plane.turn(90);
            Fish();
        }
        plane.isTrail=false;
        plane.turn(135);
        plane.move(100);
        plane.turn(180);
        Fish();
        for(int x=1;x<7;x++){
            plane.isTrail=false;
            plane.turn(45);
            plane.move(200);
            plane.turn(90);
            Fish();
        }
        plane.isTrail=false;
        plane.turn(135);
        plane.move(150);
        for(int x=1;x<8;x++){
            plane.isTrail=true;
            Building();
        }
        plane.isTrail=true;
        plane.teleport(100, 100);
        plane.isTrail=true;
        plane.turn(-135);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(-45);
        for(int x=1;x<5;x++){
         Bird();
        }



    }
    public void Bird(){
        plane.isTrail=false;
        plane.move(100);
        plane.turn(-45);
        plane.isTrail=true;
        plane.move(birdsize);
        plane.turn(90);
        plane.move(birdsize);
        plane.turn(-45);
    }
    public void Building(){
        plane.move(200);
        plane.turn(45);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(45);
        plane.move(200);
        plane.turn(-90);
        plane.isTrail=false;
        plane.move(50);
        plane.turn(-90);
    }
    public void Fish(){
        plane.isTrail=true;
        for(int x=1;x<91; x++){
            plane.move(fishsize);
            plane.turn(4);
        }
        plane.isTrail=false;
        plane.turn(90);
        plane.move(50);
        plane.turn(45);
        plane.isTrail=true;
        plane.move(50);
        plane.turn(-135);
        plane.move(75);
        plane.turn(-135);
        plane.move(50);

    }
    public void NumberPatterns(){
        plane.pausetime=1/2;
        plane.isTrail=true;
        for(int x=1;x<11;x=x+1){
            System.out.print(x+",");
        }
        System.out.println("****");
        for(int x=2;x<21;x=x+2){
            System.out.print(x+",");
        }
        System.out.println("****");
        for(int x=1;x<20;x=x+3){
            System.out.print(x+",");
        }
        System.out.println("****");
        for(int x=10;x>0;x=x-1){
            System.out.print(x+",");
        }
        System.out.println("****");
        for(int x=5;x<46;x=x+5){
            System.out.print(x+",");
        }
    }
    public void Triangle(){
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
    }
    public void Square(){
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);}
    public void Hexagon() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
    }
    public void Flower(){
        for(int x=0;x<20;x=x+1) {
            Square();
            plane.turn(20);
        }
    }
    public void SquigglyLine() {
        for (int x = 0; x < 200; x = x + 1) {
            plane.move(20);
            plane.turn(x);
        }
    }
}
