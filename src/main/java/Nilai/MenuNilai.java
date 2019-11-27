package Nilai;

import Home.Home;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class MenuNilai {
    private static Connection connection;
    private static DataInputStream dataInputStream;

    public MenuNilai(Connection connection) {
    }

    public static void MenuNilai() throws IOException {
        dataInputStream = new DataInputStream(System.in);
        int pilihan = 0;
        try {
            System.out.println("============Nilai============");
            System.out.println("=============================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Lihat Nilai");
            System.out.println("3. Edit Nilai");
            System.out.println("4. Delete Nilai");
            System.out.println("5. Back To Home ");
            System.out.println("\n");
            System.out.println("Masukkan Pilihan : ");
            pilihan = Integer.valueOf(dataInputStream.readLine());

            switch (pilihan) {
                case 1:
                    InputNilai inputNilai = new InputNilai(connection);
                    inputNilai.inputNilai();
                case 5:
                    Home backToHome = new Home(connection);
                    backToHome.home();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        MenuNilai();
    }
}

