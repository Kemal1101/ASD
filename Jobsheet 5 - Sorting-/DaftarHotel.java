public class DaftarHotel {
    Hotel [] daftarHotel;
    int index;

    public DaftarHotel(int kuota){
        daftarHotel = new Hotel [kuota];
    }

    public void add(Hotel hotel){
        if (index < daftarHotel.length){
            daftarHotel [index] = hotel;
            index++;
        }else {
            System.out.println("!!! Sudah Penuh !!!");
        }
    }

    public void displayInfo (){
        for (Hotel hotel : daftarHotel) {
            hotel.info();
        }
    }

    public void bubbleSortHargaHotel (){
        int n = daftarHotel.length;

        for (int i = 0; i < n - 1 ; i++){
            for (int j = 0 ; j < n - i - 1; j++){
                if (daftarHotel[j].harga > daftarHotel[j + 1].harga){
                    Hotel temp = daftarHotel[j];
                    daftarHotel[j] = daftarHotel[j+1];
                    daftarHotel[j+1] = temp;
                }
            }
        }
    }

    public void SelectionSortRating (){
        int n = daftarHotel.length;

        for (int i = 0; i < n - 1; i++){
            int minIndex = i;

            for (int j = i+1; j < n; j++){
                if (daftarHotel[j].rating > daftarHotel[minIndex].rating){
                    minIndex = j;
                }
            }
            Hotel temp = daftarHotel[minIndex];
            daftarHotel[minIndex] = daftarHotel[i];
            daftarHotel[i] = temp;
        }
    }
}
