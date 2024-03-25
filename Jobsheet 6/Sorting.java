public class Sorting {

    public static int sequentialSearch(int []arr, int key){
        int indeks = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == key){
                indeks  = i;
                break;
            }else if (i == (arr.length-1) && arr[i] != key){
                indeks = - 1;
            }
        }
        return indeks;
    }
    
    public static int binarySearchAsc (int [] arr, int key){
        int start = 0, end = arr.length - 1;
        int tengah = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr [mid] == key){
                tengah = mid;
                break;
            }else if (arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if (arr[tengah] == key){
            return tengah;
        }else{
            return -1;
        }
    }

    public static int binarySearchDesc (int [] arr, int key){
        int start = 0, end = arr.length - 1;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (arr [mid] == key){
                return mid;
            }else if (arr[mid] > key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return - 1;
    }

    public static int binarySearch(int [] arr, int key){
        if (arr [0] < arr [arr.length-1]){
            int start = 0, end = arr.length - 1;

            while (start <= end){
                int mid = start + (end - start) / 2;

                if (arr [mid] == key){
                    return mid;
                }else if (arr[mid] < key){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return - 1;
        }else{
            int start = 0, end = arr.length - 1;
        
            while (start <= end){
                int mid = start + (end - start) / 2;
                
                if (arr [mid] == key){
                    return mid;
                }else if (arr[mid] > key){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return - 1;
        }
    }

    public static void main(String[] args) {
        //SEQUENTIAL SEARCH
        System.out.println("----------");
        System.out.println("SEQUENTIAL");
        System.out.println("----------");
        int [] daftarNilai = {10,5,20,15,5,45};
        int indeks = sequentialSearch(daftarNilai, 5);
        if (indeks == -1){
            System.out.println("!!! Data Tidak Ditemukan !!!");
        }else{
            System.out.println("Data ditemukan pada indeks ke-" + indeks);
        }
        System.out.println();

        //BINARY SEARCH
        System.out.println("----------------");
        System.out.println("BINARY ASCENDING");
        System.out.println("----------------");
        int sortedNilaiasc[] = {5,5,10,20,30,40,50};
        int indeks2 = binarySearchAsc(sortedNilaiasc, 5);

        if (indeks2 != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indeks2);
        }else{
            System.out.println("!!! Data Tidak Ditemukan !!!");
        }
        System.out.println();

        System.out.println("-----------------");
        System.out.println("BINARY DESCENDING");
        System.out.println("-----------------");
        int sortedNilaiDesc [] = {50,40,30,20,5,5};
        int indeks3 = binarySearchDesc(sortedNilaiDesc, 20);

        if (indeks3 != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indeks3);
        }else{
            System.out.println("!!! Data Tidak Ditemukan !!!");
        }
        System.out.println();

        System.out.println("--------------");
        System.out.println("BINARY SEARCH");
        System.out.println("--------------");
        int sortedNilai [] = {6,5,4,3,2,1};
        int indeks4 = binarySearch(sortedNilai, 5);

        if (indeks4 != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indeks4);
        }else{
            System.out.println("!!! Data Tidak Ditemukan !!!");
        }
        System.out.println();
    }

}