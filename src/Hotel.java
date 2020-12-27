import java.awt.EventQueue;
import java.util.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.text.*;

import java.awt.Font;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import java.awt.Color;

public class Hotel {
	
	Connection connecloc=null;
	Connection conndatabase=null;
	JFrame frame;
	private JTextField Rooms;
	JComboBox combolocation;
	JCalendar calin;
	JCalendar calout;
	static String location=new String(); 
	static String Ind =new String();
	static String Outd = new String();
	static Integer qrooms ;
	private JTextField People;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
		
	}
	public void fillLocation() {
		try {
			String query="select * from Locations ";
			PreparedStatement pst=connecloc.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				combolocation.addItem(rs.getString("LocationName"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		connecloc=sqliteConnection.db2Connector();
		conndatabase=sqliteConnection.dbdatabaseConnector();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 689, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Location");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 39, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pick a Check-in date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(41, 79, 148, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pick a Check-out date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(381, 83, 167, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No.of Rooms");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(29, 303, 90, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		combolocation = new JComboBox();
		combolocation.setBackground(new Color(220, 220, 220));
		combolocation.setBounds(132, 36, 90, 20);
		frame.getContentPane().add(combolocation);
		
		Rooms = new JTextField();
		Rooms.setBounds(167, 302, 86, 20);
		frame.getContentPane().add(Rooms);
		Rooms.setColumns(10);
		
		calin = new JCalendar();
		calin.setBounds(41, 123, 205, 133);
		frame.getContentPane().add(calin);
		
		calout = new JCalendar();
		calout.setBounds(381, 123, 205, 133);
		frame.getContentPane().add(calout);
		
		JButton btncont = new JButton("Continue");
		btncont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					location =combolocation.getSelectedItem().toString();
					String ss=Rooms.getText();
					qrooms=Integer.parseInt(ss);
					String ss1=People.getText();
					int qpeople=Integer.parseInt(ss1);
					Integer Din=calin.getCalendar().get(Calendar.DAY_OF_MONTH);
					Integer Min=calin.getCalendar().get(Calendar.MONTH);Min++;
					Integer Yin=calin.getCalendar().get(Calendar.YEAR);
					Date cur=new Date();
					Integer Dout=calout.getCalendar().get(Calendar.DAY_OF_MONTH);
					Integer Mout=calout.getCalendar().get(Calendar.MONTH);Mout++;
					Integer Yout=calout.getCalendar().get(Calendar.YEAR);
					
					Ind = Din.toString() +"/" + Min.toString()+ "/" + Yin.toString();
					Outd = Dout.toString() +"/" + Mout.toString()+ "/" + Yout.toString();
					Date a=new SimpleDateFormat("dd/MM/yyyy").parse(Ind);  
					Date b=new SimpleDateFormat("dd/MM/yyyy").parse(Outd);  
					
					if (((qpeople/2)>qrooms)||(b.compareTo(a))<=0|| cur.compareTo(a)>=0) {
						if(((qpeople/2)>qrooms))JOptionPane.showMessageDialog(null, "Insufficient rooms for the given number of people");
						else if  ((b.compareTo(a))<=0 || cur.compareTo(a)>=0)JOptionPane.showMessageDialog(null, "Improper Checkin and Checkout dates");
						
					}
					else {
						frame.dispose();
						AvailableOptions j=new AvailableOptions();
						j.frame.setVisible(true);
					}
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btncont.setBounds(91, 384, 129, 23);
		frame.getContentPane().add(btncont);
		
		JLabel lblNewLabel_4 = new JLabel("No.of People");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(29, 347, 90, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		People = new JTextField();
		People.setBounds(167, 349, 86, 20);
		frame.getContentPane().add(People);
		People.setColumns(10);
		
		JButton btnNewButton = new JButton("<Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Entry1 en= new Entry1();
					en.frame.setVisible(true);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		btnNewButton.setBounds(256, 404, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					WELCOME register= new WELCOME();
					register.frame.setVisible(true);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
			
		});
		btnLogout.setBounds(537, 16, 115, 29);
		frame.getContentPane().add(btnLogout);
		fillLocation();
	}
}
