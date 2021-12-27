import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class WindowMain extends JFrame {
	static public JFrame mainWindow = new JFrame("yourPass");

	public static DefaultListModel demoTitles = new DefaultListModel();
	public static DefaultListModel demoUsername = new DefaultListModel();
	public static DefaultListModel demoPassword = new DefaultListModel();
	public static DefaultListModel demoUrl = new DefaultListModel();

	static void drawMainWindow() {
		JPanel panel = new JPanel();

		demoTitles = (DefaultListModel) List.getListTitles();
		demoUsername = (DefaultListModel) List.getListUsername();
		demoPassword = (DefaultListModel) List.getListPassword();
		demoUrl = (DefaultListModel) List.getListUrl();

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

		labelItems.setBounds(208, 20, labelItems.getPreferredSize().width, 
				labelItems.getPreferredSize().height);
		labelTitles.setBounds(20, 50, labelTitles.getPreferredSize().width, 
				labelTitles.getPreferredSize().height);
		labelUsername.setBounds(140, 50, labelUsername.getPreferredSize().width,
				labelUsername.getPreferredSize().height);
		labelPassword.setBounds(260, 50, labelPassword.getPreferredSize().width,
				labelPassword.getPreferredSize().height);
		labelUrl.setBounds(380, 50, labelUrl.getPreferredSize().width, 
				labelUrl.getPreferredSize().height);

		listTitles.setBounds(20, 70, 100, 280);
		listUsername.setBounds(140, 70, 100, 280);
		listPassword.setBounds(260, 70, 100, 280);
		listUrl.setBounds(380, 70, 100, 280);
		buttonAdd.setBounds(500, 200, 100, 30);

		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindowAdd.drawAddWindow();
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
		mainWindow.setPreferredSize(new Dimension(1000, 720));
		mainWindow.pack();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}

}
