package Tugas2Bagian2_Vehicle;

import Tugas2Bagian2_Vehicle.vehicle.SuzukiKatana;
import Tugas2Bagian2_Vehicle.vehicle.HondaJazz;
import Tugas2Bagian2_Vehicle.vehicle.ToyotaFortuner;

public class Main1 {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz("Merah", 40, "Automatic", true);
        ToyotaFortuner fortuner = new ToyotaFortuner("Hitam", 80, "Manual", true);
        SuzukiKatana katana = new SuzukiKatana("Putih", 60, "Manual", true);

        // Demonstrasi Honda Jazz
        System.out.println("Honda Jazz:");
        jazz.bergerakMaju();
        jazz.berbelok();
        jazz.bukaSunroof();
        System.out.println();

        // Demonstrasi Toyota Fortuner
        System.out.println("Toyota Fortuner:");
        fortuner.bergerakMaju();
        fortuner.berbelok();
        fortuner.aktifkanFourWheelDrive();
        System.out.println();

        // Demonstrasi Suzuki Katana
        System.out.println("Suzuki Katana:");
        katana.bergerakMaju();
        katana.berbelok();
        katana.gunakanWinch();
        System.out.println();
    }
}
