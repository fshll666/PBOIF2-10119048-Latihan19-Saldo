/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan19.saldo;

import java.util.Scanner;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Saldo Tabungan
 */
public class PBOIF210119048Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int lama, i;
        String hasil;
        float bunga;
        double saldoAwal, saldoTotal;
        
        System.out.print("Saldo Awal\t : Rp. ");
        saldoAwal = input.nextDouble();
        System.out.print("Bunga/bulan(%)\t : ");
        bunga = input.nextFloat();
        System.out.print("Lama (bulan)\t : ");
        lama = input.nextInt();
        
        bunga =  (float) (bunga/100);
        System.out.println(bunga);
     
        for (i=1;i<=lama;i++){
             saldoTotal = saldoAwal + (bunga * saldoAwal);
             System.out.println("Saldo dibulan ke-" + i +" " + saldoTotal);
    }
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");;
    }
    
}
