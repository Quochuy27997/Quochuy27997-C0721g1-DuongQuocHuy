package _case_study.models;

public class Villa extends Facility{
    private String roomStandard;// loai phong
    private double swimmingPoolArea;// dientich ho boi
    private int numberOfFloors; //so tang


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople,
                 String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }
   @Override
   public String toString(){
        return "Villa {"+
                "roomStandard = "+roomStandard +
                ", swimmingPoolArea = "+swimmingPoolArea+
                ", numberOfFloors = "+numberOfFloors+
                "}"+super.toString();

   }
}
