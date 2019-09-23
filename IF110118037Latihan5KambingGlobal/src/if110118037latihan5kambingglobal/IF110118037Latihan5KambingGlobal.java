/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan5kambingglobal;

/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program dengan variabel Kambing
 *                       menjadi variabel global
 *                       
 */
public class IF110118037Latihan5KambingGlobal {
    //variabel global
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing settelah ditambah: "
                + jumlahKambing);
                
    }
   
    public static void main(String[] args) {
       IF110118037Latihan5KambingGlobal kambingSusu = new IF110118037Latihan5KambingGlobal();
       
       //Menampilkan jumlah Kambing yang ada saat program pertama kali berjalan
       kambingSusu.getJumlahKambing();
       
       //Menambah 5 Kambing
       kambingSusu.tambahKambing();
       
       //Menampilkan Jumlah Kambing yang ada
       kambingSusu.getJumlahKambing();
               
    }
    
}
