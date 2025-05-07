package oop.interfaceTest.scan;

interface Scan {
    // public abstract void doScan();
    void doScan();

    // public static final int scanNum = 2;
    int scanNum = 2;

    default void prePaper() {
        System.out.println("Prepaper");
    }
//
//    static void prePower() {
//        System.out.println("Power");
//    }
}
class Equipment implements Scan {
    public void doScan() {
        System.out.println("Equipment scan");
    }

    @Override
    public void prePaper() {
        Scan.super.prePaper();
        System.out.println("Equipment- Prepaper");
    }
}

class Device implements Scan {
    int scanNum = 10;
    @Override
    public void doScan() {
        System.out.println(Scan.scanNum);
    }
}
public class MainTest {
    public static void main(String[] args) {
        Device device = new Device();
        device.doScan();
        device.prePaper();

        Equipment equipment = new Equipment();
        equipment.doScan();
        equipment.prePaper();
    }

}
