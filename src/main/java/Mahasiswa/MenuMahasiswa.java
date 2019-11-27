package Mahasiswa;

import Home.Home;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class MenuMahasiswa {
    private static Connection connection;
    private static DataInputStream dataInputStream;

    public MenuMahasiswa(Connection connection) {
    }

    public static void MenuMahasiswa() throws IOException {
        dataInputStream = new DataInputStream(System.in);
        int pilihan = 0;
        try {
            System.out.println("==========Mahasiswa==========");
            System.out.println("=============================");
            System.out.println("1. Input Mahasiswa ");
            System.out.println("2. Lihat Mahasiswa ");
            System.out.println("3. Edit Mahasiswa ");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Back To Home ");
            System.out.println("\n");
            System.out.println("Masukkan Pilihan : ");
            pilihan = Integer.valueOf(dataInputStream.readLine());

            switch (pilihan) {
                case 1:
                    InputMahasiswa inputMahasiswa = new InputMahasiswa(connection);
                    inputMahasiswa.inputMahasiswa();
                case 5:
                    Home backToHome = new Home(connection);
                    backToHome.home();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        MenuMahasiswa();
    }
}
