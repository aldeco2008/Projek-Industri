public class PBOsiswa{
    public static void main(String[] args) {
        System.out.println("Semangat Belajar ");
        PBOsiswa D = new PBOsiswa();
        D.tampilNama();
        System.out.println(D.usia(2008));
    }

    public void tampilNama(){
        String nama= "Deco";
        System.out.println("Nama Siswa: "+nama);
    }    
            
            public int usia(int tahunLahir){
                int usia=2024-tahunLahir;
                return usia;
        }
}