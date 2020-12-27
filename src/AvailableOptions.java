import java.awt.EventQueue;
import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
public class AvailableOptions {

	JFrame frame;
	JLabel l1;JLabel d1;
	JLabel l4;JLabel d2;
	JLabel l2;JLabel d3;
	JLabel l3;JLabel d4;
	
	int rfree;
	
	static String btn=new String();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailableOptions window = new AvailableOptions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conndatabase=null;
	private JLabel c1;
	private JLabel tc1;
	private JLabel c2;
	private JLabel tc2;
	private JLabel c3;
	private JLabel tc3;
	private JLabel c4;
	private JLabel tc4;
	private JLabel img1;
	private JLabel img11;
	private JLabel img3;
	private JLabel img4;
	private JLabel img5;
	private JLabel img6;
	private JLabel img7;
	private JLabel img8;
	private JLabel img9;
	private JLabel img2;
	private JLabel img15;
	private JLabel img16;
	private JLabel img13;
	private JLabel img10;
	private JLabel img14;
	private JLabel img12;

	
	
	/**
	 * Create the application.
	 */
	public AvailableOptions() {
		initialize();
	}
	public void fillLabels() {
		
		if(Hotel.location.equals("Chennai")){
			d1.setText("Clairton");
			Image img_10=new ImageIcon(this.getClass().getResource("/rsz_2clairton.png")).getImage();
			img1.setIcon(new ImageIcon(img_10));
			Image img_11=new ImageIcon(this.getClass().getResource("/rsz_clairt.png")).getImage();
			img2.setIcon(new ImageIcon(img_11));
			Image img_12=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img3.setIcon(new ImageIcon(img_12));
			Image img_13=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();	
			img4.setIcon(new ImageIcon(img_13));
			d2.setText("Greengate");
			Image img_20=new ImageIcon(this.getClass().getResource("/rsz_greens-gate.png")).getImage();
			img5.setIcon(new ImageIcon(img_20));
			Image img_21=new ImageIcon(this.getClass().getResource("/rsz_greengateroom.png")).getImage();
			img6.setIcon(new ImageIcon(img_21));
			Image img_22=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img7.setIcon(new ImageIcon(img_22));
			Image img_23=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();	
			img8.setIcon(new ImageIcon(img_23));
			d3.setText("Tajcoromandel");
			Image img_30=new ImageIcon(this.getClass().getResource("/rsz_taj.png")).getImage();
			img9.setIcon(new ImageIcon(img_30));
			Image img_31=new ImageIcon(this.getClass().getResource("/rsz_tajcororooms.png")).getImage();
			img10.setIcon(new ImageIcon(img_31));
			Image img_32=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img11.setIcon(new ImageIcon(img_32));
			Image img_33=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img12.setIcon(new ImageIcon(img_33));	
			d4.setText("Treeboavenue");
			Image img_40=new ImageIcon(this.getClass().getResource("/rsz_treeboavenue.png")).getImage();
			img13.setIcon(new ImageIcon(img_40));
			Image img_41=new ImageIcon(this.getClass().getResource("/rsz_1treeborooms.png")).getImage();
			img14.setIcon(new ImageIcon(img_41));
		//	Image img_42=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
		//	img15.setIcon(new ImageIcon(img_42));
			Image img_43=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();	
			img16.setIcon(new ImageIcon(img_43));	

			try {
				PreparedStatement pst1=conndatabase.prepareStatement("select cost from HotelSpecs where Location=?");
				pst1.setString(1, "Chennai");
				ResultSet rs1=pst1.executeQuery();
				int arr[]=new int[4];int x=0;
				while(rs1.next()) {
					arr[x++]=rs1.getInt("Cost");
				}
				Date a=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
				Date b=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd);  
				long diff = b.getTime() - a.getTime();
				diff= diff/(1000*3600*24);
				c1.setText("CostperNightperRoom"+arr[0]);tc1.setText("TotalCost"+arr[0]*diff*Hotel.qrooms);
				c2.setText("CostperNightperRoom"+arr[1]);tc2.setText("TotalCost"+arr[1]*diff*Hotel.qrooms);
				c3.setText("CostperNightperRoom"+arr[2]);tc3.setText("TotalCost"+arr[2]*diff*Hotel.qrooms);
				c4.setText("CostperNightperRoom"+arr[3]);tc4.setText("TotalCost"+arr[3]*diff*Hotel.qrooms);
				pst1.close();
				rs1.close();
				
			}catch(Exception e4) {
				JOptionPane.showMessageDialog(null, e4 );
			}
		}
		else if(Hotel.location.equals("Delhi")){
				d1.setText("Bloomrooms");
			Image img_10=new ImageIcon(this.getClass().getResource("/rsz_bloomrooms.png")).getImage();
			img1.setIcon(new ImageIcon(img_10));
			Image img_11=new ImageIcon(this.getClass().getResource("/rsz_1bloomroomsroom.png")).getImage();
			img2.setIcon(new ImageIcon(img_11));
			Image img_12=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img3.setIcon(new ImageIcon(img_12));
			Image img_13=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img4.setIcon(new ImageIcon(img_13));
			d2.setText("Caspia");
			Image img_20=new ImageIcon(this.getClass().getResource("/rsz_caspia.png")).getImage();
			img5.setIcon(new ImageIcon(img_20));
			Image img_21=new ImageIcon(this.getClass().getResource("/rsz_caspiarooms.png")).getImage();
			img6.setIcon(new ImageIcon(img_21));
			Image img_22=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img7.setIcon(new ImageIcon(img_22));
		//	Image img_23=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
		//	img8.setIcon(new ImageIcon(img_23)); 
			d3.setText("Lasuite");
			Image img_30=new ImageIcon(this.getClass().getResource("/rsz_lasuite.png")).getImage();
			img9.setIcon(new ImageIcon(img_30));
			Image img_31=new ImageIcon(this.getClass().getResource("/rsz_tajcororooms.png")).getImage();
			img10.setIcon(new ImageIcon(img_31));
			Image img_32=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img11.setIcon(new ImageIcon(img_32));
			Image img_33=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img12.setIcon(new ImageIcon(img_33));	
			
			d4.setText("Orana");
			Image img_40=new ImageIcon(this.getClass().getResource("/rsz_orana.png")).getImage();
			img13.setIcon(new ImageIcon(img_40));
			Image img_41=new ImageIcon(this.getClass().getResource("/rsz_oranarooms.png")).getImage();
			img14.setIcon(new ImageIcon(img_41));
			Image img_42=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img15.setIcon(new ImageIcon(img_42));
			Image img_43=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img16.setIcon(new ImageIcon(img_43));		

	
			try {
				PreparedStatement pst2=conndatabase.prepareStatement("select cost from HotelSpecs where Location=?");
				pst2.setString(1, "Delhi");
				ResultSet rs2=pst2.executeQuery();
				int arr[]=new int[4];int x=0;
				while(rs2.next()) {
					arr[x++]=rs2.getInt("Cost");
				}
				Date a=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
				Date b=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd);  
				long diff = b.getTime() - a.getTime();
				diff= diff/(1000*3600*24);
				c1.setText("CostperNightperRoom"+arr[0]);tc1.setText("TotalCost"+arr[0]*diff*Hotel.qrooms);
				c2.setText("CostperNightperRoom"+arr[1]);tc2.setText("TotalCost"+arr[1]*diff*Hotel.qrooms);
				c3.setText("CostperNightperRoom"+arr[2]);tc3.setText("TotalCost"+arr[2]*diff*Hotel.qrooms);
				c4.setText("CostperNightperRoom"+arr[3]);tc4.setText("TotalCost"+arr[3]*diff*Hotel.qrooms);
				pst2.close();
				rs2.close();
				
			}catch(Exception e4) {
				JOptionPane.showMessageDialog(null, e4 );
			}
			
		}
		else if(Hotel.location.equals("Hyderabad")){
			d1.setText("ITCkohinoor");
			Image img_10=new ImageIcon(this.getClass().getResource("/rsz_itc.png")).getImage();
			img1.setIcon(new ImageIcon(img_10));
			Image img_11=new ImageIcon(this.getClass().getResource("/rsz_itcrooms.png")).getImage();
			img2.setIcon(new ImageIcon(img_11));
			Image img_12=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img3.setIcon(new ImageIcon(img_12));
			Image img_13=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img4.setIcon(new ImageIcon(img_13));
		
			d2.setText("Novotel");
			Image img_20=new ImageIcon(this.getClass().getResource("/rsz_novotel.png")).getImage();
			img5.setIcon(new ImageIcon(img_20));
			Image img_21=new ImageIcon(this.getClass().getResource("/rsz_novotelrooms.png")).getImage();
			img6.setIcon(new ImageIcon(img_21));
			Image img_22=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img7.setIcon(new ImageIcon(img_22));
			Image img_23=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img8.setIcon(new ImageIcon(img_23));
			d3.setText("Raintree");
			Image img_30=new ImageIcon(this.getClass().getResource("/rsz_raintree.png")).getImage();
			img9.setIcon(new ImageIcon(img_30));
			Image img_31=new ImageIcon(this.getClass().getResource("/rsz_raintreerooms.png")).getImage();
			img10.setIcon(new ImageIcon(img_31));
			Image img_32=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img11.setIcon(new ImageIcon(img_32));
			Image img_33=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img12.setIcon(new ImageIcon(img_33));
			d4.setText("Sheraton");
			Image img_40=new ImageIcon(this.getClass().getResource("/rsz_sheraton.png")).getImage();
			img13.setIcon(new ImageIcon(img_40));
			Image img_41=new ImageIcon(this.getClass().getResource("/rsz_sheratonrooms.png")).getImage();
			img14.setIcon(new ImageIcon(img_41));
			Image img_42=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img15.setIcon(new ImageIcon(img_42));
			Image img_43=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img16.setIcon(new ImageIcon(img_43));

			
			try {
				PreparedStatement pst2=conndatabase.prepareStatement("select cost from HotelSpecs where Location=?");
				pst2.setString(1, "Hyderabad");
				ResultSet rs2=pst2.executeQuery();
				int arr[]=new int[4];int x=0;
				while(rs2.next()) {
					arr[x++]=rs2.getInt("Cost");
				}
				Date a=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
				Date b=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd);  
				long diff = b.getTime() - a.getTime();
				diff= diff/(1000*3600*24);
				c1.setText("CostperNightperRoom"+arr[0]);tc1.setText("TotalCost"+arr[0]*diff*Hotel.qrooms);
				c2.setText("CostperNightperRoom"+arr[1]);tc2.setText("TotalCost"+arr[1]*diff*Hotel.qrooms);
				c3.setText("CostperNightperRoom"+arr[2]);tc3.setText("TotalCost"+arr[2]*diff*Hotel.qrooms);
				c4.setText("CostperNightperRoom"+arr[3]);tc4.setText("TotalCost"+arr[3]*diff*Hotel.qrooms);
				pst2.close();
				rs2.close();
				
			}catch(Exception e4) {
				JOptionPane.showMessageDialog(null, e4 );
			}
		}
		else if(Hotel.location.equals("Mumbai")){
		d1.setText("Avion");
				Image img_10=new ImageIcon(this.getClass().getResource("/rsz_1avion.png")).getImage();
			img1.setIcon(new ImageIcon(img_10));
			Image img_11=new ImageIcon(this.getClass().getResource("/rsz_avionrooms.png")).getImage();
			img2.setIcon(new ImageIcon(img_11));
			Image img_12=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img3.setIcon(new ImageIcon(img_12));
			Image img_13=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img4.setIcon(new ImageIcon(img_13));
			
			d2.setText("Maharajan");
			
			Image img_20=new ImageIcon(this.getClass().getResource("/rsz_maharajan.png")).getImage();
			img5.setIcon(new ImageIcon(img_20));
			Image img_21=new ImageIcon(this.getClass().getResource("/rsz_raintreerooms.png")).getImage();
			img6.setIcon(new ImageIcon(img_21));
			Image img_22=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img7.setIcon(new ImageIcon(img_22));
			Image img_23=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img8.setIcon(new ImageIcon(img_23));
			
			d3.setText("Mirage");
		
			Image img_30=new ImageIcon(this.getClass().getResource("/rsz_mirage.png")).getImage();
			img9.setIcon(new ImageIcon(img_30));
			Image img_31=new ImageIcon(this.getClass().getResource("/rsz_mirageroom.png")).getImage();
			img10.setIcon(new ImageIcon(img_31));
			Image img_32=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img11.setIcon(new ImageIcon(img_32));
			Image img_33=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img12.setIcon(new ImageIcon(img_33));	
			
			d4.setText("Saharatstar");
			Image img_40=new ImageIcon(this.getClass().getResource("/rsz_sahara.png")).getImage();
			img13.setIcon(new ImageIcon(img_40));
			Image img_41=new ImageIcon(this.getClass().getResource("/rsz_sahararoom.png")).getImage();
			img14.setIcon(new ImageIcon(img_41));
			Image img_42=new ImageIcon(this.getClass().getResource("/wifinew.png")).getImage();
			img15.setIcon(new ImageIcon(img_42));
			Image img_43=new ImageIcon(this.getClass().getResource("/car48.png")).getImage();
			img16.setIcon(new ImageIcon(img_43));

			try {
				PreparedStatement pst2=conndatabase.prepareStatement("select cost from HotelSpecs where Location=?");
				pst2.setString(1, "Mumbai");
				ResultSet rs2=pst2.executeQuery();
				int arr[]=new int[4];int x=0;
				while(rs2.next()) {
					arr[x++]=rs2.getInt("Cost");
				}
				Date a=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
				Date b=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd);  
				long diff = b.getTime() - a.getTime();
				diff= diff/(1000*3600*24);
				c1.setText("CostperNightperRoom"+arr[0]);tc1.setText("TotalCost"+arr[0]*diff*Hotel.qrooms);
				c2.setText("CostperNightperRoom"+arr[1]);tc2.setText("TotalCost"+arr[1]*diff*Hotel.qrooms);
				c3.setText("CostperNightperRoom"+arr[2]);tc3.setText("TotalCost"+arr[2]*diff*Hotel.qrooms);
				c4.setText("CostperNightperRoom"+arr[3]);tc4.setText("TotalCost"+arr[3]*diff*Hotel.qrooms);
				pst2.close();
				rs2.close();
				
			}catch(Exception e4) {
				JOptionPane.showMessageDialog(null, e4 );
			}
	}
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		conndatabase=sqliteConnection.dbdatabaseConnector();
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Sans", frame.getContentPane().getFont().getStyle() | Font.BOLD, frame.getContentPane().getFont().getSize()));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1526,1106);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton b1 = new JButton("CheckAvailability");
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Hotel.location.equals("Chennai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						int flag=0;
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from C_Clairton ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString(2);String d2=rs1.getString(3);
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Clairton");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l1.setText("Available");
						}
						else l1.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Delhi")) {
						
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from D_Bloomrooms ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Bloomrooms");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l1.setText("Available");
						}
						else l1.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Hyderabad")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from H_ITCkohinoor ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"ITCkohinoor");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l1.setText("Available");
						}
						else l1.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Mumbai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from M_Avion ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Avion");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l1.setText("Available");
						}
						else l1.setText("NotAvailable");
					}
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		b1.setBounds(601, 132, 143, 35);
		frame.getContentPane().add(b1);
		
		JButton b6 = new JButton("Book");
		b6.setForeground(new Color(0, 100, 0));
		b6.setFont(new Font("Lucida Sans", b6.getFont().getStyle() | Font.BOLD | Font.ITALIC, b6.getFont().getSize()));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btn="b1";
					frame.dispose();
					BookingPage bp=new BookingPage();
					bp.frame.setVisible(true);
					
				}catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		b6.setBounds(1047, 195, 89, 35);
		frame.getContentPane().add(b6);
		
		JButton b2 = new JButton("CheckAvailability");
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Hotel.location.equals("Chennai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						int flag=0;
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from C_Greengate");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString(2);String d2=rs1.getString(3);
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Greengate");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l2.setText("Available");
						}
						else l2.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Delhi")) {
						
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from D_Caspia ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Caspia");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l2.setText("Available");
						}
						else l2.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Hyderabad")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from H_Novotel ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Novotel");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l2.setText("Available");
						}
						else l2.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Mumbai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from M_Maharajan ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Maharajan");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l2.setText("Available");
						}
						else l2.setText("NotAvailable");
					}
				}catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		b2.setBounds(601, 401, 143, 34);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("CheckAvailability");
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Hotel.location.equals("Chennai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						int flag=0;
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from C_Tajcoromandel");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString(2);String d2=rs1.getString(3);
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Tajcoromandel");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l3.setText("Available");
						}
						else l3.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Delhi")) {
						
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from D_Lasuite ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Lasuite");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l3.setText("Available");
						}
						else l3.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Hyderabad")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from H_Raintree");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Raintree");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l3.setText("Available");
						}
						else l3.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Mumbai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from M_Mirage");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Mirage");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l3.setText("Available");
						}
						else l3.setText("NotAvailable");
					}
				}catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		b3.setBounds(601, 657, 143, 35);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("CheckAvailability");
		b4.setFont(new Font("Tahoma", Font.BOLD, 12));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Hotel.location.equals("Chennai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						int flag=0;
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from C_Treeboavenue ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString(2);String d2=rs1.getString(3);
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Treeboavenue");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l4.setText("Available");
						}
						else l4.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Delhi")) {
						
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from D_Orana ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Orana");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l4.setText("Available");
						}
						else l4.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Hyderabad")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from H_Sheraton");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Sheraton");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l4.setText("Available");
						}
						else l4.setText("NotAvailable");
					}
					else if(Hotel.location.equals("Mumbai")) {
						Date din=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Ind);  
						Date dout=new SimpleDateFormat("dd/MM/yyyy").parse(Hotel.Outd); 
						rfree=0;
						int roc=0;
						
						PreparedStatement pst1=conndatabase.prepareStatement("select Rreq,Checkin,Checkout from M_Saharastar ");
						ResultSet rs1=pst1.executeQuery();
						while(rs1.next()) {
							String d1=rs1.getString("Checkin");
							String d2=rs1.getString("Checkout");
							Date a=new SimpleDateFormat("dd/MM/yyyy").parse(d1);  
							Date b=new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
							if((din.compareTo(b)>0&&dout.compareTo(b)>0)||(din.compareTo(a)>0&&dout.compareTo(a)>0)) continue;
							else {
								roc=roc+rs1.getInt(1);
							}
						}
						rs1.close();
						pst1.close();
						
						PreparedStatement pst2=conndatabase.prepareStatement("select trooms from HOtelSpecs where HotelName=? ");
						pst2.setString(1,"Saharastar");
						ResultSet rs2=pst2.executeQuery();
						while(rs2.next()) {
							rfree=rs2.getInt("trooms");
						}rfree-=roc;
						rs2.close();
						pst2.close();
						
						if(rfree>=Hotel.qrooms) {
							l4.setText("Available");
						}
						else l4.setText("NotAvailable");
					}
					
					
					
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		b4.setBounds(601, 911, 143, 35);
		frame.getContentPane().add(b4);
		
		JButton b7 = new JButton("Book");
		b7.setForeground(new Color(0, 100, 0));
		b7.setFont(new Font("Lucida Sans", b7.getFont().getStyle() | Font.BOLD | Font.ITALIC, b7.getFont().getSize()));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btn="b2";
					frame.dispose();
					BookingPage bp=new BookingPage();
					bp.frame.setVisible(true);
				}catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		b7.setBounds(1047, 440, 89, 35);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("Book");
		b8.setForeground(new Color(0, 100, 0));
		b8.setFont(new Font("Lucida Sans", b8.getFont().getStyle() | Font.BOLD | Font.ITALIC, b8.getFont().getSize()));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btn="b3";
					frame.dispose();
					BookingPage bp=new BookingPage();
					bp.frame.setVisible(true);
				}catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		b8.setBounds(1047, 701, 89, 35);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("Book");
		b9.setForeground(new Color(0, 100, 0));
		b9.setFont(new Font("Lucida Sans", b9.getFont().getStyle() | Font.BOLD | Font.ITALIC, b9.getFont().getSize()));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btn="b4";
					frame.dispose();
					BookingPage bp=new BookingPage();
					bp.frame.setVisible(true);
				}catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		b9.setBounds(1047, 942, 89, 35);
		frame.getContentPane().add(b9);
		
		l1 = new JLabel("Status");
		l1.setForeground(new Color(0, 0, 255));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(778, 141, 106, 14);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Status");
		l2.setForeground(new Color(0, 0, 255));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(778, 410, 106, 14);
		frame.getContentPane().add(l2);
		
		l3 = new JLabel("Status");
		l3.setForeground(new Color(0, 0, 255));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(778, 666, 106, 14);
		frame.getContentPane().add(l3);
		
		l4 = new JLabel("Status");
		l4.setForeground(new Color(0, 0, 255));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(778, 920, 106, 14);
		frame.getContentPane().add(l4);
		
		d1 = new JLabel("D");
		d1.setFont(new Font("Lucida Handwriting", d1.getFont().getStyle() | Font.BOLD, d1.getFont().getSize() + 4));
		d1.setBounds(51, 12, 259, 19);
		frame.getContentPane().add(d1);
		
		d2 = new JLabel("D");
		d2.setFont(new Font("Lucida Handwriting", d2.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, d2.getFont().getSize() + 4));
		d2.setBounds(51, 264, 214, 14);
		frame.getContentPane().add(d2);
		
		d3 = new JLabel("D");
		d3.setFont(new Font("Lucida Handwriting", d3.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, d3.getFont().getSize() + 4));
		d3.setBounds(44, 510, 266, 14);
		frame.getContentPane().add(d3);
		
		d4 = new JLabel("D");
		d4.setFont(new Font("Lucida Handwriting", d4.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, d4.getFont().getSize() + 4));
		d4.setBounds(51, 772, 259, 14);
		frame.getContentPane().add(d4);
		
		c1 = new JLabel("Cost");
		c1.setFont(new Font("Lucida Sans", c1.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, c1.getFont().getSize()));
		c1.setBounds(949, 83, 248, 21);
		frame.getContentPane().add(c1);
		
		tc1 = new JLabel("Totalcost");
		tc1.setForeground(new Color(0, 128, 0));
		tc1.setFont(new Font("Lucida Sans", tc1.getFont().getStyle() | Font.BOLD | Font.ITALIC, tc1.getFont().getSize()));
		tc1.setBounds(949, 137, 248, 23);
		frame.getContentPane().add(tc1);
		
		c2 = new JLabel("Cost");
		c2.setFont(new Font("Lucida Sans", c2.getFont().getStyle() | Font.BOLD, c2.getFont().getSize()));
		c2.setBounds(949, 337, 248, 23);
		frame.getContentPane().add(c2);
		
		tc2 = new JLabel("Totalcost");
		tc2.setForeground(new Color(0, 128, 0));
		tc2.setFont(new Font("Lucida Sans", tc2.getFont().getStyle() | Font.BOLD | Font.ITALIC, tc2.getFont().getSize()));
		tc2.setBounds(949, 401, 248, 23);
		frame.getContentPane().add(tc2);
		
		c3 = new JLabel("Cost");
		c3.setFont(new Font("Lucida Sans", c3.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, c3.getFont().getSize()));
		c3.setBounds(949, 614, 248, 20);
		frame.getContentPane().add(c3);
		
		tc3 = new JLabel("Totalcost");
		tc3.setForeground(new Color(0, 128, 0));
		tc3.setFont(new Font("Lucida Sans", tc3.getFont().getStyle() | Font.BOLD | Font.ITALIC, 16));
		tc3.setBounds(949, 662, 248, 23);
		frame.getContentPane().add(tc3);
		
		c4 = new JLabel("Cost");
		c4.setFont(new Font("Lucida Sans", c4.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, c4.getFont().getSize()));
		c4.setBounds(949, 837, 248, 18);
		frame.getContentPane().add(c4);
		
		tc4 = new JLabel("Totalcost");
		tc4.setForeground(new Color(0, 128, 0));
		tc4.setFont(new Font("Lucida Sans", tc4.getFont().getStyle() | Font.BOLD | Font.ITALIC, 16));
		tc4.setBounds(937, 911, 248, 15);
		frame.getContentPane().add(tc4);
		
		img1 = new JLabel("");
		img1.setBounds(15, 48, 230, 210);
		frame.getContentPane().add(img1);
		
		img5 = new JLabel("");
		img5.setBounds(15, 294, 230, 210);
		frame.getContentPane().add(img5);
	
		img9 = new JLabel("");
		img9.setBounds(15, 540, 230, 210);
		frame.getContentPane().add(img9);
		
		img2 = new JLabel("");
		img2.setBounds(279, 48, 230, 210);
		frame.getContentPane().add(img2);
		
		img3 = new JLabel("");
		img3.setBounds(622, 66, 54, 54);
		frame.getContentPane().add(img3);
		
		img4 = new JLabel("");
		img4.setBounds(717, 66, 54, 54);
		frame.getContentPane().add(img4);
		
		img6 = new JLabel("");
		img6.setBounds(279, 294, 230, 210);
		frame.getContentPane().add(img6);
		
		img7 = new JLabel("");
		img7.setBounds(622, 337, 54, 54);
		frame.getContentPane().add(img7);
		
		img8 = new JLabel("");
		img8.setBounds(717, 337, 54, 54);
		frame.getContentPane().add(img8);
		
		img10 = new JLabel("");
		img10.setBounds(279, 540, 230, 210);
		frame.getContentPane().add(img10);
		
		img13 = new JLabel("");
		img13.setBounds(15, 802, 230, 210);
		frame.getContentPane().add(img13);
		
		img14 = new JLabel("");
		img14.setBounds(266, 802, 230, 210);
		frame.getContentPane().add(img14);
		
		img11 = new JLabel("");
		img11.setBounds(622, 577, 54, 54);
		frame.getContentPane().add(img11);
		
		img15 = new JLabel("");
		img15.setBounds(622, 837, 54, 54);
		frame.getContentPane().add(img15);
		
		img16 = new JLabel("");
		img16.setBounds(717, 837, 54, 54);
		frame.getContentPane().add(img16);
		
		img12 = new JLabel("");
		img12.setBounds(717, 577, 54, 54);
		frame.getContentPane().add(img12);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1478, 0, 26, 1050);
		frame.getContentPane().add(scrollBar);
		
		JButton button = new JButton("<Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					Hotel h= new Hotel();
					h.frame.setVisible(true);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		button.setBounds(1328, 12, 115, 29);
		frame.getContentPane().add(button);
		fillLabels() ;
	}
}
