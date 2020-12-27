import java.util.regex.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.EmptyBorder;
import org.sqlite.SQLiteConnection;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Registerpage extends JFrame {
	private JTextField textFielduser;
	private JTextField textFieldemail;
	private JTextField textFieldname;
	private JTextField textFielddob;
	private JTextField textFieldaddress;
	private JTextField textFieldpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerpage frame = new Registerpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn1=null;
	/**
	 * Create the frame.
	 */
	public Registerpage() {
		getContentPane().setBackground(new Color(255, 255, 255));
		conn1=sqliteConnection.dbConnector();
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(null);
		
		JLabel username = new JLabel("Username");
		username.setBackground(UIManager.getColor("textHighlight"));
		username.setFont(new Font("Lucida Sans", username.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, 15));
		username.setBounds(21, 22, 129, 31);
		getContentPane().add(username);
		
		JLabel email = new JLabel("email-ID");
		email.setFont(new Font("Lucida Sans", email.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, email.getFont().getSize() - 1));
		email.setBounds(21, 64, 102, 25);
		getContentPane().add(email);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Lucida Sans", name.getFont().getStyle() | Font.BOLD, name.getFont().getSize() - 1));
		name.setBounds(21, 100, 69, 14);
		getContentPane().add(name);
		
		JLabel dob = new JLabel("DOB(dd/mm/yyyy)");
		dob.setFont(new Font("Lucida Sans", dob.getFont().getStyle() | Font.BOLD, dob.getFont().getSize() - 1));
		dob.setBounds(21, 125, 153, 36);
		getContentPane().add(dob);
		
		JLabel address = new JLabel("Address");
		address.setFont(new Font("Lucida Sans", address.getFont().getStyle() | Font.BOLD, address.getFont().getSize() - 1));
		address.setBounds(21, 172, 69, 14);
		getContentPane().add(address);
		
		JLabel passwordr = new JLabel("Password");
		passwordr.setFont(new Font("Lucida Sans", passwordr.getFont().getStyle() | Font.BOLD, passwordr.getFont().getSize() - 1));
		passwordr.setBounds(21, 248, 102, 14);
		getContentPane().add(passwordr);
		
		textFielduser = new JTextField();
		textFielduser.setBounds(177, 29, 273, 20);
		getContentPane().add(textFielduser);
		textFielduser.setColumns(10);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(177, 68, 273, 20);
		getContentPane().add(textFieldemail);
		textFieldemail.setColumns(10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(177, 99, 273, 20);
		getContentPane().add(textFieldname);
		textFieldname.setColumns(10);
		
		textFielddob = new JTextField();
		textFielddob.setBounds(177, 134, 273, 20);
		getContentPane().add(textFielddob);
		textFielddob.setColumns(10);
		
		textFieldaddress = new JTextField();
		textFieldaddress.setBounds(177, 171, 273, 65);
		getContentPane().add(textFieldaddress);
		textFieldaddress.setColumns(10);
		
		textFieldpass = new JTextField();
		textFieldpass.setBounds(177, 247, 273, 20);
		getContentPane().add(textFieldpass);
		textFieldpass.setColumns(10);
		
		JButton btnregister = new JButton("Register");
		btnregister.setBackground(UIManager.getColor("Button.darkShadow"));
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="insert into UserInfo (Username,Name,EmailID,DOB,Address,Password) values (?,?,?,?,?,?)";
					PreparedStatement pst=conn1.prepareStatement(query);
					String s1= textFielduser.getText();
					String s2= textFieldname.getText();
					String s3= textFieldemail.getText();
					String s4= textFielddob.getText();
					String s5= textFieldaddress.getText();
					String s6= textFieldpass.getText();
					if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",textFieldemail.getText()))) 
					{
					            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
					            }
					else if (!(Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}",textFieldpass.getText()))) 
					{
					            JOptionPane.showMessageDialog(null, "Password should contain an uppercase,a number,a special character and minlength 8", "Error", JOptionPane.ERROR_MESSAGE);
					            }
					        
					else if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")) {
						JOptionPane.showMessageDialog(null, "All the fields are to entered");
					}
					else {
						pst.setString(1,textFielduser.getText() );
						pst.setString(2,textFieldname.getText() );
						pst.setString(3,textFieldemail.getText() );
						pst.setString(4,textFielddob.getText() );
						pst.setString(5,textFieldaddress.getText() );
						pst.setString(6,textFieldpass.getText() );
						pst.execute();
						pst.close();
						JOptionPane.showMessageDialog(null,"Registration Succesful");
						dispose();
						UserDemo loginpage= new UserDemo();
						loginpage.frame.setVisible(true);

					}
		
					
					
									}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
					
				}
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnregister.setBounds(177, 291, 129, 36);
		getContentPane().add(btnregister);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(517, 295, 115, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserDemo window = new UserDemo();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		getContentPane().add(btnBack);
		Image img3=new ImageIcon(this.getClass().getResource("/rsz_hi3.png")).getImage();
		
		
	}
}
