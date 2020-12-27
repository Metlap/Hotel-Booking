import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.Date;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class CurrentBookings {
	Connection conndatabase=null;
	JFrame frame;
	private JTextField bookingId;
	private JLabel h1;
	private JLabel h2;
	private JLabel h3;
	private JLabel d1;
	private JLabel d2;
	private JLabel d3;
	private JLabel h4;
	private JLabel d4;
	private JButton btncancel;
	String cin=new String();
	String cout=new String();
	int code=0;
	int id=0;
	String str=new String();
	private JButton btnmodify;
	private JLabel notice;
	private JButton here;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrentBookings window = new CurrentBookings();
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
	public CurrentBookings() {
		initialize();
		
	}
	void cancelBooking(int codex,int id) {
		try {
			switch(codex) {
			case 100:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 101:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 102:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 103:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 200:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 201:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 202:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 203:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 300:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 301:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 302:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 303:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 400:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
				
			}
			case 401:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 402:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			case 403:{
				PreparedStatement ps=conndatabase.prepareStatement("delete from C_Clairton where BookingId=? ");
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				break;
			}
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conndatabase=sqliteConnection.dbdatabaseConnector();
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		bookingId = new JTextField();
		bookingId.setBounds(203, 22, 201, 20);
		frame.getContentPane().add(bookingId);
		bookingId.setColumns(10);
		
		JLabel lblBookingid = new JLabel("BookingID");
		lblBookingid.setBounds(28, 25, 113, 14);
		frame.getContentPane().add(lblBookingid);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					str=bookingId.getText();
					id=Integer.parseInt(str);
					code=id/10000;
					switch(code) {
					case 100:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from C_Clairton where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Clairton");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 101:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from C_Greentgate where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Greentgate");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 102:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from C_Tajcoromandel where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Tajcoromandel");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 103:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from C_Treeboavenue where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("TreeboAvenue");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 200:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from D_Bloomrooms where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Bloomrooms");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 201:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from D_Caspia where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Caspia");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 202:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from D_Lasuite where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("LaSuite");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;					}
					case 203:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from D_Orana where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Orana");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 300:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from H_ITCkohinoor where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("ITCkohinoor");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 301:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from H_Novotel where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Novotel");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 302:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from H_Raintree where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (!UserDemo.username.equals(user)) {
							JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						}
						else {
							d1.setText(user);
							d2.setText("Raintree");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 303:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from H_Sheraton where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						System.out.println(UserDemo.username.equals(user));
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Sheraton");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 400:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from M_Avion where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Avion");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 401:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from M_Maharajan where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Maharajan");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 402:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from M_Mirage where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Mirage");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					case 403:{
						PreparedStatement ps=conndatabase.prepareStatement("select User,Checkin,Checkout from M_Saharastar where BookingId=?");
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						String user=new String();String cin=new String();String cout=new String();
						while(rs.next()) {
							user=rs.getString("User");
							cin=rs.getString("Checkin");
							cout=rs.getString("Checkout");
						}
						if (UserDemo.username.equals(user)) {
							d1.setText(user);
							d2.setText("Saharastar");
							d3.setText(cin);
							d4.setText(cout);	h1.setText("Username");
							h2.setText("HotelName");
							h3.setText("Checkin Date");
							h4.setText("Checkout Date");
						}
						else JOptionPane.showMessageDialog(null,"Invalid Booking Id");
						btncancel.setText("Cancel Booking");
						btnmodify.setText("Modify Booking");break;
					}
					default:JOptionPane.showMessageDialog(null, "no such booking id");
					}
				
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnEnter.setBounds(143, 53, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		h1 = new JLabel("");
		h1.setBounds(52, 113, 113, 14);
		frame.getContentPane().add(h1);
		
		h2 = new JLabel("");
		h2.setBounds(52, 152, 113, 14);
		frame.getContentPane().add(h2);
		
		h3 = new JLabel("");
		h3.setBounds(52, 188, 113, 14);
		frame.getContentPane().add(h3);
		
		d1 = new JLabel("");
		d1.setBounds(203, 113, 103, 14);
		frame.getContentPane().add(d1);
		
		d2 = new JLabel("");
		d2.setBounds(203, 152, 103, 14);
		frame.getContentPane().add(d2);
		
		d3 = new JLabel("");
		d3.setBounds(203, 188, 103, 14);
		frame.getContentPane().add(d3);
		
		h4 = new JLabel("");
		h4.setBounds(52, 219, 113, 14);
		frame.getContentPane().add(h4);
		
		d4 = new JLabel("");
		d4.setBounds(203, 219, 103, 14);
		frame.getContentPane().add(d4);
		
		btncancel = new JButton("");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					cin=d3.getText();
					Date d=new Date();
					Date a=new SimpleDateFormat("dd/MM/yyyy").parse(cin);
					
					long diff = a.getTime() - d.getTime();
					diff= diff/(1000*3600*24);	
					if(diff>=3) {
						cancelBooking(code,id);
						JOptionPane.showMessageDialog(null,"Cancellation Successful");
						frame.dispose();
						Entry1 e=new Entry1();
						e.frame.setVisible(true);
					}
					else if(diff>0&&diff<3) {
						notice.setText("Only 50% of the amount will be refunded press here to continue");
						here.setText("Continue");
					}
					else {
						JOptionPane.showMessageDialog(null,"Cancellation Unavailable");
						frame.dispose();
						Entry1 entry=new Entry1();
						entry.frame.setVisible(true);
					}
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btncancel.setBounds(337, 126, 121, 45);
		frame.getContentPane().add(btncancel);
		
		btnmodify = new JButton("");
		btnmodify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					cin=d3.getText();
					Date d=new Date();
					Date a=new SimpleDateFormat("dd/MM/yyyy").parse(cin);
					long diff = a.getTime() - d.getTime();
					diff= diff/(1000*3600*24);
					if(diff>=3) {
						cancelBooking(code,id);
						JOptionPane.showMessageDialog(null,"Enter the new Details");
						frame.dispose();
						Hotel h=new Hotel();
						h.frame.setVisible(true);
					}
					else if(diff<3&&diff>0) {
						notice.setText("Only 50% of the amount will be refunded press here to continue");
						here.setText("Continue");
					}
					else {
						JOptionPane.showMessageDialog(null,"Modification Unavailable");
						frame.dispose();
						Entry1 entry=new Entry1();
						entry.frame.setVisible(true);
					}
					
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnmodify.setBounds(337, 188, 121, 45);
		frame.getContentPane().add(btnmodify);
		
		notice = new JLabel("");
		notice.setBounds(82, 298, 259, 45);
		frame.getContentPane().add(notice);
		
		here = new JButton("");
		here.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelBooking(code,id);
			}
		});
		here.setBounds(337, 298, 121, 45);
		frame.getContentPane().add(here);
		
		btnNewButton = new JButton("<Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Entry1 entry=new Entry1();
				entry.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(26, 376, 89, 39);
		frame.getContentPane().add(btnNewButton);
	}

}
