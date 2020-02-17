
package perpustakaan;

import java.util.Scanner;

public class Pegawai {
    public void datadiri(){
        Scanner pegawai = new Scanner (System.in);
        String nama, nip;
        System.out.print("Nama    : ");
        nama = pegawai.nextLine();
        System.out.print("NIP   : ");   
        nip = pegawai.nextLine();
    }
}
