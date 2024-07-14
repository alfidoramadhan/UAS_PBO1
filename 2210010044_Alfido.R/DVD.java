public class DVD{
    private int id;
    private String judul;
    private String genre;
    private int tahunRilis;
    private double harga;

    //method constructor
    public DVD(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    //method getter
    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getTahunRilis(){
        return this.tahunRilis;
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

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setTahunRilis(int tahunRilis){
        this.tahunRilis = tahunRilis;
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