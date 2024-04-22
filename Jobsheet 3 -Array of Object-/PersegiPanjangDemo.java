import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah object: ");
        int jumlahObject = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahObject];
        int panjang, lebar;

        for (int i = 0 ;  i < arrayOfPersegiPanjang.length ; i++){
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan Panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukan Lebar: ");
            lebar = sc.nextInt(); 
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0 ;  i < arrayOfPersegiPanjang.length ; i++){
            System.out.println("------------------------------------------");
            arrayOfPersegiPanjang[i].cetakInfo(i);
            System.out.println("------------------------------------------");
        }
        sc.close();
    }
}