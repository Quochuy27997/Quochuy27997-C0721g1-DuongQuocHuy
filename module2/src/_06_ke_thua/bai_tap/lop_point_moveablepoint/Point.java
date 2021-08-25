package _06_ke_thua.bai_tap.lop_point_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(){}
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] array=new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }
    public String pointToString(){
        return "Point 2D "
                + Arrays.toString(getXY());
    }
}