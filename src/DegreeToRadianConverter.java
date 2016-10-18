import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DegreeToRadianConverter {

	private JFrame frame;
	private JTextField txtEnterDegrees;
	private JTextField txtEnterDegrees_1;
	private JLabel lblResult;
	private JTextField txtEnterDegrees_2;
	private JTextField txtEnterRadians;
	private JLabel lblresult_1;
	Converser con = new Converser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DegreeToRadianConverter window = new DegreeToRadianConverter();
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
	public DegreeToRadianConverter() {
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
		
		txtEnterDegrees = new JTextField();
		txtEnterDegrees.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterDegrees.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnterDegrees.setForeground(Color.BLACK);
		txtEnterDegrees.setBounds(44, 39, 111, 35);
		frame.getContentPane().add(txtEnterDegrees);
		txtEnterDegrees.setColumns(10);
		
		JButton btnNewButton = new JButton("ToDegrees");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = txtEnterDegrees.getText();
				double radian = Double.parseDouble(s) ;
				double rad = con.degree(radian);
				lblResult.setText("result:  "+ rad);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(46, 162, 109, 63);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To Radians");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m = txtEnterDegrees_1.getText();
				double degree = Double.parseDouble(m) ;
				double deg =con.radian(degree);
				lblresult_1.setText("result:  "+ deg);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(268, 162, 109, 63);
		frame.getContentPane().add(btnNewButton_1);
		
		txtEnterDegrees_1 = new JTextField();
		txtEnterDegrees_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterDegrees_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnterDegrees_1.setBounds(268, 40, 109, 35);
		frame.getContentPane().add(txtEnterDegrees_1);
		txtEnterDegrees_1.setColumns(10);
		
		lblResult = new JLabel("result:");
		lblResult.setBackground(Color.LIGHT_GRAY);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblResult.setBounds(44, 103, 111, 35);
		frame.getContentPane().add(lblResult);
		
		txtEnterDegrees_2 = new JTextField();
		txtEnterDegrees_2.setText("Enter radians");
		txtEnterDegrees_2.setBounds(44, 21, 111, 20);
		frame.getContentPane().add(txtEnterDegrees_2);
		txtEnterDegrees_2.setColumns(10);
		
		txtEnterRadians = new JTextField();
		txtEnterRadians.setText("Enter radians");
		txtEnterRadians.setBounds(268, 21, 109, 20);
		frame.getContentPane().add(txtEnterRadians);
		txtEnterRadians.setColumns(10);
		
		lblresult_1 = new JLabel("result:");
		lblresult_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblresult_1.setBounds(268, 100, 109, 38);
		frame.getContentPane().add(lblresult_1);
	}
}
