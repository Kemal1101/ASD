public class PersegiPanjang{
    public int panjang, lebar;

    public PersegiPanjang (int p, int l){
        panjang = p;
        lebar = l;
    }


    public void cetakInfo (int i){
        System.out.println("Persegi panjang ke-" + (i+1) + ", panjang: " + panjang +
            ", lebar: " + lebar);
        System.out.println("Keliling: " + keliling() + ", Luas: " + luas());
    }

    public int luas(){
        int luas = panjang * lebar;
        return luas;
    }

    public int keliling (){
        int keliling = 2 * (panjang+lebar);
        return keliling;
    }
}