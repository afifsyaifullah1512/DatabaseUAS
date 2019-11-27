package Mahasiswa;


import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class InputMahasiswa {
    static Connection connection;
    private static DataInputStream input;

    public InputMahasiswa(Connection connection) {
        connection = connection;
    }

    public static void inputMahasiswa() throws IOException {
        input = new DataInputStream(System.in);
        String nobp = "", nama = "", kelas = "", jurusan = "";

        System.out.println("===========Input Mahasiswa===========");
        System.out.println("=====================================");
        try {
            System.out.println("No BP             : ");
            nobp = String.valueOf(input.readLine());
            System.out.println("Nama              : ");
            nama = String.valueOf(input.readLine());
            System.out.println("Kelas             : ");
            kelas = String.valueOf(input.readLine());
            System.out.println("Jurusan           : ");
            jurusan = String.valueOf(input.readLine());


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("============Output===============");
        System.out.println("No BP             : " + nobp);
        System.out.println("Nama              : " + nama);
        System.out.println("Kelas             : " + kelas);
        System.out.println("Jurusan           : " + jurusan);
        System.out.println("\n");
        MenuMahasiswa.MenuMahasiswa();
    }

    public static void main(String[] args) throws IOException {

    }
}