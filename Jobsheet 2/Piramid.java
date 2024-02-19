public class Piramid {
    double panjangSisiPersegi, panjangRusukSegitiga, tinggi;

    public double hitungVolume (){
        return (panjangSisiPersegi*panjangSisiPersegi) * (1.0/3.0) * tinggi;
    }

    public double hitungKeliling (){
        return 4 * panjangSisiPersegi + panjangRusukSegitiga;
    }

    public void tampilHasil (){
        double keliling = hitungKeliling();
        double volume = hitungVolume();
        System.out.printf("Volume bangunan tersebut adalah: %.2f", volume);
        System.out.println();
        System.out.printf("Keliling bangunan tersebut adalah: %.2f", keliling);
    }
}
