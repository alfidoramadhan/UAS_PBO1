//subclass
public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    //method
    public void menambahMasaAktif(int tambahan){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    //overriding
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}