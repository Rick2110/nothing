package koalinha;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class mesas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mesasScreen(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mesas window = new mesas();
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
	public mesas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 222, 198));
		frame.setBounds(100, 100, 524, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricko\\eclipse-workspace\\Koala\\Design sem nome(1).png"));
		lblNewLabel.setBounds(89, 0, 300, 315);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mesas Disponiveis");
		btnNewButton.setBounds(161, 341, 142, 44);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    }
		});
	}
}
