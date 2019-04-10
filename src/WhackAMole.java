import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	JFrame frame;
	JPanel panel;
	Random molePosition = null;
	JButton button;
	int score = 0;

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
		int rand = molePosition.nextInt(25);

		drawButtons(rand);
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

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (button.getText().equals("mole!")) {
			score++;
			System.out.println(score);
		}
		int rand = molePosition.nextInt(25);
		drawButtons(rand);
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
