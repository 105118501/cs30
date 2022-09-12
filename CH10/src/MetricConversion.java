import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel XtoX = new JLabel(" ");
		XtoX.setBounds(64, 95, 46, 14);
		frame.getContentPane().add(XtoX);
		
		JLabel SACT = new JLabel("Select A Conversion Type:");
		SACT.setBounds(10, 11, 232, 37);
		frame.getContentPane().add(SACT);
		
		JComboBox WtoW = new JComboBox();
		WtoW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String wtow = (String)WtoW.getSelectedItem();
				
				if(wtow =="inch to centimeters") 
				{
				XtoX.setText("1 inch = 2.54 centimeters");	
				}
				else if (wtow =="foot to meters") 
				{
					XtoX.setText("1 inch = 2.54 centimeters");		
				}
				else if (wtow =="gallon to liters") 
				{
					XtoX.setText("1 inch = 2.54 centimeters");		
				}
				else if (wtow =="pound to kilograms") 
				{
					XtoX.setText("1 inch = 2.54 centimeters");		
				}		
				
			}
		});
		WtoW.setModel(new DefaultComboBoxModel(new String[] {"inch to centimeters", "foot to meters", "gallon to liters", "pound to kilograms"}));
		WtoW.setBounds(20, 44, 383, 37);
		frame.getContentPane().add(WtoW);
	}

}
