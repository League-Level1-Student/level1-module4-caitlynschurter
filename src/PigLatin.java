import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements MouseListener{
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField english;
	JTextField pig;
	String text;
	PigLatinTranslator translate = new PigLatinTranslator();
	
	public static void main(String[] args) {
		PigLatin p = new PigLatin();
		p.setup();
	}

	void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 50);
		
		panel = new JPanel();
		panel.setVisible(true);
		panel.setSize(200, 50);
		frame.add(panel);
		
		english = new JTextField("", 40);
		english.setVisible(true);
		panel.add(english, BorderLayout.WEST);
		
		button = new JButton();
		button.setVisible(true);
		button.setText("Translate");
		button.addMouseListener(this);
		panel.add(button, BorderLayout.CENTER);
		
		pig = new JTextField("", 40);
		pig.setVisible(true);
		panel.add(pig, BorderLayout.EAST);
		
		frame.pack();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		text = english.getText();
		pig.setText(translate.translate(text));
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
