import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Prgm7 {
 public static void main(String[] args) {
 // Create a new JFrame
 JFrame frame = new JFrame("Swing Event Handling Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // Create a new JPanel
 JPanel panel = new JPanel();
 // Create two JButtons
 JButton alphaButton = new JButton("Alpha");
 JButton betaButton = new JButton("Beta");
 // Create an ActionListener for the Alpha button
 ActionListener alphaListener = new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(frame, "Alpha pressed");
 }
 };
 // Create an ActionListener for the Beta button
 ActionListener betaListener = new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(frame, "Beta pressed");
 }
 };
 // Add ActionListeners to the buttons
 alphaButton.addActionListener(alphaListener);
 betaButton.addActionListener(betaListener);
 // Add the buttons to the panel
 panel.add(alphaButton);
 panel.add(betaButton);
 // Add the panel to the frame
 frame.getContentPane().add(panel, BorderLayout.CENTER);
 // Set the frame size and make it visible
 frame.setSize(300, 200);
 frame.setVisible(true);
 }
}

