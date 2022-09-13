import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton PA = new JButton("Play Again");
		PA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PA.setBounds(172, 142, 89, 23);
		frame.getContentPane().add(PA);
		
		JPanel plate = new JPanel();
		plate.setBounds(10, 11, 414, 120);
		frame.getContentPane().add(plate);
		
		JPanel prize = new JPanel();
		prize.setBounds(108, 169, 218, 112);
		frame.getContentPane().add(prize);
	}
}
