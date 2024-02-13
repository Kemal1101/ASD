import java.util.Scanner;
public class PlatMobil22 {
    public static void main(String[] args) {
        boolean sudah = true;
        Scanner sc = new Scanner(System.in);
        char kota [] = {'A','B','D','E','F','G','H','L','N','T'}; 
        char kodekota [][] = new char[10][12];
        kodekota [0] = "BANTEN".toCharArray();
        kodekota [1] = "JAKARTA".toCharArray();
        kodekota [2] = "BANDUNG".toCharArray();
        kodekota [3] = "CIREBON".toCharArray();
        kodekota [4] = "BOGOR".toCharArray();
        kodekota [5] = "PEKALONGAN".toCharArray();
        kodekota [6]= "SEMARANG".toCharArray();
        kodekota [7] = "SURABAYA".toCharArray();
        kodekota [8] = "MALANG".toCharArray();
        kodekota [9] = "TEGAL".toCharArray();

        do{
            System.out.print("Input Plat yang Ingin Diketahui (\"sudah\" untuk selesai): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("sudah")){
                sudah = false;
            }else {
                char charInput = input.charAt(0);
                for (int i = 0; i < 10 ; i++){
                    if (charInput == kota [i]){
                        for (char kotaa : kodekota[i]) {
                            System.out.print(kotaa + " ");
                        }
                        break;
                    }else if (charInput != kota [i] && i == 9) {
                        System.out.print("!!! COBA LAGI !!!");
                    }
                }
                System.out.println();
            }
        }while (sudah);
        sc.close();
    }
}
