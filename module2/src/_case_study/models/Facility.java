package _case_study.models;

public class Facility {
    private String serviceName; // Tên dịch vụ
    private double usableArea; // Diện tích sử dụng
    private double rentalCosts; // Chi phí thuê
    private int maxNumberOfPeople; // Số lượng người tối đa
    private String rentalType; // Kiểu thuê

    public Facility(String serviceName, double usableArea, double rentalCosts, int maxNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
    @Override
    public String toString(){
        return "Facility{" +
                "serviceName='" + serviceName +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
