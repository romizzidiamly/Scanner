
package DasProMiniProject;
//Kode Scanner
import java.util.Scanner;

public class MiniProjectScannerDasPro {

    public static void main(String[] args) {
    
        Scanner xyz = new Scanner (System.in);
        
        //Masukkan Data Peserta
        System.out.print("Nama : ");
        String nama = xyz.nextLine();
        System.out.print("NISN : ");
        String nisn = xyz.nextLine();
        System.out.print("Nomor Peserta : ");
        String peserta = xyz.nextLine();
        
        System.out.println("Nilai Ujian Nasional");
        //Masukkan Nilai Ujian
        System.out.print("Matematika : ");
        int mtk = xyz.nextInt();
        System.out.print("Bahasa Indonesia : ");
        int bindo = xyz.nextInt();
        System.out.print("Bahasa Inggris : ");
        int bing = xyz.nextInt();
        System.out.print("Kimia : ");
        int kim = xyz.nextInt();
        
        //Rata Rata Ujian
        float nilai = (mtk + bindo + bing + kim)/4;
        
        //Hasil Dari Input Scanner xyz
        System.out.println(" ");
        System.out.println("========== HASIL KELULUSAN UJIAN NASIONAL ==========");
        System.out.println("Nama \t \t \t : " + nama);
        System.out.println("NISN \t \t \t : " + nisn);
        System.out.println("Nomor Peserta \t \t : " + peserta);
        System.out.println("========== NILAI UJIAN NASIONAL ==========");
        System.out.println("Matematika \t \t : " + mtk);
        System.out.println("Bahasa Indonesia \t : " + bindo);
        System.out.println("Bahasa Inggris \t \t : " + bing);
        System.out.println("Kimia \t \t \t : " + kim);
        System.out.println("Nilai Rata-rata \t : " + nilai);
        System.out.println("========== HASIL ==========");
        
        //Batas Nilai Minimal Kelulusan
        if (nilai > 75) {
            System.out.println("SELAMAT ANDA DINYATAKAN LULUS");
        }
        else {
            System.out.println("MOHON MAAF ANDA TIDAK LULUS, JANGAN PUTUS ASA");
        }
        
    }
    
}
