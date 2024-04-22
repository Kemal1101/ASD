public class Main {
    Parkir [] daftarParkir;
    int index;

    public Main (int kuota){
        daftarParkir = new Parkir[kuota];
    }

    public void add (Parkir parkir){
        if (index < daftarParkir.length){
            daftarParkir[index] = parkir;
            index++;
        }    
    }

    public void displayInfo(){
        int i = 1;
        for (Parkir parkir : daftarParkir){
            System.out.println("Kendaraan " + i);
            parkir.DisplayInfo();
            i++;
        }
    }

    public void sequentialSearchByPlat(String searchPlat){
        for (int i = 0 ; i < daftarParkir.length ; i++){
            if (daftarParkir[i].platNomor.contains(searchPlat)){
                daftarParkir[i].DisplayInfo();
            }
        }
    }

    public void laporan (){
        int totalMobil = 0, totalMotor = 0;
        for (int i = 0; i < daftarParkir.length ; i++){
            if (daftarParkir[i].tipeKendaraan.equalsIgnoreCase("motor")){
                totalMotor += daftarParkir[i].hargaParkir;
            }else {
                totalMobil += daftarParkir[i].hargaParkir;
            }
        }
        System.out.println("--------------------");
        System.out.println("Total Pendapatan");
        System.out.println("Mobil: " + totalMobil);
        System.out.println("Motor: " + totalMotor);
        System.out.println("--------------------");
    }
}
