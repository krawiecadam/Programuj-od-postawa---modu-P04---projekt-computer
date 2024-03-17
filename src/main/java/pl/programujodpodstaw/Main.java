package pl.programujodpodstaw;

import pl.programujodpodstaw.drive.HDDDrive;
import pl.programujodpodstaw.usbdevice.MemoryStick;
import pl.programujodpodstaw.usbdevice.Mouse;
import pl.programujodpodstaw.usbdevice.USBDevice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell");
        HDDDrive hddDrive = new HDDDrive();
        Mouse mouse = new Mouse("Mysz");
        MemoryStick memoryStick = new MemoryStick("Pendrive");

        Computer computer = new Computer(monitor, hddDrive);
//        hddDrive.addFile(new File("photo.jpg"));
//        hddDrive.listFiles();//
//        computer.addFile(new File ("file.png"));
//        computer.listFile();
    computer.addUSBDevice(mouse);
    computer.addUSBDevice(memoryStick);

    computer.removeUSBDevice(mouse);
    memoryStick.eject();
    computer.removeUSBDevice(memoryStick);




//        List<USBDevice> usbDevices = computer.getUsbDevices();
//        for (USBDevice device: usbDevices) {
//            System.out.println(device.getName());
//        }
    }
}