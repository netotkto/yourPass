import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowAdd {
	static void drawAddWindow() {
		JFrame windowAdd = new JFrame("AddPass");
		JPanel panel = new JPanel();
		JLabel labelUrl = new JLabel("URL:");
		JTextField textfieldUrl = new JTextField();

		labelUrl.setBounds(10, 10, labelUrl.getPreferredSize().width, 
				labelUrl.getPreferredSize().height);

		textfieldUrl.setBounds(10, 25, 572, 20);

		panel.setLayout(null);
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
