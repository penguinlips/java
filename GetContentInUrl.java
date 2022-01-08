/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author penguinlips
 */
public class ReadWebPageEx {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://penguinlips.github.io/updates/test/java.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        }
    }
}
