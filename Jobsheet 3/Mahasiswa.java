public class Mahasiswa {
    String nama, NIM, jenisKelamin;
    double ipk;

    public void tampil(int i){
        System.out.println("------------------------");
        System.out.println("Data Mahasiwa ke-" + (i+1));
        System.out.println("------------------------");
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }
}
