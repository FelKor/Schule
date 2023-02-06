package Klausurübung_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Klausurübung_4 extends JFrame implements ActionListener, ChangeListener{

    int multiplyer;
    int plusoperation;
    
    JTextField input, output;
    JPanel inputPanel, outputPanel;
    
    JRadioButton ascii, ean;
    Box radioButtonBox;
    ButtonGroup radioButtonGroup;

    JSlider slider;
    Box sliderBox;

    Box topBox1, topBoxfull, botbox;

    JButton doit;
    

    Klausurübung_4(){
        setTitle("Klausurübung");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        input = new JTextField(7);
        inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Buchstabe"));
        inputPanel.add(input);


        ascii = new JRadioButton("ASCII", true);
        ascii.addActionListener(this);
        ascii.setActionCommand("ascii");
        ean = new JRadioButton("EAN", false);
        ean.addActionListener(this);
        ean.setActionCommand("ean");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(ascii);
        radioButtonGroup.add(ean);

        radioButtonBox = new Box(BoxLayout.X_AXIS);
        radioButtonBox.add(ascii);
        radioButtonBox.add(Box.createRigidArea(new Dimension(5, 1)));
        radioButtonBox.add(ean);

        topBox1 = new Box(BoxLayout.Y_AXIS);
        topBox1.add(inputPanel);
        topBox1.add(Box.createRigidArea(new Dimension(1, 20)));
        topBox1.add(radioButtonBox);


        slider = new JSlider(JSlider.VERTICAL, 1, 100, 50);
        slider.addChangeListener(this);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);

        sliderBox = new Box(BoxLayout.Y_AXIS);
        sliderBox.add(slider);
        sliderBox.add(Box.createRigidArea(new Dimension(1, 5)));
        sliderBox.add(new JLabel("multiply by"));

        topBoxfull = new Box(BoxLayout.X_AXIS);
        topBoxfull.add(topBox1);
        topBoxfull.add(Box.createRigidArea(new Dimension(1,1)));
        topBoxfull.add(sliderBox);


        doit = new JButton("do it");
        doit.addActionListener(this);
        doit.setActionCommand("doit");

        output = new JTextField(15);
        outputPanel = new JPanel();
        outputPanel.add(new JLabel("result"));
        outputPanel.add(output);

        botbox = new Box(BoxLayout.Y_AXIS);
        botbox.add(doit);
        botbox.add(Box.createRigidArea(new Dimension(1, 5)));
        botbox.add(outputPanel);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(topBoxfull);
        add(botbox);
    }

    
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if(!source.getValueIsAdjusting()){
            multiplyer = source.getValue();
        }
        repaint();        
    }

    public void actionPerformed(ActionEvent e) {
        
        int result = 0;
        char in = (input.getText()).charAt(0);
        
        if(e.getActionCommand().equals("ascii")){
            plusoperation = 0;
        }
        if(e.getActionCommand().equals("ean")){
            plusoperation = 16;
        }

        if(e.getActionCommand().equals("doit"))
            result = in *= multiplyer + plusoperation;

        output.setText(result + "");
        repaint();
    }


    public static void main(String[] args){
        Klausurübung_4 app = new Klausurübung_4();
        app.setVisible(true);
        app.setSize(700,500);
    }





}
