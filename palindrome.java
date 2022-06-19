
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MICHAE ACQUAH PS/CSC/19/0091
 */
public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String line = reader.readLine();

            if (line.toLowerCase().equals("quit")) {
                break;
            }

            Stack<Character> stack = new Stack<Character>();

            Queue<Character> queue = new LinkedList<Character>();

            for (int i = 0; i < line.length(); i++) {
                stack.push(line.charAt(i));
            }

            for (int i = 0; i < line.length(); i++) {
                queue.add(line.charAt(i));
            }

            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                if (queue.remove().equals(stack.pop())) {
                    continue;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            if (!isPalindrome) {
                System.out.println("Not a Palindrome");
            } else {
                System.out.println("Palindrome");
            }

        }
    }
}
