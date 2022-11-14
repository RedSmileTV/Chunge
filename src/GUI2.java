import javax.swing.*;
import java.awt.*;

public class GUI2 extends JFrame {

    private JTextField numField1 = new JTextField();
    
    private JTextField numField2 = new JTextField();

    public GUI2() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(600, 300);
        setResizable(false);
        setVisible(true);

        Container cp = getContentPane();
        cp.setLayout(null);

        cp.setBackground(Color.darkGray);

        int fieldLocationX = 25;
        int fieldLocationY = 25;
        int fieldWidth = 100;
        int fieldHeight = 50;

        numField1.setSize(fieldWidth, fieldHeight);
        numField1.setLocation(fieldLocationX, fieldLocationY);
        numField1.setBackground(Color.gray);

        numField2.setSize(fieldWidth, fieldHeight);
        numField2.setLocation(fieldLocationX + 330,  fieldLocationY);
        numField2.setBackground(Color.gray);

        cp.add(numField1);
        cp.add(numField2);

    }
}
