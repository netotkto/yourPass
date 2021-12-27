import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class WindowMain {
	private static JFrame mainWindow;
	private static JPanel panel;
	private static JButton btnAdd;
	private static JTable table;
	private static JScrollPane scrollPane;

	static void drawMainWindow() {
		mainWindow = new JFrame("yourPass");
		panel = new JPanel();

		String columnHeaders[] = { "Title", "User Name", "Password", "URL" };
		String data[][] = { { "pornhub", "Yelysei", "*dungeonmaster228", "pornhub.com" },
				{ "xvideos", "Yaroslav", "*pososiU", "xvideos.com" } };
		table = new JTable(data, columnHeaders);
		table.setShowGrid(false);
		scrollPane = new JScrollPane(table);

		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowAdd.drawAddWindow();
				mainWindow.dispose();
			}
		});

		btnAdd.setBounds(850, 620, 100, 30);
		scrollPane.setBounds(0, 0, 950, 400);

		panel.setLayout(null);
		panel.add(btnAdd);
		panel.add(scrollPane);

		mainWindow.add(scrollPane);
		mainWindow.add(panel);
		mainWindow.setTitle("yourPass");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setPreferredSize(new Dimension(1000, 720));
		mainWindow.pack();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}

}
