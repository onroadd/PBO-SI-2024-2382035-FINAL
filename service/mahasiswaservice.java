package service;

import entity.mahasiswa;
import repository.mahasiswarepository;

public class mahasiswaservice {
    private mahasiswarepository repository;

    public mahasiswaservice(mahasiswarepository repository) {
        this.repository = repository;
    }

    public void catatKehadiran(String nama) {
        mahasiswa mahasiswa = repository.carimahasiswa(nama);
        if (mahasiswa != null) {
            mahasiswa.setHadir(true);
            System.out.println(nama + " telah hadir.");
        } else {
            System.out.println(nama + " tidak ditemukan dalam daftar.");
        }
    }

    public void tampilkanAbsensi() {
        System.out.println("Daftar Absensi:");
        for (mahasiswa mahasiswa : repository.getSemuamahasiswa().values()) {
            String status = mahasiswa.isHadir() ? "Hadir" : "Tidak Hadir";
            System.out.println(mahasiswa.getNama() + ": " + status);
        }
    }
}
