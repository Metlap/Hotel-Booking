
import java.util.regex.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class BookingPage {
	Connection conndatabase=null;
	 JFrame frame;
	private JTextField Booking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingPage window = new BookingPage();
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
	public BookingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		conndatabase=sqliteConnection.dbdatabaseConnector();
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 438, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPhotoId = new JLabel("Photo ID");
		lblPhotoId.setForeground(new Color(153, 204, 255));
		lblPhotoId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhotoId.setBounds(43, 79, 91, 29);
		frame.getContentPane().add(lblPhotoId);
		
		JLabel lblaadharpanCard = new JLabel("(Aadhar/PAN card)");
		lblaadharpanCard.setForeground(new Color(255, 255, 255));
		lblaadharpanCard.setBounds(15, 108, 150, 14);
		frame.getContentPane().add(lblaadharpanCard);
		
		Booking = new JTextField();
		Booking.setBounds(166, 93, 211, 29);
		frame.getContentPane().add(Booking);
		Booking.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm Booking");
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String s=Booking.getText();
					int a=0;
					if((!(Pattern.matches("^[1-9]{1}[0-9]{11}",Booking.getText()))) && (!(Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$",Booking.getText()))))
					{
			            JOptionPane.showMessageDialog(null, "Please enter a valid Aadhar or PAN Card Number");
			            } 
						
					
					else {
						if(Hotel.location.equals("Chennai")&&AvailableOptions.btn.equals("b1")) {
							String query="insert into C_Clairton (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
						
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from C_Clairton where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
							
						}
						else if(Hotel.location.equals("Delhi")&&AvailableOptions.btn.equals("b1")) {
							String query="insert into D_Bloomrooms (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from D_Bloomrooms where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Hyderabad")&&AvailableOptions.btn.equals("b1")) {
							String query="insert into H_ITCkohinoor(User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from H_ITCkohinoor where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Mumbai")&&AvailableOptions.btn.equals("b1")) {
							String query="insert into M_Avion (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from M_Avion where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Chennai")&&AvailableOptions.btn.equals("b2")) {
							String query="insert into C_Greengate (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from C_Greengate where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Delhi")&&AvailableOptions.btn.equals("b2")) {
							String query="insert into D_Caspia (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from D_Caspia where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Hyderabad")&&AvailableOptions.btn.equals("b2")) {
							String query="insert into H_Novotel (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from H_Novotel where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Mumbai")&&AvailableOptions.btn.equals("b2")) {
							String query="insert into M_Maharajan(User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from M_Maharajan where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Chennai")&&AvailableOptions.btn.equals("b3")) {
							String query="insert into C_Tajcoromandel (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from C_Tajcoromandel where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Delhi")&&AvailableOptions.btn.equals("b3")) {
							String query="insert into D_Lasuite (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from C_ClD_Lasuiteairton where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Hyderabad")&&AvailableOptions.btn.equals("b3")) {
							String query="insert into H_Raintree (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username);
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from H_Raintree where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Mumbai")&&AvailableOptions.btn.equals("b3")) {
							String query="insert into M_Mirage (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from M_Mirage where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Chennai")&&AvailableOptions.btn.equals("b4")) {
							String query="insert into C_Treeboavenue (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from C_Treeboavenue where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Delhi")&&AvailableOptions.btn.equals("b4")) {
							String query="insert into D_Orana (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from D_Orana where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Hyderabad")&&AvailableOptions.btn.equals("b4")) {
							String query="insert into H_Sheraton (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from H_Sheraton where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else if(Hotel.location.equals("Mumbai")&&AvailableOptions.btn.equals("b4")) {
							String query="insert into M_Saharastar (User,Checkin,Checkout,Rreq,PhotoId) values (?,?,?,?,?)";
							PreparedStatement pst=conndatabase.prepareStatement(query);
							pst.setString(1,UserDemo.username );
							pst.setString(2,Hotel.Ind );
							pst.setString(3,Hotel.Outd);
							pst.setInt(4,Hotel.qrooms);
							pst.setString(5,s);
							pst.execute();
							pst.close();
							
							PreparedStatement ps=conndatabase.prepareStatement("select BookingId from M_Saharastar where User=? and Checkin=? and Checkout=? and Rreq=? and PhotoId=? ");
							ps.setString(1,UserDemo.username );
							ps.setString(2,Hotel.Ind );
							ps.setString(3,Hotel.Outd);
							ps.setInt(4,Hotel.qrooms);
							ps.setString(5,s);
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								a=rs.getInt("BookingId");
							}
							ps.close();
						}
						else JOptionPane.showMessageDialog(null,"No Such Location");
						
						JOptionPane.showMessageDialog(null,"Booking Successful\nYour BookingID is  "+a);
						frame.dispose();
						Entry1 en=new Entry1();
						en.frame.setVisible(true);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(46, 144, 201, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					AvailableOptions op=new AvailableOptions();
					op.frame.setVisible(true);
					
				}catch(Exception e) {
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(56, 210, 109, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					WELCOME register= new WELCOME();
					register.frame.setVisible(true);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnLogout.setBounds(323, 11, 89, 23);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/rsz_aadhar.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(0, 0, 416, 279);
		frame.getContentPane().add(lblNewLabel);
	}
}
