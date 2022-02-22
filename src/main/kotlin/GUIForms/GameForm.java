package GUIForms;

import javax.swing.*;

public class GameForm extends JFrame {

    public GameForm() {
        initComponents();

        this.add(new GameArea());
    }

    private void initComponents() {

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameForm().setVisible(true);
            }
        });

    }

}
