public class Gedung {
    String namaGedung;
    int kapasitas, harga;

    public void info (){
        System.out.println("---------------------------");
        System.out.println("Nama Gedung: " + namaGedung);
        System.out.println("Kapasitas Gedung: " + kapasitas);
        System.out.println("Harga Gedung: Rp. " + harga);
        System.out.println("---------------------------");
    }
}
