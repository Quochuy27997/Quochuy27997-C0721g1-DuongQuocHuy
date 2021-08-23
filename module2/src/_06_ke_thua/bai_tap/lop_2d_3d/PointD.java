package _06_ke_thua.bai_tap.lop_2d_3d;
import java.util.Arrays;
public class PointD {
    private float x=0.0f;
    private float y=0.0f;
    public PointD(){}
    public PointD(float x, float y){
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
    public String point2DToString(){
        return "Point 2D "
                +Arrays.toString(getXY());
    }
}
