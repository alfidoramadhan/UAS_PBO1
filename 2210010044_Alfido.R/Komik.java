//subclass
public class Komik extends Buku {
    private int volume;

   //method getter
    public int getVolume(){
        return this.volume;
    }

     public void naikkanHarga(){
        System.out.println("Ini method untuk Naikkan Harga Komik");
    }
}