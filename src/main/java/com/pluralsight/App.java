package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which story would you like to read?");
        String fileName = scanner.nextLine();
        int i = 0;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(i + ". " + line);
                i++;
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
