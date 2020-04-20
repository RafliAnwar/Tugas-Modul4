
package tugas_modul4_kel34;

import java.util.Scanner;


public class methodkel34 {
    int pajak,harga,jumlah,bayar,tagihan,kembali;
    String tujuan;
   
    public void beli_tiket(int harga){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah:\n");
        jumlah = in.nextInt();
        pajak = harga*10/100;
        if(jumlah >=4){
            System.out.println(">>Pembelian 4 tiket atau lebih,mendapat potongan 5%<<");
            harga = harga * 95/100;
        }
        tagihan = (harga*jumlah)+pajak;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Anda membeli dengan jumlah :"+jumlah+" Tiket bus dengan tujuan Bandung");
        System.out.println("Tagihan anda sebesar Rp. "+tagihan);
        System.out.println("Sudah Termasuk Pajak");
        System.out.println("----------------------------------------------------------------------");
    }
    public void akhir(){
        int kondisi = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin bertransaksi lagi?/n1.Ya/n2.Tidak");
        int pilihan = in.nextInt();
        if(pilihan == 2){
            System.out.println("Terima kasih telah bertransaksi, Semoga selamat sampai tujuan..");
            System.out.println("==>Jangan lupa cetak tiket anda<==");
            System.exit(0);
        }    
    }   
}
