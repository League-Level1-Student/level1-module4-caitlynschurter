import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SlotMachine implements MouseListener, Runnable {
	JFrame frame;
	JPanel message;
	JPanel spin;
	JPanel slots;
	JLabel topLabel;
	JButton spinButton;

	String Cherry = "SlotMachineCherry.png";
	String Orange = "SlotMachineOrange.png";
	String Raspberry = "SlotMachineRaspberry.png";

	int reel1;
	int reel2;
	int reel3;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SlotMachine());
	}

	private void spinReels() {
		// clear panel
		slots.removeAll();
		// call spinReel method
		reel1 = spinReel();
		reel2 = spinReel();
		reel3 = spinReel();

		// check for win
		slots.revalidate();
		if (reel1 == reel2 && reel2 == reel3) {
			JOptionPane.showMessageDialog(null, "Good job. You won! \n :3");
		}
		// revalidate the reels panel
		
	}

	private int spinReel() {
		JLabel imageLabel = new JLabel();
		// get random value from 0-2
		Random ran = new Random();
		int r = ran.nextInt(3);
		// load image label based on random #
		if (r == 0) {
			try {
				imageLabel = createLabelImage(Cherry);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (r == 1) {
			try {
				imageLabel = createLabelImage(Orange);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else {
			try {
				imageLabel = createLabelImage(Raspberry);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// add label to slots panel
		slots.add(imageLabel);
		// return random #
		return r;
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
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
		if (e.getSource().equals(spinButton)) {
			System.out.println("You hear a faint clicking sound in the distance");
			spinReels();
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
