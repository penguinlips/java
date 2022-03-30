/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ping;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class Ping {
    public static void main(String args[]) throws Exception {
 
 
HttpURLConnection connection = (HttpURLConnection) new URL("https://www.google.com").openConnection();
connection.setRequestMethod("HEAD");
int responseCode = connection.getResponseCode();


if (responseCode <300 && responseCode >=200) {
    System.out.println("2xx Status Code [Success]");
}

if (responseCode <400 && responseCode >=300) {
    System.out.println("3xx Status Code [Redirection]");
}

if (responseCode <500 && responseCode >=400) {
    System.out.println("4xx Status Code (Client Error)");
}

if (responseCode <600 && responseCode >=500) {
    System.out.println("5xx Status Code (Server Error)");
}

}
}
