/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author WINDOWS 10
 */
public class Transaksi extends Pembeli{
    private static int jmlh;
    
    public Transaksi(int jmlh, String nama_pembeli, String alamat, String no_telp, int id_pembeli, 
            String nama_brg, int id_brg, String merk_brg, int harga_brg){
        super(id_brg, nama_brg, harga_brg, merk_brg, id_pembeli, nama_pembeli, alamat, no_telp);
        Transaksi.jmlh = jmlh;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Jumlah Barang   : "+Transaksi.jmlh);
    }
    public static void main(String[] args){
        System.out.println("========TOKO BUKU DIVA========");
        Transaksi rn = new Transaksi(31, "Azzahra", "Jl.Sawojajar 19", "0895393414133", 15, "Planner Book", 50000, "Hipo", 2);
        rn.info();
        System.out.println("==============================");
        System.out.println("Kasir   : Nandhita");
        System.out.println("Tanggal : 31/07/2015");
    }
}
