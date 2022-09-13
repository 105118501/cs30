import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 128, 128));
		frame.setBounds(100, 100, 450, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel XtoX = new JLabel(" ");
		XtoX.setHorizontalAlignment(SwingConstants.CENTER);
		XtoX.setFont(new Font("Elephant", Font.PLAIN, 14));
		XtoX.setForeground(new Color(128, 0, 0));
		XtoX.setBounds(30, 95, 373, 37);
		frame.getContentPane().add(XtoX);
		
		JLabel SACT = new JLabel("Select A Conversion Type:");
		SACT.setFont(new Font("Elephant", Font.PLAIN, 14));
		SACT.setForeground(new Color(128, 0, 0));
		SACT.setBounds(10, 11, 232, 37);
		frame.getContentPane().add(SACT);
		
		JComboBox WtoW = new JComboBox();
		WtoW.setFont(new Font("Footlight MT Light", Font.PLAIN, 18));
		WtoW.setBackground(new Color(255, 99, 71));
		WtoW.setForeground(new Color(128, 0, 0));
		WtoW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String wtow = (String)WtoW.getSelectedItem();
				
				if (wtow =="inch to centimeters") 
				{
					XtoX.setText("1 inch = 2.54 centimeters");		
				}
				else if (wtow ==" ") 
				{
					XtoX.setText(" ");		
				}
				else if (wtow =="foot to meters") 
				{
					XtoX.setText("1 foot = 0.3048 meters");		
				}
				else if (wtow =="gallon to liters") 
				{
					XtoX.setText("1 gallon = 4.5461 liters");		
				}
				else if (wtow =="pound to kilograms") 
				{
					XtoX.setText("1 pound = 0.4536 kilograms");		
				}		
				
			}
		});
		WtoW.setModel(new DefaultComboBoxModel(new String[] {" ", "inch to centimeters", "foot to meters", "gallon to liters", "pound to kilograms"}));
		WtoW.setBounds(20, 44, 383, 37);
		frame.getContentPane().add(WtoW);
	}

}
