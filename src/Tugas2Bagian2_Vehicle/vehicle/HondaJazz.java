package Tugas2Bagian2_Vehicle.vehicle;

public class HondaJazz extends Car {
    private boolean sunroof;

    public HondaJazz(String warna, int kapasitasTangki, String transmisi, boolean sunroof) {
        super(warna, kapasitasTangki, transmisi);
        this.sunroof = sunroof;
    }

    public void bukaSunroof() {
        if (sunroof) {
            System.out.println("Sunroof dibuka");
        } else {
            System.out.println("Mobil ini tidak memiliki sunroof");
        }
    }

    @Override
    public void berbelok() {
        System.out.println("Honda Jazz berbelok dengan radius kecil");
    }

    public boolean hasSunroof() {
        return sunroof;
    }
}
