/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Delya Sintya
 * TGl 18 Maret 2025
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jml = 0;
        Scanner dtIN = new Scanner(System.in);
        System.out.print("Jumlah Perulangan: ");
        jml = Integer.parseInt(dtIN.nextLine());
        
        for(int i=1;i<=jml;i++){
            System.out.println("Perulangan ke-"+i);
        }
        System.out.println("Perulangan While");
        int awal = 0;
        while(awal<=jml){
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }
        System.out.println("Perulangan do While");
        awal = 1;
        do{
            System.out.println("Perulangan ke"+awal);
            awal++;
        }while(awal<=jml);
        
    }
    
}
