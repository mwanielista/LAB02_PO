import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JPanel panel1;
    private JTextField celcjusz_input;
    private JTextField farenheit_input;
    private JButton wyjscieButton;
    private JButton konwertujButton;
    private JButton wyczyscButton;
    private JRadioButton czcionkaMalaRadioButton;
    private JRadioButton czcionkaSredniaRadioButton;
    private JRadioButton czcionkaDuzaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;

    private double tempCelcjusz;
    private double tempFarenheit;

    public App(){
        super("Konwertowanie stopni C -> F");
        this.setContentPane(panel1);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object object = e.getSource();

                if(object == konwertujButton){
                    tempCelcjusz = Double.parseDouble(celcjusz_input.getText());
                    tempFarenheit = 32.0 + (9.0/5.0) * tempCelcjusz;
                    farenheit_input.setText(String.valueOf(tempFarenheit));
                } else if(object == wyczyscButton){
                    celcjusz_input.setText("");
                    farenheit_input.setText("");
                    if(wielkieLiteryCheckBox.isSelected()) wielkieLiteryCheckBox.setSelected(false);
                    if(czcionkaMalaRadioButton.isSelected()) czcionkaMalaRadioButton.setSelected(false);
                    if(czcionkaSredniaRadioButton.isSelected()) czcionkaSredniaRadioButton.setSelected(false);
                    if(czcionkaDuzaRadioButton.isSelected()) czcionkaDuzaRadioButton.setSelected(false);
                } else if(object == wyjscieButton){
                    dispose();
                } else if(object == wielkieLiteryCheckBox){
                    if(wielkieLiteryCheckBox.isSelected()) {
                        farenheit_input.setFont(new Font("SansSerif", Font.BOLD, 18));
                        celcjusz_input.setFont(new Font("SansSerif", Font.BOLD, 18));
                    }
                    else {
                        farenheit_input.setFont(new Font("SansSerif", Font.PLAIN, 12));
                        celcjusz_input.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    }
                } else if(object == czcionkaDuzaRadioButton){
                    farenheit_input.setFont(new Font("SansSerif", Font.PLAIN, 20));
                    celcjusz_input.setFont(new Font("SansSerif", Font.PLAIN, 20));
                } else if(object == czcionkaSredniaRadioButton){
                    farenheit_input.setFont(new Font("SansSerif", Font.PLAIN, 18));
                    celcjusz_input.setFont(new Font("SansSerif", Font.PLAIN, 18));
                } else if(object == czcionkaMalaRadioButton){
                    farenheit_input.setFont(new Font("SansSerif", Font.PLAIN, 10));
                    celcjusz_input.setFont(new Font("SansSerif", Font.PLAIN, 10));
                } else if(object == resetujButton) {
                    farenheit_input.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    celcjusz_input.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
        };
        konwertujButton.addActionListener(actionListener);
        wyczyscButton.addActionListener(actionListener);
        wyjscieButton.addActionListener(actionListener);
        resetujButton.addActionListener(actionListener);
        wielkieLiteryCheckBox.addActionListener(actionListener);
        czcionkaSredniaRadioButton.addActionListener(actionListener);
        czcionkaMalaRadioButton.addActionListener(actionListener);
        czcionkaDuzaRadioButton.addActionListener(actionListener);

    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        int DEFAULT_WIDTH = 400;
        int DEFAULT_HEIGHT = 200;
        app.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
