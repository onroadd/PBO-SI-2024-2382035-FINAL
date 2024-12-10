package controller;

import entity.mahasiswa;
import repository.mahasiswarepository;
import service.mahasiswaservice;

import java.util.Scanner;

public class AbsensiApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mahasiswarepository repository = new mahasiswarepository();
        mahasiswaservice service = new mahasiswaservice(repository);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Catat Kehadiran");
            System.out.println("3. Tampilkan Absensi");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaTambah = scanner.nextLine();
                    repository.tambahmahasiswa(new mahasiswa(namaTambah));
                    break;
                case 2:
                    System.out.print("Masukkan nama mahasiswa yang hadir: ");
                    String namaHadir = scanner.nextLine();
                    service.catatKehadiran(namaHadir);
                    break;
                case 3:
                    service.tampilkanAbsensi();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
