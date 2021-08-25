package _07_abstract_class_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements Colorable {
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setHeight(side);
        setWidth(side);
    }
    @Override
    public void howToColor(){
        System.out.println(" Color all four sides.");
    }
    @Override
    public String toString () {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
