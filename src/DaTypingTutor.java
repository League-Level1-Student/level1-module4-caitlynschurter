import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DaTypingTutor implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	char currentLetter = generateRandomLetter();
	
	
	public static void main(String[] args) {
		new DaTypingTutor().makeFrame();
	}
	
	void makeFrame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		
		label = new JLabel();
		label.setVisible(true);
		label.setText("W");  //Make the frame big enough
		label.setFont(label.getFont().deriveFont(301.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		
		frame.addKeyListener(this);
		frame.pack();
		label.setText(Character.toString(currentLetter));
	}
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char typedChar = e.getKeyChar();
		System.out.println("Letter Typed: " + typedChar);
		
		if(currentLetter == typedChar) {
			System.out.println("Correct!");
			panel.setBackground(Color.GREEN);
		}
		
		else {
			System.out.println("Incorrect!");
			panel.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
