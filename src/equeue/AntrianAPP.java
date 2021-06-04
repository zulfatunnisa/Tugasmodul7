package equeue;

public class AntrianAPP {
     public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.masuk(73);
        antrian.lihat();
        System.out.println("");
        antrian.masuk(45);
        antrian.lihat();
        System.out.println("");
        antrian.masuk(80);
        antrian.lihat();
        System.out.println("");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
        System.out.println("");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
    }
}

    

