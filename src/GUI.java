import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI extends JFrame {
    // Anfang Attribute
    private JTextField first = new JTextField();
    private JTextField second = new JTextField();
    private JTextField op = new JTextField();

    private JTextField result = new JTextField();

    private JButton bClickme = new JButton();
    // Ende Attribute

    public GUI() {
        // Frame-Initialisierung
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 300;
        int frameHeight = 300;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Calculator");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten
        bClickme.setBounds(54, 108, 163, 49);
        bClickme.setText("Calculate");
        bClickme.setMargin(new Insets(2, 2, 2, 2));
        bClickme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bClickme_ActionPerformed(evt);
            }
        });
        cp.add(bClickme);
        first.setBounds(0, 32, 100, 44);
        second.setBounds(185, 32, 100, 44);
        op.setBounds(102, 32, 80, 44);
        result.setBounds(15, 200, 250, 44);
        cp.add(first);
        cp.add(second);
        cp.add(op);
        cp.add(result);

        // Ende Komponenten

        setVisible(true);
    } // end of public HalloSwing

    // Anfang Methoden

    public static void main(String[] args) {
        new GUI();
    } // end of main

    public void bClickme_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        int firstNumber = Integer.parseInt(first.getText());
        int secondNumber = Integer.parseInt(second.getText());
        String operator = op.getText();

        switch (operator) {
            case "+":
                result.setText("Result: " + (firstNumber + secondNumber));
                break;

            case "-":
                result.setText("Result: " + (firstNumber - secondNumber));
                break;

            case "*":
                result.setText("Result: " + (firstNumber * secondNumber));
                break;

            case "/":
                result.setText("Result: " + (firstNumber / secondNumber));
                break;
            case "sq":
                result.setText("Result: " + Math.sqrt(firstNumber));
                break;
            default:
                result.setText("You are a nigger");
        }
    } // end of bClickme_ActionPerformed

    // Ende Methoden
} // end of class HalloSwing