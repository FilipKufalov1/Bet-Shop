
package klad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;

public class Klad {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int izbor;
        String ime="";int broj=0;int sifra=0;String tip="";int uplata=0;
        List<String> iminja=new ArrayList<>();
        List<Integer> broevi=new ArrayList<>();
        List<List<Integer>> sifri1=new ArrayList<>();
        List<List<String>> tipovi1=new ArrayList<>();
        List<Integer> uplati=new ArrayList<>();
        List<natprevar> natprevari=new ArrayList<natprevar>();
        List<natprevar> rezultati=new ArrayList<natprevar>();
        
        natprevar n1=new natprevar(101,"Milan","Inter",2,3,2.7,1.7,2.1);
        natprevar n2=new natprevar(102,"AEK","PAOK",1.9,3.1,2.2,1.5,2.3);
        natprevar n3=new natprevar(103,"Real","Barca",2.1,3,2.7,2.7,1.5);
        natprevar n4=new natprevar(104,"Liverpool","Chelsea",1.8,3.1,3.7,1.8,2.2);
        natprevar n5=new natprevar(105,"Vardar","Shkendija",1.5,4.5,6.7,1.6,2.25);
        natprevari.add(n1);
        natprevari.add(n2);
        natprevari.add(n3);
        natprevari.add(n4);
        natprevari.add(n5);
        natprevar r1=new natprevar(101,"Milan","Inter", 2, 1);
        natprevar r2=new natprevar(102,"AEK","PAOK", 0, 1);
        natprevar r3=new natprevar(103,"Real","Barca", 2, 2);
        natprevar r4=new natprevar(104,"Liverpool","Chelsea", 2, 0);
        natprevar r5=new natprevar(105,"Vardar","Shkendija", 3, 1);
        rezultati.add(r1);
        rezultati.add(r2);
        rezultati.add(r3);
        rezultati.add(r4);
        rezultati.add(r5);
        
        System.out.println("=====*****FIC-BET*****=====");
         do{
            System.out.println("Odberete opcija");
            System.out.println("1) Lista na natprevari ");
            System.out.println("2) Nov tiket");
            System.out.println("3) Rezultati");
            System.out.println("4) Site tiketi: ");
            System.out.println("5) Dobitni tiketi: ");
            System.out.println("0) Kraj");
             izbor=s.nextInt();
             System.out.println("==========================");
            switch(izbor){
                case 1:
                    System.out.println("==========================");
                    System.out.println("Lista na natprevari");
                    System.out.println("==========================");
                    for(natprevar n:natprevari)
                    System.out.println(n.toString());
                break;
                case 2:
                   System.out.println("Vasheto ime: ");
                    ime=s.next();
                    iminja.add(ime);
                    System.out.println("Broj na natprevari: ");
                    broj=s.nextInt();
                    List<Integer> sif=new ArrayList<>();
                    List<String> ti=new ArrayList<>();
                    int[] sifri=new int[broj];
                    String[] tipovi=new String[broj];
                    for(int i=0; i<broj; i++){
                        System.out.println("Sifra: ");
                        sifri[i]=s.nextInt();
                        
                        sif.add(sifri[i]);
                        System.out.println("Tip: ");
                        tipovi[i]=s.next();
                        ti.add(tipovi[i]);
                    }
                    sifri1.add(sif);
                    tipovi1.add(ti);
                    System.out.println("Vrednost na uplata vo denari: ");
                    uplata=s.nextInt();
                    uplati.add(uplata);
                    break;    
                case 3:
                    System.out.println("Lista na rezultati: ");
                            for(natprevar r:rezultati){
                                System.out.println(r.getT1()+" : "+r.getT2()+"  "+r.getG1()+" : "+r.getG2());
                            System.out.println("=====================================================");
                            }
                   break;
                case 4:
                    System.out.println("Lista na uplateni tiketi");
                    System.out.println("=======================");
                    for(int i=0;i<uplati.size();i++){
                       System.out.println("Ime: "+iminja.get(i));
                        for(int j=0;j<sifri1.get(i).size();j++)
                            System.out.println(sifri1.get(i).get(j)+" "+tipovi1.get(i).get(j));
                        System.out.println("Uplata: "+uplati.get(i));
                        System.out.println("=======================");
                    }
                    break;
                case 5:
                    System.out.println("Lista na dobitni tiketi");
                    System.out.println("=======================");
                    
                    
                    for(int i=0;i<sifri1.size();i++){
                        double koef=1;
                        for(int j=0;j<sifri1.get(i).size();j++){
                           for(int j1=0;j1<rezultati.size();j1++){
                               
                 if(sifri1.get(i).get(j)==rezultati.get(j1).getSifra()){
                     if(tipovi1.get(i).get(j).equals("1")&&(rezultati.get(j1).getG1()>rezultati.get(j1).getG2()))
                     koef=koef*natprevari.get(j1).getK1();
                     else if(tipovi1.get(i).get(j).equals("2")&&(rezultati.get(j1).getG1()<rezultati.get(j1).getG2()))
                     koef=koef*natprevari.get(j1).getK2();
                     else if(tipovi1.get(i).get(j).equals("0")&&(rezultati.get(j1).getG1()==rezultati.get(j1).getG2()))
                     koef=koef*natprevari.get(j1).getK0();
                     else if(tipovi1.get(i).get(j).equals("0-2")&&(rezultati.get(j1).getG1()+rezultati.get(j1).getG2()<=2))
                     koef=koef*natprevari.get(j1).getK02();
                     else if(tipovi1.get(i).get(j).equals("3+")&&(rezultati.get(j1).getG1()+rezultati.get(j1).getG2()>2))
                     koef=koef*natprevari.get(j1).getK3();
                     else koef*=0;
                 }
                 }
                       }
                        if(koef!=0){
                      
                        System.out.println("Ime: "+iminja.get(i));
                    for(int t=0;t<sifri1.get(i).size();t++)
                        System.out.println(sifri1.get(i).get(t)+"  "+tipovi1.get(i).get(t));
                    System.out.println("Uplata: "+uplati.get(i));
                    System.out.println("Koeficient: "+koef);
                    System.out.println("Dobivka: "+koef*uplati.get(i));
                    System.out.println("=======================");
                        }}break;
         }}while(izbor!=0);
    
    }
    
}
