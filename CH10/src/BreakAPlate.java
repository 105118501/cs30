import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class BreakAPlate {

	
		
	private JFrame frame;

	
	ImageIcon plates = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\plates.gif");
	ImageIcon placeholder = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\placeholder.gif");
	ImageIcon plates_all_broken = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\plates_all_broken.gif");
	ImageIcon tiger_plush = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\tiger_plush.gif");
	ImageIcon plates_two_broken = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\plates_two_broken.gif");
	ImageIcon sticker = new ImageIcon("C:\\Users\\105118501\\git\\cs30\\CH10\\src\\img\\sticker.gif");
	
	
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 598, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel plate = new JLabel(plates);
		plate.setBounds(43, 11, 496, 166);
		frame.getContentPane().add(plate);
		
		JLabel prize = new JLabel(placeholder);
		prize.setBounds(94, 269, 394, 136);
		frame.getContentPane().add(prize);
		
		JButton PA = new JButton("Play");
		PA.setFont(new Font("Bauhaus 93", Font.PLAIN, 24));
		PA.setBackground(Color.LIGHT_GRAY);
		PA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String en = PA.getActionCommand(); 
				boolean win;
				int n;
				if (en == "Play") {
				
				
				
				
				n=1+( int )( Math.random() * 2 );
				
				
				
				
				if (n == 2) 
				{
					plate.setIcon(plates_all_broken);
					prize.setIcon(tiger_plush);
					PA.setText("Play Again");

				}
				else if(n == 1)
				{
					plate.setIcon(plates_two_broken);
					prize.setIcon(sticker);
					PA.setText("Play Again");

				}	
				
				}
				
				
				else if (en == "Play Again") 
				{
					plate.setIcon(plates);
					prize.setIcon(placeholder);
					PA.setText("Play");
					
				}
				
				
				
			}
		});
		PA.setBounds(215, 186, 151, 49);
		frame.getContentPane().add(PA);
	}
}
