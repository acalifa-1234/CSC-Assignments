/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACQUAH MICHAEL PS/CSC/19/0091
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public abstract class StackGui implements ActionListener {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Container");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        JTabbedPane pane = new JTabbedPane();
        StackPanel stackPanel = new StackPanel();
        pane.addTab("Stack", stackPanel);
        stackPanel.setLayout(new BorderLayout(0, 0));

        JTextPane stacktext = new JTextPane();
        stacktext.setText(
                "A Stack in Java is a container for variables, similar to an Array. It could be visualised as a stack of plates or books, where you would need to remove plates in order to access plates that are further down the stack. A Stack uses these keywords; Push, Pop and Peek.\r\n\r\nPush: Pushes another variable to the top of the stack.\r\nPop: Removes the top variable from the stack.\r\nPeek: Returns the variable at the top of the stack");
        stackPanel.add(stacktext, BorderLayout.SOUTH);

        JPanel function = new JPanel();
        stackPanel.add(function, BorderLayout.WEST);
        function.setSize(540, 980);

        JTextField txtinput = new JTextField();
        function.add(txtinput);
        txtinput.setColumns(10);
        String number = txtinput.getText();

        JTextArea jTextArea = new JTextArea(20, 1);
        jTextArea.setEditable(false);

        JButton btnPush = new JButton("Push");
        function.add(btnPush);
        btnPush.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = txtinput.getText();
                if (!input.isEmpty()) {
                    stack.push(Integer.parseInt(input));
                    System.out.println("input = " + input);
                    jTextArea.setText("");
                    stack.forEach(element -> jTextArea.append(element + System.lineSeparator())); // \n)
                } else {
                    System.out.println("Input is empty");
                }
            }
        });

        JButton btnPop = new JButton("Pop");
        function.add(btnPop);

        JButton btnPeek = new JButton("Peek");
        function.add(btnPeek);

        JPanel display = new JPanel();
        stackPanel.add(display, BorderLayout.CENTER);

        pane.addTab("Queue", new QueuePanel());
        pane.addTab("Stack", new StackPanel());

        frame.getContentPane().add(pane);
        frame.setVisible(true);
    }
}
