
package perpustakaan;

import java.util.Scanner;
import perpustakaan.buku.Majalah;
import perpustakaan.buku.Novel;

public class Perpustakaan {

    public static void main(String[] args) {
        int x, jmlbk, lama;
        Scanner pegawai = new Scanner (System.in);
        Scanner buku = new Scanner (System.in);
        Scanner pilih = new Scanner (System.in);
        System.out.println("Selamat Datang di Perpustakaan!!!");
        System.out.println("Silahkan Isi Data Diri Anda!");
        Pegawai data = new Pegawai();
        data.datadiri();
        System.out.println("");
        System.out.println("Menu    : ");
        System.out.println("1. Novel");
        System.out.println("2. Majalah");
        System.out.print("Pilih bacaan : ");
        x = pilih.nextInt();
        switch(x){
            case 1:
                Novel databuku1 = new Novel();
                databuku1.macam();
                System.out.print("Banyak Buku yang Dipinjam : ");
                jmlbk = buku.nextInt();
                System.out.print("Lama Pinjam : ");
                lama = buku.nextInt();
                break;
            case 2 :
                Majalah databuku2 = new Majalah();
                databuku2.contoh();
                System.out.print("Banyak buku yang dipinjam : ");
                jmlbk = buku.nextInt();
                System.out.print("Lama Pinjam : ");
                lama = buku.nextInt();
                break;
            default :
                System.out.println("Pilihan yang Anda Inputkan Salah!!!");
                break;
        }
    }
    
}
