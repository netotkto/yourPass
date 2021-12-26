import javax.swing.DefaultListModel;

import javax.swing.*;

public class List {
	public static DefaultListModel demoTitles = new DefaultListModel();
	public static DefaultListModel demoUsername = new DefaultListModel();
	public static DefaultListModel demoPassword = new DefaultListModel();
	public static DefaultListModel demoUrl = new DefaultListModel();
	
	public static Object getListTitles(String title) {
		demoTitles.addElement(title);
		return demoTitles;
	}
	public static Object getListTitles() {
		demoTitles.addElement("ruban.elisey.1996@gmail.com");
		return demoTitles;
	}
	
	public static Object getListUsername(String Username) {
		demoUsername.addElement(Username);
		return demoUsername;
	}
	public static Object getListUsername() {
		demoUsername.addElement("Yelysei");
		return demoUsername;
	}
	
	public static Object getListPassword(String password) {
		demoPassword.addElement(password);
		return demoPassword;
	}
	public static Object getListPassword() {
		demoPassword.addElement("*dungeonmaster228*");
		return demoPassword;
	}
	
	public static Object getListUrl(String url) {
		demoUrl.addElement(url);
		return demoUrl;
	}
	public static Object getListUrl() {
		demoUrl.addElement("pornhub.com");
		return demoUrl;
	}
}
