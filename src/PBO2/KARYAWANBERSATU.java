package PBO2;
import java.util.Scanner;

public class KARYAWANBERSATU {
  public static void main(String[] agrs) {
          // objek
       // KARYAWAN kry = new KARYAWAN ("ERVAN","213");
          
         // System.out.println(kry.displayinfo());
         // System.out.println(kry.displayinfo("A12"));
         
         //io sederhana
         Scanner scanner = new Scanner (System.in);
         //array
         INFORMASIKARYAWAN[] kry  = new INFORMASIKARYAWAN[2];
         
         System.out.print("Masukan Nama Karyawan1:");
         String nama1 = scanner.nextLine();
         System.out.print("Masukan Nomer Karyawan1:");
         String nomer1 = scanner.nextLine();
        
         //objek
         kry[0]= new INFORMASIKARYAWAN( nama1, nomer1);
         
         System.out.println(kry[0].displayinfo());
         
  }        
                   
}
