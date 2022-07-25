package klad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tiket {
     private String ime;
     private String tip;
     int broj;
     private int sifra;
     private  int uplata;
     
     
    static Scanner s=new Scanner(System.in);
    
      static String vnesiIme(String ime){
        System.out.println("Vnesi ime: ");
        ime=s.next();
        return ime;
    }
     static int brojNaNatprevari(int broj){
        System.out.println("Vnesi broj na natprevari: ");
        broj=s.nextInt();
        return broj;
    }
    static int vnesiSifra(int sifra){
        System.out.println("Sifra: ");
        sifra=s.nextInt();
        return sifra;
    }
     static String vnesiTip(String tip){
        System.out.println("Tip: ");
        tip=s.next();
        return tip;
    }
     static int vnesiUplata(int uplata){
        System.out.println("Vnesi uplata vo denari: ");
        uplata=s.nextInt();
        return uplata;
    }

    public String getIme() {
        return ime;
    }

    public String getTip() {
        return tip;
    }

    public int getBroj() {
        return broj;
    }

    public int getSifra() {
        return sifra;
    }

    public int getUplata() {
        return uplata;
    }

    public static Scanner getS() {
        return s;
    }
     
}
