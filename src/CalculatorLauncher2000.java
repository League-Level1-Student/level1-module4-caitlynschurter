import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CalculatorLauncher2000  implements MouseListener{
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JLabel label;

	public static void main(String[] args){
		Calculator calc = new Calculator();
		CalculatorLauncher2000 cal = new CalculatorLauncher2000();
		cal.setup();
	}

	void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,  500);
		
		panel = new JPanel();
		panel.setVisible(true);
		panel.setSize(500,500);
		frame.add(panel); 
		
		add = new JButton();
		add.addMouseListener(this);
		add.setSize(100,50);
		panel.add(add);
		
		subtract = new JButton();
		subtract.addMouseListener(this);
		subtract.setSize(100,50);
		panel.add(subtract);
		
		multiply = new JButton();
		multiply.addMouseListener(this);
		multiply.setSize(100,50);
		panel.add(multiply);
		
		divide = new JButton();
		divide.addMouseListener(this);
		divide.setSize(100,50);
		panel.add(divide);
		
		//frame.pack();
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
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
