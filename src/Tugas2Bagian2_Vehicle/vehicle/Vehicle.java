package Tugas2Bagian2_Vehicle.vehicle;

public class Vehicle {
    private int jumlahRoda;
    private String warna;

    public Vehicle(int jumlahRoda, String warna) {
        this.jumlahRoda = jumlahRoda;
        this.warna = warna;
    }

    public void bergerakMaju() {
        System.out.println("Kendaraan bergerak maju");
    }

    public void berbelok() {
        System.out.println("Kendaraan berbelok");
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public String getWarna() {
        return warna;
    }
}