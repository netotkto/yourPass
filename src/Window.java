import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;  
import javax.swing.*;

public class Window extends JFrame{
	
	static Dimension getLabelSize(JLabel l) {
		return l.getPreferredSize();
	}
	// hahah
	
	public static DefaultListModel demoTitles = new DefaultListModel();
	public static DefaultListModel demoUsername = new DefaultListModel();
	public static DefaultListModel demoPassword = new DefaultListModel();
	public static DefaultListModel demoUrl = new DefaultListModel();
	static public JFrame mainWindow = new JFrame("A window");
	
	static void DrawMainWindow() {
		demoTitles = (DefaultListModel) List.getListTitles();
		demoUsername = (DefaultListModel) List.getListUsername();
		demoPassword = (DefaultListModel) List.getListPassword();
		demoUrl = (DefaultListModel) List.getListUrl();
		
		JPanel panel = new JPanel();
	    JLabel labelItems = new JLabel("Items");
	    JLabel labelTitles = new JLabel("Titles");
	    JLabel labelUsername = new JLabel("Username");
	    JLabel labelPassword = new JLabel("Password");
	    JLabel labelUrl = new JLabel("URL");
	    JList listTitles = new JList(demoTitles);
	    JList listUsername = new JList(demoUsername);
	    JList listPassword = new JList(demoPassword);
	    JList listUrl = new JList(demoUrl);
	    JButton buttonAdd = new JButton("Add");
	    
	    
		
		labelItems.setBounds(208, 20, getLabelSize(labelItems).width, getLabelSize(labelItems).height);
		labelTitles.setBounds(20, 50, getLabelSize(labelTitles).width, getLabelSize(labelTitles).height);
		labelUsername.setBounds(140, 50, getLabelSize(labelUsername).width, getLabelSize(labelUsername).height);
		labelPassword.setBounds(260, 50, getLabelSize(labelPassword).width, getLabelSize(labelPassword).height);
		labelUrl.setBounds(380, 50, getLabelSize(labelUrl).width, getLabelSize(labelUrl).height);
		
		
		
		listTitles.setBounds(20, 70, 100, 280);
		listUsername.setBounds(140, 70, 100, 280);
		listPassword.setBounds(260, 70, 100, 280);
		listUrl.setBounds(380, 70, 100, 280);
		buttonAdd.setBounds(500, 200, 100, 30);
		
		buttonAdd.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
						 DrawAddWindow();
					     mainWindow.dispose();
			         }  
			     });  
		
		panel.setLayout(null);
		panel.add(labelItems);
		panel.add(labelTitles);
		panel.add(labelUsername);
		panel.add(labelPassword);
		panel.add(labelUrl);
		panel.add(buttonAdd);
		
		panel.add(listTitles);
		panel.add(listUsername);
		panel.add(listPassword);
		panel.add(listUrl);
		
		mainWindow.add(panel);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setPreferredSize(new Dimension(650, 400));
		mainWindow.pack();
	    mainWindow.setLocationRelativeTo(null);
	    
	    mainWindow.setVisible(true);
	}
	
	static void DrawAddWindow() {
		JFrame windowAdd = new JFrame("AddPass");
		JPanel panel = new JPanel();
		JLabel labelUrl = new  JLabel("URL:");
		JTextField textfieldUrl = new JTextField();
		
		labelUrl.setBounds(10, 10, getLabelSize(labelUrl).width, getLabelSize(labelUrl).height);
		
		textfieldUrl.setBounds(10, 25, windowAdd.getPreferredSize().width, 20);
		
		panel.add(labelUrl);
		panel.add(textfieldUrl);
		
		windowAdd.add(panel);
		windowAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowAdd.setPreferredSize(new Dimension(600, 400));
		windowAdd.pack();
		windowAdd.setLocationRelativeTo(null);
		
		windowAdd.setVisible(true);
		
	}

}
