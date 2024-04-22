public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda(){
        
    }

    public Sepeda (float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }

    public void tambahKecepatan (float increment){
        float cek = kecepatan + increment;
        if (cek > 20){
            System.out.println("Kecepatan melebihi batas maksimum");
        }else{
            kecepatan += increment;
        }
    }

    public void kurangiKecepatan (float decrement){
        float cek = kecepatan - decrement;
        if (cek < 0){
            System.out.println("Kecepatan telah mencapai minimum.");
        }else {
            kecepatan -= decrement;
        }
    }

    public void cetakInfo(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=================");
    }
}