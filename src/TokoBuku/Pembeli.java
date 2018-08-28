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
public class Pembeli extends Toko{
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private String no_telp;

    public Pembeli(int id_brg, String nama_brg, int harga_brg, String merk_brg) {
        super(id_brg, nama_brg, harga_brg, merk_brg);
    }
    
    public Pembeli(int id_brg, String nama_brg, int harga_brg, String merk_brg, 
            int id_pembeli, String nama_pembeli, String alamat, String no_telp){
        super(id_brg, nama_brg, harga_brg, merk_brg);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    @Override
    public void info(){
        System.out.println("ID Pembeli      : "+this.id_pembeli);
        System.out.println("Nama Pembeli    : "+this.nama_pembeli);
        System.out.println("Alamat          : "+this.alamat);
        System.out.println("No Telp         : "+this.no_telp);
        super.info();
    }

}
