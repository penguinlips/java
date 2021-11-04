/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//java program to find network connection in realtime

package packagename;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author penguinlips
 */

public class RealtimeConStatus {
   public static void main(String[] args) {
      boolean var1= true;
      boolean var2= false;
      while(true){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
               URL url = new URL("http://www.google.com");
               URLConnection connection = url.openConnection();
               connection.connect();
               if (var1 == true){
               System.out.println("Internet is connected");
               var1 = false;
               var2 = false;
               }
            } catch (MalformedURLException e) {
               if (var2 == false){
               System.out.println("You are offline");
               var2 = true;
               var1 = true;
               }
            } catch (IOException e) {
               if (var2 == false){
               System.out.println("Your are offline");
               var2 = true;
               var1 = true;
               }
            }
        }
    }
}