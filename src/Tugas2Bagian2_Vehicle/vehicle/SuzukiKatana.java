package Tugas2Bagian2_Vehicle.vehicle;

public class SuzukiKatana extends Car {
    private boolean winch;

    public SuzukiKatana(String warna, int kapasitasTangki, String transmisi, boolean winch) {
        super(warna, kapasitasTangki, transmisi);
        this.winch = winch;
    }

    public void gunakanWinch() {
        if (winch) {
            System.out.println("Winch digunakan");
        } else {
            System.out.println("Mobil ini tidak memiliki winch");
        }
    }

    @Override
    public void berbelok() {
        System.out.println("Suzuki Katana berbelok dengan stabil di medan berat");
    }

    public boolean hasWinch() {
        return winch;
    }
}

