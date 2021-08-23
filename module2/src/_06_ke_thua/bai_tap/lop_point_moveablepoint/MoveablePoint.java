package _06_ke_thua.bai_tap.lop_point_moveablepoint;

public class MoveablePoint  extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    MoveablePoint(){}
    MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0]=getxSpeed();
        speed[1]=getySpeed();
        return speed;
    }
    @Override
    public String pointToString(){
        return super.pointToString()+
                "speed : " +
                "( "+getxSpeed()+" , "+getySpeed()+" )";
    }
    public MoveablePoint move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }
}
