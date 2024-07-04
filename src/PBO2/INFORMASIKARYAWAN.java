
package PBO2;
//inheritance
public class INFORMASIKARYAWAN extends KARYAWAN {
 //overriding
      public INFORMASIKARYAWAN(String nama, String nomer){
        super(nama, nomer);
    }

    public int getTahunMasuk() {
        return Integer.parseInt(getNomer().substring(0, 2))+ 2000;
    }
    public  String getBagian(){
            //seleksi if
        String kodeBag = getNomer().substring(2, 4);
        if(kodeBag.equals("3")){
            return "service";
        }else {
            return "bagian lain";
        }
    }
        //polymorphise (overriding)
    public String displayinfo(){
         return super.displayinfo()+
                 "\nTahun Masuk: "+getTahunMasuk()+
                 "\nBagian: "+getBagian();
                            
        }
}
        
  



