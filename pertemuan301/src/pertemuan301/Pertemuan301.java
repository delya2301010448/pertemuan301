/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Delya Sintya
 * TGL 18 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama ="";
        String kelas ="";
        String noAbsen ="";
        int nilai =0;
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Input Nama Siswa: ");
            nama = dtIN.readLine();
        
            System.out.print("Input Kelas: ");
            kelas = dtIN.readLine(); 
            
            System.out.print("Input Nilai: ");
            nilai = Integer.parseInt(dtIN.readLine());
        
        }catch(IOException err){
            System.out.println("Error Baca Keyboard");
        }
        String ket="Tidak Lulus";
        
        noAbsen = JOptionPane.showInputDialog("Input Data Absen");
        
        if(nilai>60){
            ket = "Lulus";
        }else {
            ket = "Tidak Lulus";
        }
        System.out.printf("Nama siswa %s dari kelas %s dengan nilai %d dinyatakan %s",nama,kelas,nilai,ket);
    }
    
}
