public class PerhitunganParkir {
    private int jamParkir;

    public PerhitunganParkir(int jamParkir) {
        this.jamParkir = jamParkir;
    }

    public double hitungBiaya() {
        if (jamParkir <= 5) {
            return 1.0; // Total $1 untuk 5 jam pertama
        } else if (jamParkir < 24) {
            return 1.0 + (jamParkir - 5) * 0.5; // $1 untuk 5 jam pertama, kemudian $0.5 per jam setelahnya
        } else if (jamParkir == 24) {
            return 15.0; // Flat $15 untuk tepat 24 jam
        } else {
            int kelebihanJam = jamParkir - 24;
            return 15.0 + kelebihanJam * 0.5; // $15 untuk 24 jam pertama, kemudian $0.5 per jam setelahnya
        }
    }

    public static void main(String[] args) {
        // parkir selama 24 jam
        int jam1 = 24;
        PerhitunganParkir parkir1 = new PerhitunganParkir(jam1);
        double biaya1 = parkir1.hitungBiaya();
        System.out.println("Biaya parkir untuk " + jam1 + " jam adalah $" + biaya1);

        // parkir selama 5 jam
        int jam2 = 5;
        PerhitunganParkir parkir2 = new PerhitunganParkir(jam2);
        double biaya2 = parkir2.hitungBiaya();
        System.out.println("Biaya parkir untuk " + jam2 + " jam adalah $" + biaya2);
    }
}
