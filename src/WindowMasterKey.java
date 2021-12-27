import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class WindowMasterKey {
	private static JFrame masterKeyFrame;
	private static JPanel panel;
	private static JPasswordField fieldPass;
	private static JButton btnOk;
	private static JLabel lblMasterKey;

	public static void drawMasterKeyWindow() {
		masterKeyFrame = new JFrame();

		panel = new JPanel();
		fieldPass = new JPasswordField();
		btnOk = new JButton("OK");
		lblMasterKey = new JLabel("Master Key: ");
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowMain.drawMainWindow();
				masterKeyFrame.dispose();
			}
		});
		
		lblMasterKey.setBounds(80, 115, 120, 30);
		lblMasterKey.setFont(new Font("Arial", Font.PLAIN, 18));
		fieldPass.setBounds(180, 115, 150, 30);
		btnOk.setBounds(380, 250, 80, 60);
		
		panel.setLayout(null);
		panel.add(btnOk);
		panel.add(lblMasterKey);
		panel.add(fieldPass);
		
		masterKeyFrame.add(panel);
		masterKeyFrame.setTitle("Enter Master Key:");
		masterKeyFrame.setPreferredSize(new Dimension(500, 360));
		masterKeyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		masterKeyFrame.pack();
		masterKeyFrame.setLocationRelativeTo(null);
		masterKeyFrame.setVisible(true);
	}
}
