import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CalculatorLauncher2000 implements MouseListener {
	JFrame frame;
	JPanel buttonPanel;
	JPanel textPanel;
	JPanel panel;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JLabel label;
	JTextField jtf1;
	JTextField jtf2;
	String t1;
	String t2;
	Calculator calc = new Calculator();

	public static void main(String[] args) {
		CalculatorLauncher2000 cal = new CalculatorLauncher2000();
		cal.setup();
	}

	void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);

		buttonPanel = new JPanel();
		buttonPanel.setVisible(true);
		frame.add(buttonPanel, BorderLayout.CENTER);
		
		textPanel = new JPanel();
		textPanel.setVisible(true);
		frame.add(textPanel, BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel, BorderLayout.SOUTH);
		
		add = new JButton();
		add.addMouseListener(this);
		add.setSize(100, 50);
		add.setText("Add");
		buttonPanel.add(add);

		subtract = new JButton();
		subtract.addMouseListener(this);
		subtract.setSize(100, 50);
		subtract.setText("Subtract");
		buttonPanel.add(subtract);

		multiply = new JButton();
		multiply.addMouseListener(this);
		multiply.setSize(100, 50);
		multiply.setText("Multiply");
		buttonPanel.add(multiply);

		divide = new JButton();
		divide.addMouseListener(this);
		divide.setSize(100, 50);
		divide.setText("Divide");
		buttonPanel.add(divide);
		
		label = new JLabel();
		label.setVisible(true);
		panel.add(label);

		jtf1 = new JTextField("", 10);
		jtf2 = new JTextField("", 10);
		textPanel.add(jtf1);
		textPanel.add(jtf2);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		t1 = jtf1.getText();
		t2 = jtf2.getText();
		int x = Integer.parseInt(t1);
		int y = Integer.parseInt(t2);
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			calc.add(x, y);
			
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
