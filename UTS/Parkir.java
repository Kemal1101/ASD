public class Parkir{
    public String tipeKendaraan;
    public int lamaParkir;
    public String platNomor;
    public int hargaParkir;

    public Parkir(String tipeKendaraan, int lamaParkir, String platNomor){
        this.tipeKendaraan = tipeKendaraan;
        this.lamaParkir = lamaParkir;
        this.platNomor = platNomor;
        this.hargaParkir = hargaParkir(lamaParkir, tipeKendaraan);
    }

    public static int hargaParkir (int lamaParkir, String tipeKendaraan){
        if (tipeKendaraan.equalsIgnoreCase("mobil")){
            return lamaParkir * 3000;
        }else if (tipeKendaraan.equalsIgnoreCase("motor")){
            return lamaParkir * 1000;
        }else {
            return 0;
        }
    }

    public void DisplayInfo (){
        System.out.println("------------------------------");
        System.out.println("Tipe Kendaraan: " + tipeKendaraan);
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Lama Parkir: " + lamaParkir + " jam");
        System.out.println("Harga Parkir: " + "Rp." + hargaParkir);
        System.out.println("------------------------------");
    }
}