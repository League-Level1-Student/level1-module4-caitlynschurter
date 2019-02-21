import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener {
	JButton joke;
	JButton punchline;

	public static void main(String[] args) {

		new ChuckleClicker().makeButtons();
	}

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.add(panel);

		joke = new JButton();
		joke.setText("Joke");
		joke.addMouseListener(this);
		panel.add(joke);

		punchline = new JButton();
		punchline.setText("Punchline");
		punchline.addMouseListener(this);
		panel.add(punchline);

		frame.pack();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
		if (e.getSource() == joke) {
			// System.out.println("joke");
			JOptionPane.showMessageDialog(null, "What's green and has wheels?");
		}

		else if (e.getSource() == punchline) {
			// System.out.println("punchline");
			JOptionPane.showMessageDialog(null, "Grass! I lied about the wheels.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
