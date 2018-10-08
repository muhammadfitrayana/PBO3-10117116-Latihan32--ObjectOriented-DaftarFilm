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
public class Film {
  public  String filmName;
  public  String filmGenre;
  public  double filmRating;
  public  int    filmDuration;
  public void nowPlaying (String filmName,String filmGenre,double filmRating,
                          int filmDuration) {
       
        System.out.println("Judul Film\t: "+filmName);
        System.out.println("Genre Film\t: "+filmGenre);
        System.out.println("Rating Film\t: "+filmRating);
        System.out.println("Durasi Film\t: "+filmDuration+" Menit");
        System.out.println("");
   }  
}
