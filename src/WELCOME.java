import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class WELCOME {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOME window = new WELCOME();
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
	public WELCOME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 889, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setFont(new Font("Papyrus", Font.BOLD, 18));
		txtrWelcome.setText("Welcome !!\r\nThis is an applet that lets you book a hotel room in 4 major cities of India\r\nFor each location you will be shown the top four hotels\r\nbased on the preferences that are provided\r\nThe maximum room capacity in each hotel is 2\r\nSo make sure you choose just the right number of rooms as per you convinience\r\n");
		txtrWelcome.setBounds(27, 36, 836, 190);
		frame.getContentPane().add(txtrWelcome);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					UserDemo use=new UserDemo();
					use.frame.setVisible(true);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(579, 267, 128, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAlreadyAUser = new JLabel("Already a user ?");
		lblAlreadyAUser.setForeground(Color.BLUE);
		lblAlreadyAUser.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAlreadyAUser.setBounds(422, 267, 172, 23);
		frame.getContentPane().add(lblAlreadyAUser);
		
		JLabel lblNewUser = new JLabel("Yet to Register?");
		lblNewUser.setForeground(Color.ORANGE);
		lblNewUser.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewUser.setBounds(422, 329, 156, 22);
		frame.getContentPane().add(lblNewUser);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					Registerpage reg=new Registerpage();
					reg.setVisible(true);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		btnNewButton_1.setBounds(588, 328, 106, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
