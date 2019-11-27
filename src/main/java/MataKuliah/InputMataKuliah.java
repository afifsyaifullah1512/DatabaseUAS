package MataKuliah;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class InputMataKuliah {
    static Connection connection;
    private static DataInputStream input;

    public InputMataKuliah(Connection connection) {
        connection = connection;
    }

    public static void inputMataKuliah() throws IOException {
        input = new DataInputStream(System.in);
        String kode_mk = "", nama_mk = "", sks = "", jenis_mk = "";

        System.out.println("=====================================");
        System.out.println("==========Input Mata Kuliah==========");
        System.out.println("=====================================");
        try {
            System.out.println("Kode Mata Kuliah            : ");
            kode_mk = String.valueOf(input.readLine());
            System.out.println("Nama Mata Kuliah            : ");
            nama_mk = String.valueOf(input.readLine());
            System.out.println("SKS                         : ");
            sks = String.valueOf(input.readLine());
            System.out.println("Jenis Mata Kuliah           : ");
            jenis_mk = String.valueOf(input.readLine());


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("============Output===============");
        System.out.println("Kode Mata Kuliah            : " + kode_mk);
        System.out.println("Nama Mata Kuliah            : " + nama_mk);
        System.out.println("SKS                         : " + sks);
        System.out.println("Jenis Mata Kuliah           : " + jenis_mk);
        System.out.println("\n");
        MenuMataKuliah.MenuMataKuliah();
    }

    public static void main(String[] args) throws IOException {

    }
}
