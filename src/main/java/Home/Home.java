package Home;

import Mahasiswa.MenuMahasiswa;
import MataKuliah.MenuMataKuliah;
import Nilai.InputNilai;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class Home {
    private static Connection connection;
    private static DataInputStream dataInputStream;

    public Home(Connection connection) {
    }

    public static void home() throws IOException {
        dataInputStream = new DataInputStream(System.in);
        int pilihan = 0;
        try {
            System.out.println("==========Home==========");
            System.out.println("========================");
            System.out.println("1. Mahasiswa ");
            System.out.println("2. Mata Kuliah ");
            System.out.println("3. Nilai ");
            System.out.println("4. Exit ");
            System.out.println("\n");
            System.out.println("Masukkan Pilihan : ");
            pilihan = Integer.valueOf(dataInputStream.readLine());

            switch (pilihan) {
                case 1:
                    MenuMahasiswa menuMahasiswa = new MenuMahasiswa(connection);
                    menuMahasiswa.MenuMahasiswa();
                case 2:
                    MenuMataKuliah menuMataKuliah = new MenuMataKuliah(connection);
                    menuMataKuliah.MenuMataKuliah();
                case 3:
                    InputNilai inputNilai = new InputNilai(connection);
                    inputNilai.inputNilai();
                case 4:
                    System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        home();
    }
}
