package entity;

public class mahasiswa {
    private String nama;
    private boolean hadir;

    public mahasiswa(String nama) { // Nama konstruktor diubah menjadi "mahasiswa"
        this.nama = nama;
        this.hadir = false;
    }

    public String getNama() {
        return nama;
    }

    public boolean isHadir() {
        return hadir;
    }

    public void setHadir(boolean hadir) {
        this.hadir = hadir;
    }
}
