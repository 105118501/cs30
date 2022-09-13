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
import javax.swing.JTextField;
import javax.swing.JButton;

public class MetricConversion {

	private JFrame frame;
	private JTextField UN;
	
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
		frame.setBounds(100, 100, 546, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel XtoX = new JLabel(" ");
		XtoX.setHorizontalAlignment(SwingConstants.CENTER);
		XtoX.setFont(new Font("Elephant", Font.PLAIN, 14));
		XtoX.setForeground(new Color(128, 0, 0));
		XtoX.setBounds(78, 95, 373, 37);
		frame.getContentPane().add(XtoX);
		
		JLabel SACT = new JLabel("Select A Conversion Type:");
		SACT.setHorizontalAlignment(SwingConstants.CENTER);
		SACT.setFont(new Font("Elephant", Font.PLAIN, 14));
		SACT.setForeground(new Color(128, 0, 0));
		SACT.setBounds(149, 11, 232, 37);
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
		WtoW.setBounds(73, 44, 383, 37);
		frame.getContentPane().add(WtoW);
		
		UN = new JTextField();
		UN.setForeground(new Color(128, 0, 0));
		UN.setBackground(new Color(255, 99, 71));
		UN.setBounds(222, 174, 86, 20);
		frame.getContentPane().add(UN);
		UN.setColumns(10);
		
		JLabel EAN = new JLabel("Enter A Number");
		EAN.setHorizontalAlignment(SwingConstants.CENTER);
		EAN.setForeground(new Color(128, 0, 0));
		EAN.setFont(new Font("Elephant", Font.PLAIN, 14));
		EAN.setBounds(78, 126, 373, 37);
		frame.getContentPane().add(EAN);
		
		JLabel UNtoOUT = new JLabel(" ");
		UNtoOUT.setHorizontalAlignment(SwingConstants.CENTER);
		UNtoOUT.setForeground(new Color(128, 0, 0));
		UNtoOUT.setFont(new Font("Elephant", Font.PLAIN, 14));
		UNtoOUT.setBounds(78, 250, 373, 37);
		frame.getContentPane().add(UNtoOUT);
		
		JButton E = new JButton("Enter");
		E.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		E.setBackground(new Color(255, 99, 71));
		E.setForeground(new Color(128, 0, 0));
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String wtow = (String)WtoW.getSelectedItem();
				int un = Integer.parseInt(UN.getText());
				double out;
				
				
				if (wtow =="inch to centimeters") 
				{
					out=un*2.54;
					
					
					UNtoOUT.setText(String. valueOf(out+" centimeters"));		
				}
				else if (wtow ==" ") 
				{
					UNtoOUT.setText(" ");		
				}
				else if (wtow =="foot to meters") 
				{	
					out=un*0.3048;
					
					
					UNtoOUT.setText(String. valueOf(out+" meters"));		
				}
				else if (wtow =="gallon to liters") 
				{
					out=un*4.5461;
					
					
					UNtoOUT.setText(String. valueOf(out+" liters"));	
					
				}
				else if (wtow =="pound to kilograms") 
				{
					out=un*0.4536;
					
					
					UNtoOUT.setText(String. valueOf(out+" kilograms"));
				}	
				
				
				
			}
		});
		E.setBounds(220, 216, 89, 23);
		frame.getContentPane().add(E);
	}
}
