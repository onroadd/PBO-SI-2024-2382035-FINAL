package repository;

import entity.mahasiswa;
import java.util.HashMap;

public class mahasiswarepository {
    private HashMap<String, mahasiswa> datamahasiswa;

    public mahasiswarepository() {
        datamahasiswa = new HashMap<>();
    }

    public void tambahmahasiswa(mahasiswa mahasiswa) {
        if (!datamahasiswa.containsKey(mahasiswa.getNama())) {
            datamahasiswa.put(mahasiswa.getNama(), mahasiswa);
            System.out.println(mahasiswa.getNama() + " berhasil ditambahkan.");
        } else {
            System.out.println(mahasiswa.getNama() + " sudah ada dalam daftar.");
        }
    }

    public mahasiswa carimahasiswa(String nama) {
        return datamahasiswa.get(nama);
    }


    public HashMap<String, mahasiswa> getSemuamahasiswa() {
        return datamahasiswa;
    }
}
