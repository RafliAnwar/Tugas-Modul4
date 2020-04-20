
package tugas_modul4_kel34;

import java.util.Scanner;

public class Tugas_modul4_kel34 {
    int pajak,harga,jumlah,bayar,tagihan,kembali;
    String tujuan;
    Scanner in = new Scanner(System.in);
    static void tampil(){
        System.out.print("=========================================\n"
                + "PROGRAM PENJUALAN TIKET BUS\n"
                + "     TERMINAL TEMBALANG\n "
                + "by : M Dzulfiqar Rafli A-21120119130065\n"
                + "     Nuzulita Setiawati  -21120119130075\n"
                + "     Kelompok 34 shift 1\n"
                + "========================================\n");
    }
    static void metode_bayar(){
        System.out.println("===================================================");
        System.out.println("Segera proses pembayaran anda, untuk mencetak tiket");
        System.out.println("Dapat melalui E-Banking,Kartu Kredit,ATM,Alfamarett");
        System.out.println("Cek SMS/email anda untuk melihat kode dan link pembayaran ");
        System.out.println("===================================================");
    }
    public static void main(String[] args) {
        methodkel34 objek = new methodkel34();
        Scanner in = new Scanner(System.in);
        tampil();
        
        System.out.print("Masukkan nama anda: ");
        String nama = in.next();
        System.out.print("Masukkan email anda: ");
        String email = in.next();
        System.out.println();
        
        String tiket[][] = {{" ","Bandung", "Jakarta", "Surabaya", "Pontianak", "Pulau Bali"},{" ","100000", "150000", "100000", "200000", "250000"}};
        System.out.println("Daftar Tiket Tujuan - Harga Tiket");
        
        for(int i=1 ;i < tiket[0].length;i++){
            System.out.println(i+"."+tiket[0][i]+ "\t    Rp."+tiket[1][i]);
        }
        System.out.println("6.==>Exit<==");
        
        int kondisi = 1;
        while (kondisi == 1){
            System.out.println("Masukkan kode pilihan anda");
            int kode = in.nextInt();    
            switch (kode){
                case(1):
                    objek.beli_tiket(100000);
                    metode_bayar();
                    objek.akhir();
                    break;
                case(2):
                    objek.beli_tiket(150000);
                    metode_bayar();
                    objek.akhir();
                    break;
                case(3):
                    objek.beli_tiket(100000);
                    metode_bayar();
                    objek.akhir();
                    break;
                case(4):
                    objek.beli_tiket(200000);
                    metode_bayar();
                    objek.akhir();
                    break;
                case(5):
                    objek.beli_tiket(250000);
                    metode_bayar();
                    objek.akhir();
                    break;
                case(6):
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan\n");
                    break;  
            }
        }
    }
}
