import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        String platNomor;
        int jumlahJam;
        double harga;
       
        Scanner s  = new Scanner (System.in);
        System.out.println("Masukkan Nomor Plat: ");
        platNomor = s.nextLine();
        System.out.println("Jumlah Jam: ");
        jumlahJam = s.nextInt();
        
        if(jumlahJam >0 && jumlahJam<=1){
            harga=3000;
        }else if(jumlahJam >1 && jumlahJam<=4){
            harga=7000;
        }else if(jumlahJam > 4){
            harga = 10000;
        }else{
            harga = 0;
            System.out.println("System Eror");
        }
            System.out.println(platNomor);
            System.out.println("Tarif Parkir "+harga);
    }
}