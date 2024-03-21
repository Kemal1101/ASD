public class Demo {
    public static void main(String[] args) {
        Kelas kelas1A = new Kelas(5);
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);

        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);

        System.out.println("-------------------------");
        System.out.println("Sorting Berdasarkan IPK");
        System.out.println("-------------------------");
        kelas1A.bubbleSortByIpk();
        kelas1A.displayInfo();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Sorting Berdasarkan Umur");
        System.out.println("-------------------------");
        kelas1A.selectionSortByUmur();
        kelas1A.displayInfo();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Sorting Berdasarkan IPK Descending");
        System.out.println("-------------------------");
        kelas1A.insertionSortByIpkDesc();
        kelas1A.displayInfo();
    }
}
