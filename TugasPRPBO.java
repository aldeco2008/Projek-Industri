// Definisi class
class Mahasiswa {
    // Atribut
    String nama;
    int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

public class TugasPRPBO {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Aldeco", 19);

        // Memanggil metode untuk menampilkan informasi
        mahasiswa1.displayInfo();
}
}