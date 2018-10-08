/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan32.objectoriented.daftarfilm;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Daftar Film dengan orientasi Objek
 *  
 */
public class PBO310117116Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    System.out.println("=====DAFTAR FILM YANG SEDANG TAYANG====="+"\n");
        
    Film film1 = new Film();
    
    film1.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
    film1.nowPlaying("Small Foot", "Animation", 9.0, 96);
    film1.nowPlaying("Crazy Rich Asian", "Comedy",7.8,119);
    film1.nowPlaying("Asih","Horror",6.0,100);
    }    
}
    

