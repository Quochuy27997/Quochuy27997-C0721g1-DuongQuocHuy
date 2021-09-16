package _case_study.services.impl;

import _case_study.models.Facility;
import _case_study.models.House;
import _case_study.models.Room;
import _case_study.models.Villa;
import _case_study.services.FacilityService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    final static String PATH_HOUSE = "src//_case_study//data//house.csv";
    final static String PATH_VILLA = "src//_case_study//data//villa.csv";
    final static String PATH_ROOM = "src//_case_study//data//room.csv ";

    @Override
    public void display(String path) {
        Map<House, Integer> houseIntegerMap = ReadFile.getListHouse(PATH_HOUSE);
        Set<House> houseSet = houseIntegerMap.keySet();
        Map<Room, Integer> roomIntegerMap = ReadFile.getListRoom(PATH_ROOM);
        Set<Room> roomSet = roomIntegerMap.keySet();
        Map<Villa, Integer> villaIntegerMap = ReadFile.getListVilla(PATH_VILLA);
        Set<Villa> villaSet = villaIntegerMap.keySet();
        System.out.println("list house:");
        for (House house : houseSet) {
            System.out.println(house.toString() + "\n" + "number of uses service" + houseIntegerMap.get(house));
        }
        System.out.println("list room:");
        for (Room room : roomSet) {
            System.out.println(room.toString() + "\n" + "number of uses service" + roomIntegerMap.get(room));
        }
        System.out.println("list villa:");
        for (Villa villa : villaSet) {
            System.out.println(villa.toString() + "\n" + "number of uses service:" + villaIntegerMap.get(villa));
        }

    }

    @Override
    public void add(String path) {

    }
    @Override
    public void edit(String path) {

    }
    public void addEmployment(String nameService,String path){
        Map<House, Integer> houseIntegerMap = ReadFile.getListHouse(PATH_HOUSE);
        Map<Room, Integer> roomIntegerMap = ReadFile.getListRoom(PATH_ROOM);
        Map<Villa, Integer> villaIntegerMap = ReadFile.getListVilla(PATH_VILLA);
        for (Map.Entry<House,Integer> entry:houseIntegerMap.entrySet()){
            if(entry.getKey().getServiceName().equals(nameService)){
                entry.setValue(entry.getValue()+1);
            }
        }
        for (Map.Entry<Room,Integer> entry:roomIntegerMap.entrySet()){
            if(entry.getKey().getServiceName().equals(nameService)){
                entry.setValue(entry.getValue()+1);
            }
        }
        for (Map.Entry<Villa,Integer> entry:villaIntegerMap.entrySet()){
            if(entry.getKey().getServiceName().equals(nameService)){
                entry.setValue(entry.getValue()+1);
            }
        }
    }

    @Override
    public void displayListMaintenance() {
        Map<House, Integer> houseIntegerMap = ReadFile.getListHouse(PATH_HOUSE);
        Set<House> houseSet = houseIntegerMap.keySet();
        Map<Room, Integer> roomIntegerMap = ReadFile.getListRoom(PATH_ROOM);
        Set<Room> roomSet = roomIntegerMap.keySet();
        Map<Villa, Integer> villaIntegerMap = ReadFile.getListVilla(PATH_VILLA);
        Set<Villa> villaSet = villaIntegerMap.keySet();
        for (House house : houseSet) {
            if(houseIntegerMap.get(house)>=5){
                System.out.println(house.toString()+"service has been used 5 times needs repair");

            }
        }

        for (Room room : roomSet) {
            if(houseIntegerMap.get(room)>=5){
                System.out.println(room.toString()+"service has been used 5 times needs repair");

            }        }

        for (Villa villa : villaSet) {
            if(houseIntegerMap.get(villa)>=5){
                System.out.println(villa.toString()+"service has been used 5 times needs repair");

            }        }

    }

    @Override
    public void addFacility() {
        System.out.println("choice Facility type:\n 1.House \n 2. Room \n 3. Villa");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addHouse(PATH_HOUSE);
                break;
            case 2:
                addRoom(PATH_ROOM);
                break;
            case 3:
                addVilla(PATH_VILLA);
                break;
            default:
        }
    }

    public void addHouse(String path) {
        Map<House, Integer> houseIntegerMap = ReadFile.getListHouse(PATH_HOUSE);
        Set<House> keySet = houseIntegerMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("enter new id service:");
            idService = scanner.nextLine();
            flag = false;
            for (House house : keySet) {
                if (house.getIdService().equals(idService)) {
                    System.out.println("Id service is exist,enter again!");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String serviceName = scanner.nextLine();
        System.out.println("Enter area of service:");
        Double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rentalCosts of service:");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maxNumberOfPeople of service:");
        Integer maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rentalType of service:");
        String rentalType = scanner.nextLine();
        System.out.println("Enter roomStandard of service:");
        String roomStandard = scanner.nextLine();
        System.out.println("Enter numberOfFloors of service:");
        Integer numberOfFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(idService, serviceName, usableArea, rentalCosts,
                maxNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        houseIntegerMap.put(house, 0);
        WriteFile.writeHouseToCSV(houseIntegerMap, path, false);

    }

    public void addRoom(String path) {
        Map<Room, Integer> roomIntegerMap = ReadFile.getListRoom(PATH_ROOM);
        Set<Room> keySet = roomIntegerMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("enter new id service:");
            idService = scanner.nextLine();
            flag = false;
            for (Room room : keySet) {
                if (room.getIdService().equals(idService)) {
                    System.out.println("Id service is exist,enter again!");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String serviceName = scanner.nextLine();
        System.out.println("Enter area of service:");
        Double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rentalCosts of service:");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maxNumberOfPeople of service:");
        Integer maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rentalType of service:");
        String rentalType = scanner.nextLine();
        System.out.println("Enter freeService of service:");
        String freeService = scanner.nextLine();
        Room room = new Room(idService, serviceName, usableArea, rentalCosts,
                maxNumberOfPeople, rentalType, freeService);
        roomIntegerMap.put(room, 0);
        WriteFile.writeRoomToCSV(roomIntegerMap, path, false);

    }

    public void addVilla(String path) {
        Map<Villa, Integer> villaIntegerMap = ReadFile.getListVilla(PATH_VILLA);
        Set<Villa> keySet = villaIntegerMap.keySet();
        String idService = "";
        boolean flag = true;
        while (flag) {
            System.out.println("enter new id service:");
            idService = scanner.nextLine();
            flag = false;
            for (Villa villa : keySet) {
                if (villa.getIdService().equals(idService)) {
                    System.out.println("Id service is exist,enter again!");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of service:");
        String serviceName = scanner.nextLine();
        System.out.println("Enter area of service:");
        Double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rentalCosts of service:");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maxNumberOfPeople of service:");
        Integer maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rentalType of service:");
        String rentalType = scanner.nextLine();
        System.out.println("Enter roomStandard of service:");
        String roomStandard = scanner.nextLine();
        System.out.println("Enter swimmingPoolArea of service:");
        Double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter numberOfFloors of service:");
        Integer numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idService, serviceName, usableArea, rentalCosts,
                maxNumberOfPeople, rentalType, roomStandard, swimmingPoolArea, numberOfFloors);
        villaIntegerMap.put(villa, 0);
        WriteFile.writeVillaToCSV(villaIntegerMap, path, false);
    }


}
