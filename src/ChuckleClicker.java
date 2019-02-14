import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {

		makeButtons();
	}

	static void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton joke = new JButton();
		joke.setText("Joke");
		panel.add(joke);
		
		JButton punchline = new JButton();
		punchline.setText("Punchline");
		panel.add(punchline);
		
		frame.pack();
	}
}
