package Nilai;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;

public class InputNilai {
    static Connection connection;
    private static DataInputStream input;

    public InputNilai(Connection connection) {
        connection = connection;
    }

    public static void inputNilai() throws IOException {
        input = new DataInputStream(System.in);
        String nobp = "", nama = "", kode_mk = "", nama_mk = "", huruf = "";
        int nilai_tugas = 0, nilai_uts = 0, nilai_uas = 0, nilai_akhir = 0;

        System.out.println("=====================================");
        System.out.println("=============Input Nilai=============");
        System.out.println("=====================================");
        try {
            System.out.println("No BP             : ");
            nobp = String.valueOf(input.readLine());
            System.out.println("Nama              : ");
            nama = String.valueOf(input.readLine());
            System.out.println("Kode MK           : ");
            kode_mk = String.valueOf(input.readLine());
            System.out.println("Nama MK           : ");
            nama_mk = String.valueOf(input.readLine());
            System.out.println("Nilai Tugas       : ");
            nilai_tugas = Integer.valueOf(input.readLine());
            System.out.println("Nilai UTS         : ");
            nilai_uts = Integer.valueOf(input.readLine());
            System.out.println("Nilai UAS         : ");
            nilai_uas = Integer.valueOf(input.readLine());

            nilai_akhir = ((nilai_tugas * 20) + (nilai_uts * 30) + (nilai_uas * 50)) / 100;
            if (nilai_akhir >= 80) {
                huruf = "A";
            } else if (nilai_akhir >= 65) {
                huruf = "B";
            } else if (nilai_akhir >= 50) {
                huruf = "C";
            } else if (nilai_akhir >= 30) {
                huruf = "D";
            } else {
                huruf = "E";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("============Output===============");
        System.out.println("No BP              : " + nobp);
        System.out.println("Nama               : " + nama);
        System.out.println("Kode MK            : " + kode_mk);
        System.out.println("Nama MK            : " + nama_mk);
        System.out.println("Nilai Tugas        : " + nilai_tugas);
        System.out.println("Nilai UTS          : " + nilai_uts);
        System.out.println("Nilai UAS          : " + nilai_uas);
        System.out.println("Nilai Akhir        : " + nilai_akhir);
        System.out.println("Huruf              : " + huruf);
        System.out.println("\n");
        MenuNilai.MenuNilai();
    }

    public static void main(String[] args) throws IOException {

    }
}
