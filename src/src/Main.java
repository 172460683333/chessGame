package src;

import src.view.ChessGameFrame;
import src.view.ChessGameFrame;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            ChessGameFrame mainFrame = new ChessGameFrame(1000, 760);
            mainFrame.setVisible(true);
        });
    }
}
