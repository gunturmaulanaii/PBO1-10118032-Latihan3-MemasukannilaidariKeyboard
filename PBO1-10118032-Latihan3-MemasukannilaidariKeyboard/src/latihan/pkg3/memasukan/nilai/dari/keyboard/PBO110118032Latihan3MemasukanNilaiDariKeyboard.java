/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3.memasukan.nilai.dari.keyboard;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA  : Guntur Maulana Ibrahim
 * Kelas : PBO1
 * NIM   : 10118032
 * Deskripsi Program : Program ini berisi untuk menampilkan dan memasukan nilai dari keyboard
 */
public class PBO110118032Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah: " +nama);
    }
    
}
