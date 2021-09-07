package _15_exeption_debug.bai_tap;

public class IllegalRightTriangleException extends Exception{
    public IllegalRightTriangleException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập sai : " + super.getMessage();
    }

}
