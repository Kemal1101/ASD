public class Hotel {
    public String nama;
    public int harga;
    public int rating;

    public Hotel (String nama, int harga, int rating){
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
    }

    public void info(){
        System.out.println("----------------");
        System.out.println("Nama: " + nama + "\nHarga: " + harga + "\nRating: " + rating);
        System.out.println("----------------");
    }
}
