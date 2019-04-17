import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SlotMachine implements MouseListener, Runnable {
	JFrame frame;
	JPanel message;
	JPanel spin;
	JPanel slots;
	JLabel topLabel;
	JButton spinButton;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SlotMachine());
	}

	private void spinReels() {
		//clear panel
		slots.removeAll();	
		//call spinReel method
		spinReel();	
		//check for win
		//revalidate the reels panel
		
	}
	
	private int spinReel() {
		//get random value from 0-2
		//load image label based on random #
		//add label to slots panel
		//return random #
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		message = new JPanel();
		message.setVisible(true);
		
		spin = new JPanel();
		spin.setVisible(true);
		
		slots = new JPanel();
		slots.setVisible(true);
		
		frame.add(message, BorderLayout.NORTH);
		frame.add(spin, BorderLayout.SOUTH);
		frame.add(slots, BorderLayout.CENTER);
		
		topLabel = new JLabel();
		topLabel.setText("Press spin to play!");
		
		spinButton = new JButton();
		spinButton.setText("SPIN!");
		spinButton.addMouseListener(this);
		
		message.add(topLabel);
		spin.add(spinButton);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(spinButton)) {
			System.out.println("You hear a clicking sound in the distance");
		}
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
