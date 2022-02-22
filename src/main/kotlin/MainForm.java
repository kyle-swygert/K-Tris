import GUIForms.GameArea;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class MainForm extends JFrame {
    private JLabel scoreLabel;
    private JPanel boardPanel;
    private JPanel nextPanel;
    private JPanel holdPanel;
    private JLabel holdLabel;
    private JLabel nextLabel;
    private JLabel linesLabel;
    private JLabel levelLabel;
    private JTable table1;


    public static void main(String args[]) {

        //scoreLabel.setText("Goblin Man in Main Function of MainForm class");

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });


    }


    private void createUIComponents() {
        // TODO: place custom component creation code here

        // create individual cells that will be used to represent the cell class objects that are used in the program.
        // how could I create a grid of cells programatically rather than manually placing all 200 cells...

        this.scoreLabel.setText("Goblin Man");


    }
}
