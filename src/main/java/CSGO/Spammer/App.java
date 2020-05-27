package CSGO.Spammer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws AWTException, InterruptedException {
        JFrame f = new JFrame();

        JTextField textField = new JTextField();
        textField.addKeyListener(new KeyChecker());
        f.add(textField);
        f.setVisible(true);
        String text = JOptionPane.showInputDialog(f, "Enter text to spam");
        String[] textStringArr = text.split("");
        char[] textArr = new char[textStringArr.length];
        for (int i = 0; i < textStringArr.length; i++) {
            textArr[i] = textStringArr[i].charAt(0);
            System.out.println(textArr[i]);
        }
        Robot r = new Robot();

        boolean b = true;
        while (b) {
            for (char c : textArr) {
                int code = (int) c;
                System.out.println(c + ", " + code);
                r.keyPress(code);
                r.keyRelease(code);
                Thread.sleep(100);
            }

            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }
    }
}