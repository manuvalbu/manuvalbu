/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalidaarchivos;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 64492
 */
public class EntradaSalidaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            String palabra;
            String linea;
            char[] buffer=new char[200];

            File f = new File("textoprueba.txt");


            //FileWriter fw = null;
            //try {
              //  fw = new FileWriter(f);
            //} catch (IOException ex) {
           //     Logger.getLogger(EntradaSalidaArchivos.class.getName()).log(Level.SEVERE, null, ex);
           // }
           // try {
            //    fw.append("hola:hola");
           //     fw.append("adios");
             //   fw.flush();
            //} catch (IOException ex) {
             //   Logger.getLogger(EntradaSalidaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            //}

            FileReader fr = null;
            try {
                fr = new FileReader(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EntradaSalidaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                                
                fr.read(buffer);
                System.out.println(buffer);
            } catch (IOException ex) {
                Logger.getLogger(EntradaSalidaArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            Scanner s=new Scanner(f);
            s.useDelimiter("/n");
            while (s.hasNext()){
            System.out.println(s.next());}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntradaSalidaArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }
}
