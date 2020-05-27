package CSGO.Spammer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyChecker extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent event) {
        char ch = event.getKeyChar();

        if (ch == 'q' || ch == 'Q') {
            System.exit(0);
        }
    }
}