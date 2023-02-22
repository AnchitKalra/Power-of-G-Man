package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            Grid grid = new Grid();
            String s = "";
            while (sc.hasNext()) {
               //Add your code here to process input commands
                 s += sc.next() + " ";

                }
           // System.out.println(s);
            //System.out.println(s);
            System.out.println(Constants.POWER + " " + grid.getPower(s));


            sc.close(); // closes the scanner
        } catch (IOException e) {
        }

    }
}
