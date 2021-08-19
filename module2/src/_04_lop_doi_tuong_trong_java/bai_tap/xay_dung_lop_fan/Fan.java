package _04_lop_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public int getSlow(){
        return SLOW;
    }
    public int getMedium(){
        return MEDIUM;
    }
    public int getFast(){
        return FAST;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
   public void setSpeed(int speed){
        this.speed=SLOW;
   }
   public void setOn(boolean on){
        this.on=true;
   }
   public void setRadius(double radius){
        this.radius=5;
   }
   public void setColor(String color){
        this.color="blue";
   }
   public void Fan(int speed, boolean on, double radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
   }
    public String toString() {
        String status = "";
        if (this.getOn()) {
            status += ("fan is on \n");
            status += ("speed is:" + this.speed + "\n");

        } else {
            status += ("fan is off \n");
        }
        status += (" Radius is: " + this.radius +" \n" );
        status += (" Color is: " + this.color +"." );
        return status;
    }
}
