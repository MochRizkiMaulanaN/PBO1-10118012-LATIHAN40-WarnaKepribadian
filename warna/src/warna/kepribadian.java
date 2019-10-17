/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warna;

/**
 *
 * @author LENOVO
 */
public class kepribadian {
    public static final String ANST_RESET="\u001B[0m";
    public static final String ANST_BLACK="\u001B[0m";
    public static final String ANST_RED="\u001B[0m";
    public static final String ANST_GREEN="\u001B[0m";
    public static final String ANST_YELLOW="\u001B[0m";
    public static final String ANST_BLUE="\u001B[0m";
    public static final String ANST_PURPLE="\u001B[0m";
    public static final String ANST_CYAN="\u001B[0m";
    public static final String ANST_WHITE="\u001B[0m";
    
    public static final String ANST_BLACK_BACKGROUND="\u001B[0m";
    public static final String ANST_RED_BACKGROUND="\u001B[0m";
    public static final String ANST_GREEN_BACKGROUND="\u001B[0m";
    public static final String ANST_YELLOW_BACKGROUND="\u001B[0m";
    public static final String ANST_BLUE_BACKGROUND="\u001B[0m";
    public static final String ANST_PURPLE_BACKGROUND="\u001B[0m";
    public static final String ANST_CYAN_BACKGROUND="\u001B[0m";
    public static final String ANST_WHITE_BACKGROUND="\u001B[0m";
    
    public void cetak(){
        
        
        System.out.println(ANST_RED+"YUK "+ANST_GREEN+"CEK "+ANST_YELLOW+"KEPRIBADIANMU "+ANST_CYAN+"DARI "+ANST_PURPLE+ "WARNA "+ANST_BLUE+"FAVORITMU"+ANST_RESET);
        System.out.println(ANST_RED_BACKGROUND+"\t\t MERAH \t\t");
        System.out.println(ANST_GREEN_BACKGROUND+"\t\t HIJAU \t\t");
        System.out.println(ANST_YELLOW_BACKGROUND+"\t\t KUNING \t\t");
        System.out.println(ANST_BLUE_BACKGROUND+"\t\t BIRU \t\t");
        System.out.println(ANST_PURPLE_BACKGROUND+"\t\t UNGU \t\t");
        String[][] kep ={
            {
                "Menyenangkan,",
                "Bijaksana,",
                "Pembawaan Diri Tenang Saat Menghadapi Masalah"
            },
            {
                "Periang,",
                "Pemberani,",
                "Berani MEngambil Resiko Dalam Setiap Langkah"
            },
            {
                "Optimis,",
                "Suka Bergaul,",
                "Periang"
            },
            {
                "Optimis,",
                "Tidak Pernah Ragu,",
                "Menurutnya Pasangan Yang Ideal Adalah Yang Memiliki Mental Yang Kuat"
            },
            {
                "Romantis,",
                "Menyukai Hal Yang Berbau Alami Dan Keindahan,",
                "Teguh Pada Prinsip"
            }
        };
        int[] panjang = {8,7,10,7,7};
        System.out.println("Pilih Warna Favoritmu");
        String fav=input.nextLine().toUpperCase();
        String nama =input.nextLine();
        
        System.out.println("\n=== Hasil Tes Kepribadian"+nama+" ==="+"\n Warna Favoritmu Adalah");
        int pilih =0;
        switch(fav){
            case "BIRU":
                pilih =0;
                System.out.println(ANST_BLUE);
                break;
            
            case "MERAH":
                pilih =1;
                System.out.println(ANST_RED);
                break;
                
            case "KUNING":
                pilih =2;
                System.out.println(ANST_YELLOW);
                break;
                
            case "UNGU":
                pilih =3;
                System.out.println(ANST_PURPLE);
                break;
                
            case "HIJAU":
                pilih =4;
                System.out.println(ANST_GREEN);
                break;
                
            default:
                pilih = 5;
                break;
        };
        System.out.println(fav+ANST_RESET);
        if(pilih == 5){
            System.out.println("UPS..beLUM TERIDENTIFIKASI");
        }else{
            for(int i =0; i<panjang[pilih]; i++ ){
                System.out.println((i+1)+" . "+kep[pilih][i]);
            }
        }
    }
}
