import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField Number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel EAI = new JLabel("Enter An Integer");
		EAI.setForeground(new Color(0, 0, 139));
		EAI.setHorizontalAlignment(SwingConstants.CENTER);
		EAI.setFont(new Font("Gadugi", Font.BOLD, 14));
		EAI.setBounds(25, 14, 208, 61);
		frame.getContentPane().add(EAI);
		
		JLabel YN = new JLabel("");
		YN.setForeground(new Color(25, 25, 112));
		YN.setHorizontalAlignment(SwingConstants.CENTER);
		YN.setFont(new Font("Georgia", Font.BOLD, 14));
		YN.setBounds(228, 86, 171, 97);
		frame.getContentPane().add(YN);
		
		Number = new JTextField();
		Number.setForeground(new Color(0, 0, 139));
		Number.setBackground(new Color(0, 206, 209));
		Number.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		Number.setHorizontalAlignment(SwingConstants.CENTER);
		Number.setBounds(228, 11, 171, 64);
		frame.getContentPane().add(Number);
		Number.setColumns(10);
		
		JButton C = new JButton("Check");
		C.setBackground(new Color(0, 206, 209));
		C.setForeground(new Color(25, 25, 112));
		C.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double n;String N;
			
				N=Number.getText();
				n = Double.parseDouble(N);
				
				n=(n/3);
				
				if ((n % 1) == 0) 
				{
					YN.setText("divisible by 3");   
				} 
				
				else 
				{
					YN.setText("not divisible by 3");	
				}
				
				
				
				
			}
		});
		C.setBounds(47, 86, 171, 97);
		frame.getContentPane().add(C);
	}
}
