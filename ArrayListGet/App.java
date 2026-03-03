// package arraylist;

// import java.util.ArrayList;
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

//         int jumlah = 3;
        
//         for(int i = 0; i < jumlah; i++) {
//             System.out.println("Mahasiswa ke - " + i);

//             System.out.println("Masukan nama: ");
//             String nama = a.nextLine();

//             System.out.println("Masukan umur: ");
//             int umur = a.nextInt();
//             a.nextLine();

//             System.out.println("Masukan jurusan: ");
//             String jurusan = a.nextLine();

//             daftarMahasiswa.add(new Mahasiswa(nama, umur, jurusan));
//         }
//         System.out.println("=== DAFTAR MAHASISWA ===");

//         for(Mahasiswa mahasiswa : daftarMahasiswa) {
//             mahasiswa.tampilkanDatane();
//         }
//         a.close();
//     }
// }


package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
        Scanner a = new Scanner(System.in);

        // int jumlah = 3;

        // System.out.println("Masukan nama mahasiswa: ");
        // String nama = a.nextLine();

        // System.out.println("Masukan umur mahasiswa: ");
        // int umur = a.nextInt();
        // a.nextLine();

        // System.out.println("Masukan jurusan mahasiswa: ");
        // String jurusan = a.nextLine();

        daftarMahasiswa.add(new Mahasiswa("Snapdowg",19, "Informatika"));
        daftarMahasiswa.add(new Mahasiswa("Ricky", 19, "Informatika"));
        daftarMahasiswa.add(new Mahasiswa("Richie", 19, "Informatika"));

        for(int j = 0; j < daftarMahasiswa.size(); j++) {
            daftarMahasiswa.get(j).tampilkanDatane();
        }
        a.close();
    }
}
