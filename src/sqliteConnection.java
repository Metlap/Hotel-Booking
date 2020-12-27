import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;
public class sqliteConnection {
	Connection conn=null;
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sai\\eclipse-workspacew\\DB1.sqlite");
			//JOptionPane.showMessageDialog(null, "connec success");
			return conn;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	Connection connec=null;
	public static Connection db2Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connec=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sai\\eclipse-workspacew\\Locations.sqlite");
			//JOptionPane.showMessageDialog(null, "connec success");
			return connec;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	Connection conndatabase=null;
public static Connection dbdatabaseConnector() {
	try {
		Class.forName("org.sqlite.JDBC");
		Connection conndatabase=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sai\\eclipse-workspacew\\Database.sqlite");
		//JOptionPane.showMessageDialog(null, "connec success");
		return conndatabase;
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
}
}
