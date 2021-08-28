//package bai_lam_them_fix_bug_tuan_02;
//
//import bai_lam_them_fix_bug_tuan_01.Adress;
//import sun.jvm.hotspot.debugger.Address;
//
//public abstract class Person {
//    private String name;
//    private  int AGE;
//    private Adress address;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAGE() {
//        return AGE;
//    }
//
//    public void setAGE(int AGE) {
//        this.AGE = AGE;
//    }
//
//    public Address getAddress() {
//        return (Address) address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = (Adress) address;
//    }
//
//    public Person(String name, int AGE, Address address) {
//        this.name = name;
//        this.AGE = AGE;
//        this.address = (Adress) address;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "name='" + name + '\'' +
//                ", AGE=" + AGE +
//                ", address=" + address +
//                '}';
//    }
//    public abstract void howToMove();
//}
