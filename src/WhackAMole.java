import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	JFrame frame;
	JPanel panel;
	Random molePosition = null;
	JButton button;
	int score = 0;
	Date startTime;

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.setup();
	}

	void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Click to whack a mole!");

		panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		molePosition = new Random();
		int rand = molePosition.nextInt(24);

		drawButtons(rand);

		startTime = new Date();
	}

	void drawButtons(int moleIndex) {
		panel.removeAll();
		for (int i = 0; i < 3 * 8; i++) {
			button = new JButton();
			button.setPreferredSize(new Dimension(90, 30));
			button.addMouseListener(this);
			if (moleIndex == i) {
				button.setText("mole!");
			}
			panel.add(button);
			panel.revalidate();
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) arg0.getSource();
		if (clicked.getText().equals("mole!")) {
			score++;
			System.out.println(score);
		}
		
		int rand = molePosition.nextInt(25);
		drawButtons(rand);

		if (score == 10) {
			endGame(startTime, score);
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
