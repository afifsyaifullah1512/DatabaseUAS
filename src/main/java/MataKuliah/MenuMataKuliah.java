package MataKuliah;

import Home.Home;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class MenuMataKuliah {
    private static Connection connection;
    private static DataInputStream dataInputStream;

    public MenuMataKuliah(Connection connection) {
    }

    public static void MenuMataKuliah() throws IOException {
        dataInputStream = new DataInputStream(System.in);
        int pilihan = 0;
        try {
            System.out.println("===========Mata Kuliah=============");
            System.out.println("===================================");
            System.out.println("1. Input Mata Kuliah ");
            System.out.println("2. Lihat Mata Kuliah");
            System.out.println("3. Edit Mata Kuliah");
            System.out.println("4. Delete Mata Kuliah");
            System.out.println("5. Back To Home ");
            System.out.println("\n");
            System.out.println("Masukkan Pilihan : ");
            pilihan = Integer.valueOf(dataInputStream.readLine());

            switch (pilihan) {
                case 1:
                    InputMataKuliah inputMataKuliah = new InputMataKuliah(connection);
                    inputMataKuliah.inputMataKuliah();
                case 5:
                    Home backToHome = new Home(connection);
                    backToHome.home();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        MenuMataKuliah();
    }
}
