import java.awt.EventQueue;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import com.toedter.calendar.JCalendar;
public class UserDemo {

	JFrame frame;
	 JTextField textFieldUN;
	 JPasswordField passwordField;
	static String username=new String();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	Connection conn1=null;
	/**
	 * Create the application.
	 */
	public UserDemo() {
		initialize();
		conn1=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setForeground(UIManager.getColor("List.selectionBackground"));
		frame.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		frame.getContentPane().setBackground(UIManager.getColor("List.background"));
		frame.setBounds(100, 100, 765, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(374, 87, 239, 31);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 150, 239, 31);
		frame.getContentPane().add(passwordField);
		
		JLabel user = new JLabel("Username");
		user.setFont(new Font("Lucida Sans", user.getFont().getStyle() | Font.BOLD, 16));
		user.setBounds(267, 87, 92, 31);
		frame.getContentPane().add(user);
		
		JLabel pass = new JLabel("Password");
		pass.setFont(new Font("Lucida Sans", pass.getFont().getStyle() | Font.BOLD, 17));
		pass.setBounds(267, 154, 92, 23);
		frame.getContentPane().add(pass);
		
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		Image img=new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
		btnlogin.setIcon(new ImageIcon(img));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					username =textFieldUN.getText();
					System.out.println(username);
					String query="select * from UserInfo where Username=? and Password=?";
					PreparedStatement pst=conn1.prepareStatement(query);
					String pass=passwordField .getText();
					pst.setString(1,textFieldUN.getText() );
					pst.setString(2,pass);
				
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count++;
					}
					if(count==1) {
						//JOptionPane.showMessageDialog(null, "username and password are correct");
						frame.dispose();
						Entry1 e=new Entry1();
						e.frame.setVisible(true);
						
						
					}
					else if (count>1) {
						JOptionPane.showMessageDialog(null, "username and password are duplicate");
					}
					else{
						JOptionPane.showMessageDialog(null, "username and password are incorrect try again");
					}
					rs.close();
					pst.close();
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
					
				}
				
			}
		});
		btnlogin.setFont(new Font("Lucida Sans", btnlogin.getFont().getStyle() | Font.BOLD, 17));
		btnlogin.setBounds(267, 248, 108, 39);
		frame.getContentPane().add(btnlogin);
		
		JButton btnregister = new JButton("<Back");
		btnregister.setBackground(UIManager.getColor("Button.focus"));
		btnregister.addActionListener(new ActionListener() {
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
		btnregister.setFont(new Font("Lucida Sans", btnregister.getFont().getStyle() | Font.BOLD, btnregister.getFont().getSize() + 1));
		btnregister.setBounds(463, 248, 108, 39);
		frame.getContentPane().add(btnregister);
		
		JLabel lblNewLabel = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(77, 51, 177, 179);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/rsz_hi.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		lblNewLabel_1.setBounds(1, 1,742,395);
		frame.getContentPane().add(lblNewLabel_1);
	
	}
}
