package Klausurübung_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rechner_GUI extends JFrame implements ActionListener {
	
	boolean plusoperation = true;
	
	JTextField zahl1Field, zahl2Field, resultField;
	JRadioButton plusButton, minusButton;
	ButtonGroup buttonGroup;
	JButton rechnenButton;
	
	JPanel zahl1Panel, zahl2Panel;
	
	JPanel resultPanel;
	
	Box buttonBox;
	
	public Rechner_GUI() {
		setTitle("Rechner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		zahl1Field = new JTextField(7);
		zahl2Field = new JTextField(7);
		
		zahl1Panel = new JPanel();
		zahl1Panel.add(new JLabel("Zahl 1"));
		zahl1Panel.add(zahl1Field);
		
		zahl2Panel = new JPanel();
		zahl2Panel.add(new JLabel("Zahl 2"));
		zahl2Panel.add(zahl2Field);
		
		
		plusButton = new JRadioButton("+", true);
		plusButton.addActionListener(this);
		plusButton.setActionCommand("+");
		minusButton = new JRadioButton("-", false);
		minusButton.addActionListener(this);
		minusButton.setActionCommand("-");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(plusButton);
		buttonGroup.add(minusButton);
		
		buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(plusButton);
		buttonBox.add(Box.createRigidArea(new Dimension(1, 5)));
		buttonBox.add(minusButton);
		
		
		rechnenButton = new JButton("Rechnen");
		rechnenButton.addActionListener(this);
		rechnenButton.setActionCommand("rechne");
		
		
		resultField = new JTextField(15);
		resultField.setEditable(false);
		
		resultPanel = new JPanel();
		resultPanel.add(new JLabel("Ergebnis "));
		resultPanel.add(resultField);
		
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(zahl1Panel);
		add(zahl2Panel);
		add(buttonBox);
		add(rechnenButton);
		add(resultPanel);
	}
	
	public double rechnungausführen(boolean f) {
		
		double result;
		double x = Double.parseDouble(zahl1Field.getText());
		double y = Double.parseDouble(zahl2Field.getText());

		if(f == true) {
			result = x + y;
		}
		else{
			result = x-y;
		}
		
		return result;
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getActionCommand().equals("+")) {
			plusoperation = true;
		}
		else if(evt.getActionCommand().equals("-")) {
			plusoperation = false;
		}
		
		if(evt.getActionCommand().equals("rechne")) {
			resultField.setText(rechnungausführen(plusoperation) + "");
		}
		
		repaint();
	}
	
	
	public static void main(String[] args) {
		Rechner_GUI Rechner = new Rechner_GUI();
		Rechner.setSize(250, 250);
		Rechner.setVisible(true);
	}
}
