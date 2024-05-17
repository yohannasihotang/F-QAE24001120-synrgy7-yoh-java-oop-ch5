package Tugas2Bagian2_Vehicle.vehicle;

public class ToyotaFortuner extends Car {
    private boolean fourWheelDrive;

    public ToyotaFortuner(String warna, int kapasitasTangki, String transmisi, boolean fourWheelDrive) {
        super(warna, kapasitasTangki, transmisi);
        this.fourWheelDrive = fourWheelDrive;
    }

    public void aktifkanFourWheelDrive() {
        if (fourWheelDrive) {
            System.out.println("Four-wheel drive diaktifkan");
        } else {
            System.out.println("Mobil ini tidak memiliki four-wheel drive");
        }
    }

    @Override
    public void bergerakMaju() {
        System.out.println("Toyota Fortuner bergerak maju dengan kekuatan off-road");
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }
}
