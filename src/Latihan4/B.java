/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class B  extends A{
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    //melakukan override terhadap method tampilkan Nilai ()
    //yang terdapat pada kelas A
    
    public void tempilkanNilai (){
        super.tampilkanNilai (); //memanggil method dlm kls A
        System.out.println("Nilai b : "+getB());
    }
}
