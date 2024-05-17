package Tugas2Bagian2_Vehicle.vehicle;

public class Car extends Vehicle {
    private int kapasitasTangki;
    private String transmisi;

    public Car(String warna, int kapasitasTangki, String transmisi) {
        super(4, warna); // Mobil umumnya memiliki 4 roda
        this.kapasitasTangki = kapasitasTangki;
        this.transmisi = transmisi;
    }

    public void pindahTransmisi(String transmisiBaru) {
        this.transmisi = transmisiBaru;
        System.out.println("Transmisi dipindahkan ke: " + transmisiBaru);
    }

    public int getKapasitasTangki() {
        return kapasitasTangki;
    }

    public String getTransmisi() {
        return transmisi;
    }
}
