import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JPanel panel1;
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton szescianRadioButton;
    private JRadioButton prostopadloscianRadioButton;
    private JRadioButton kulaRadioButton;
    private JRadioButton walecRadioButton;
    private JTextField input_BokA;
    private JTextField input_BokB;
    private JTextField input_wysokosc;
    private JTextField input_promien;
    private JTextField wynik_pole;
    private JTextField wynik_obwod;
    private JTextField wynik_objetosc;
    private JButton obliczButton;
    private JButton wyczyscButton;

    public App(){
        super("Fiugry geometryczne - kalkulator");
        this.setContentPane(panel1);

        input_BokA.setEnabled(false);
        input_BokB.setEnabled(false);
        input_wysokosc.setEnabled(false);
        input_promien.setEnabled(false);
        wynik_pole.setEnabled(false);
        wynik_obwod.setEnabled(false);
        wynik_objetosc.setEnabled(false);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object object = e.getSource();

                if(object == wyczyscButton){
                    input_BokA.setText("");
                    input_BokB.setText("");
                    input_wysokosc.setText("");
                    input_promien.setText("");
                    wynik_pole.setText("");
                    wynik_obwod.setText("");
                    wynik_objetosc.setText("");
                }

                if(kwadratRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(false);
                    input_wysokosc.setEnabled(false);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                } else if (prostokątRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(true);
                    input_wysokosc.setEnabled(false);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                } else if(trapezRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(true);
                    input_wysokosc.setEnabled(true);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                } else if(trójkątRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(true);
                    input_wysokosc.setEnabled(true);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                } else if(szescianRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(true);
                    input_wysokosc.setEnabled(true);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                }else if(prostopadloscianRadioButton.isSelected()){
                    input_BokA.setEnabled(true);
                    input_BokB.setEnabled(true);
                    input_wysokosc.setEnabled(true);
                    input_promien.setEnabled(false);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                }else if(kulaRadioButton.isSelected()){
                    input_BokA.setEnabled(false);
                    input_BokB.setEnabled(false);
                    input_wysokosc.setEnabled(false);
                    input_promien.setEnabled(true);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);
                }else if(walecRadioButton.isSelected()){
                    input_BokA.setEnabled(false);
                    input_BokB.setEnabled(false);
                    input_wysokosc.setEnabled(true);
                    input_promien.setEnabled(true);
                    wynik_pole.setEnabled(false);
                    wynik_obwod.setEnabled(false);
                    wynik_objetosc.setEnabled(false);

                }
                if(object == obliczButton){
                    if(kwadratRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        wynik_pole.setText(String.valueOf(a*a));
                        wynik_obwod.setText(String.valueOf(4*a));
                        wynik_objetosc.setText("brak");
                    } else if (prostokątRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        double b = Double.parseDouble(input_BokB.getText());
                        wynik_pole.setText(String.valueOf(a*b));
                        wynik_obwod.setText(String.valueOf(2*a+2*b));
                        wynik_objetosc.setText("brak");
                    } else if(trapezRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        double b = Double.parseDouble(input_BokB.getText());
                        double h = Double.parseDouble(input_wysokosc.getText());
                        wynik_pole.setText(String.valueOf(((a+b)*h)/2));
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText("brak");
                    } else if(trójkątRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        double h = Double.parseDouble(input_wysokosc.getText());
                        wynik_pole.setText(String.valueOf((a*h)/2));
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText("brak");


                    } else if(szescianRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        wynik_pole.setText(String.valueOf(6*(a*a)));
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText(String.valueOf(a*a*a));
                    }else if(prostopadloscianRadioButton.isSelected()){
                        double a = Double.parseDouble(input_BokA.getText());
                        double b = Double.parseDouble(input_BokB.getText());
                        double h = Double.parseDouble(input_wysokosc.getText());
                        wynik_pole.setText(String.valueOf(2*((a*b)+(a*h) + (h*b))));
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText(String.valueOf(a*b*h));
                    }else if(kulaRadioButton.isSelected()){
                        double r = Double.parseDouble(input_promien.getText());
                        wynik_pole.setText("brak");
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText(String.valueOf((4/3) * Math.PI * Math.pow(r, 3)));
                    }else if(walecRadioButton.isSelected()){
                        double r = Double.parseDouble(input_promien.getText());
                        double H = Double.parseDouble(input_wysokosc.getText());
                        wynik_pole.setText(String.valueOf(2*Math.PI*Math.pow(r,2) + 2 * Math.PI*r*H));
                        wynik_obwod.setText("brak");
                        wynik_objetosc.setText(String.valueOf(Math.PI * Math.pow(r,2) * H));
                    }
                }
            }
        };
        kwadratRadioButton.addActionListener(actionListener);
        prostokątRadioButton.addActionListener(actionListener);
        trójkątRadioButton.addActionListener(actionListener);
        trapezRadioButton.addActionListener(actionListener);
        szescianRadioButton.addActionListener(actionListener);
        prostopadloscianRadioButton.addActionListener(actionListener);
        kulaRadioButton.addActionListener(actionListener);
        walecRadioButton.addActionListener(actionListener);
        obliczButton.addActionListener(actionListener);
        wyczyscButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        final int DEFAULT_WIDTH = 600;
        final int DEFAULT_HEIGHT = 400;
        app.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
