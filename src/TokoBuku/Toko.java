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
public class Toko {
    private int id_brg;
    private String nama_brg;
    public static int harga_brg;
    private String merk_brg;
    
    public Toko (int id_brg, String nama_brg, int harga_brg, String merk_brg){
        this.id_brg = id_brg;
        this.nama_brg = nama_brg;
        this.harga_brg = harga_brg;
        this.merk_brg = merk_brg;
    }
    public void info()
    {
        System.out.println("ID Barang       : "+this.id_brg);
        System.out.println("Nama Barang     : "+this.nama_brg);
        System.out.println("Harga Barang    : "+this.harga_brg);
        System.out.println("Merk Barang     : "+this.merk_brg);
        
    }
}
