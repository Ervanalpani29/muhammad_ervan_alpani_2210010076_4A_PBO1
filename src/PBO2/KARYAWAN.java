package PBO2;
//class
public class KARYAWAN {
    // atribut dan encapsution
 private String nama;
 private String nomer;

 //construktor
    public KARYAWAN(String nama, String nomer) {
        this.nama = nama;
        this.nomer = nomer;
    }
//mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }
//accesor
    public String getNama() {
        return nama;
    }

    public String getNomer() {
        return nomer;
    }
public String displayinfo() {
    return "Nama: "+getNama()+
           "\nnomer: "+getNomer();
}
//polymophism (overloading)
 public String displayinfo(String ruangan) {
    return displayinfo()+"\nruangan: "+ruangan;
}
}

