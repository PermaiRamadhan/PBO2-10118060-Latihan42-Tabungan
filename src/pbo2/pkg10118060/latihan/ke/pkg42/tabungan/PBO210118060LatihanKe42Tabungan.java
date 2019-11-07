/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg42.tabungan;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menampilkan sisa saldo dari saldo yang
 * sudah diambil
 */
public class PBO210118060LatihanKe42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabung = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : "
                + tabung.ambilUang(scanner.nextInt()));
    }
    
}
