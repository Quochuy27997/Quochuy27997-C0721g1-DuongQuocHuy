package _06_ke_thua.bai_tap.lop_2d_3d;

import java.util.Arrays;

public class Point3D extends PointD {
    private float z=0.0f;
    public Point3D(){}
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array=new float[3];
        array[0]=getX();
        array[1]=getY();
        array[2]=getZ();
        return array;
    }
    @Override
    public String point2DToString(){
        return "Point 3D:"+ Arrays.toString(getXYZ());
    }
}
