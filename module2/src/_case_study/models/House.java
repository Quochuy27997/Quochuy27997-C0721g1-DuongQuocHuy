package _case_study.models;

public class House extends Facility {
    private String roomStandard;// tieu chua phong
    private int numberOfFloors;// so tang

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloors;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloors = numberOfFloor;
    }

    public House(String idService,String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople,
                 String rentalType, String roomStandard, int numberOfFloor) {
        super(idService,serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloor;
    }
    @Override
    public String toString(){
        return "House{" +
                "roomStandard='" + roomStandard +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
    public String getString(){
        return    super.getString()  +","+ this.roomStandard+","+this.numberOfFloors;
    }
}
