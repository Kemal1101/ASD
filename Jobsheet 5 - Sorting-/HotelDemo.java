public class HotelDemo {
    public static void main(String[] args) {
        DaftarHotel listHotel = new DaftarHotel(5);

        Hotel hotel1 = new Hotel("Hotel A", 1500000, 5);
        Hotel hotel2 = new Hotel("Hotel B", 700000, 3);
        Hotel hotel3 = new Hotel("Hotel C", 700000, 3);
        Hotel hotel4 = new Hotel("Hotel D", 1200000, 4);
        Hotel hotel5 = new Hotel("Hotel E", 1200000, 5);

        listHotel.add(hotel1);
        listHotel.add(hotel2);
        listHotel.add(hotel3);
        listHotel.add(hotel4);
        listHotel.add(hotel5);

        System.out.println("-------------------------");
        System.out.println("Sorting Berdasarkan Harga");
        System.out.println("-------------------------");
        listHotel.bubbleSortHargaHotel();
        listHotel.displayInfo();


        System.out.println("---------------------------");
        System.out.println("Sorting Berdasarkan Rating");
        System.out.println("---------------------------");
        listHotel.SelectionSortRating();
        listHotel.displayInfo();
    }
}
