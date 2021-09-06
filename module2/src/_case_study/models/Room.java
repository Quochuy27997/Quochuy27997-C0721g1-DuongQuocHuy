package _case_study.models;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople,
                String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String toString(){
        return "Room{" +
                "freeService='" + freeService +
                "} " + super.toString();

    }
}
