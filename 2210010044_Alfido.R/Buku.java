public class Buku{
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    //method constructor
    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    //method getter
    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlah_halaman(){
        return this.jumlah_halaman;
    }

    public double getHarga(){
        return this.harga;
    }

    //method setter
    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setJumlah_halaman(int jumlah_halaman){
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    //overloading
   public void naikkanHarga(){
        System.out.println("Ini method untuk Naikkan Harga");
    }

    public void naikkanHarga(double Kenaikan){
        System.out.println("Ini method untuk Kenaikan");
    }
}