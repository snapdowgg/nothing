package basic;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswas = new Mahasiswa[4];

        for (int i = 1; i < daftarMahasiswas.length; i++) {
            System.out.println("Mahasiswa ke - " + i);

            System.out.println("Masukan nama: ");
            String nama = a.nextLine();
        
            System.out.println("Masukan umur: ");
            int umur = a.nextInt();
            a.nextLine(); // untuk membersihkan buffer setelah membaca angka dalam artian kalau integer itu ga kebaca enter, bisa bisa next nya langsung ke enter

            System.out.println("Masukan jurusan: ");
            String jurusan = a.nextLine();

            daftarMahasiswas[i] = new Mahasiswa(nama, umur, jurusan);
        }
        System.out.println("=== DAFTAR MAHASISWA ===");
        for (int i = 1; i < daftarMahasiswas.length; i++) {
            daftarMahasiswas[i].tampilkanDatane();
        }
        a.close();
    }
}
