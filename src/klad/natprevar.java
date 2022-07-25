package klad;
public class natprevar {
    private int sifra;
    private String T1, T2;
    private double k1, k0, k2;
    private double k02, k3;
    private int G1, G2;
    private boolean R1=false;
    private boolean R0=false;
    private boolean R2=false;
    private boolean R02=false;
    private boolean R3=false;

    public natprevar(int sifra, String T1, String T2, double k1, double k0, double k2, double k02, double k3) {
        this.sifra = sifra;
        this.T1 = T1;
        this.T2 = T2;
        this.k1 = k1;
        this.k0 = k0;
        this.k2 = k2;
        this.k02 = k02;
        this.k3 = k3;
    }

    public natprevar(int sifra, String T1, String T2, int G1, int G2) {
        this.sifra = sifra;
        this.T1 = T1;
        this.T2 = T2;
        this.G1 = G1;
        this.G2 = G2;
    }

   
    public boolean R1(){
     if(G1>G2)
         return true;
     return false;
 }   
 public boolean R0(){
     if(G1==G2)
         return true;
     return false;
 }   
 public boolean R2(){
     if(G1<G2)
         return true;
     return false;
 }   
 public boolean R02(){
     if(G1+G2<=2)
         return true;
     return false;
 }   
 public boolean R3(){
     if(G1+G2>=3)
         return true;
     return false;
 }  


    public int getG1() {
        return G1;
    }

    public int getG2() {
        return G2;
    }
    

    public int getSifra() {
        return sifra;
    }

    public String getT1() {
        return T1;
    }

    public String getT2() {
        return T2;
    }

    public double getK1() {
        return k1;
    }

    public double getK0() {
        return k0;
    }

    public double getK2() {
        return k2;
    }

    public double getK02() {
        return k02;
    }

    public double getK3() {
        return k3;
    }
    

    @Override
    public String toString() {
        return  sifra + " " + T1 + ":" + T2 + "\n 1= " + k1 + "  X= " + k0 + "  2= " + k2 +  
                "\n 0-2= " + k02 + " 3+= " + k3 ;
    }

    
}
