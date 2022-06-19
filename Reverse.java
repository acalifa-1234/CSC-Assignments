
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MICHAEL ACQUAH /PS/CSC/19/0091
 */
public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String line = reader.readLine();

            if (line.toLowerCase().equals("quit")) {
                break;
            }

            Stack<String> stack = new Stack<String>();

            for (int i = line.length() - 1; i >= 0; i--) {
                stack.add(line.charAt(i) + "");
            }

            String output = "";

            for (String s : stack) {
                output += s;
            }

            System.out.println(output);

        }
    }
    
}
