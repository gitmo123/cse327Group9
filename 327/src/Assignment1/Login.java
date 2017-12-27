package Assignment1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Login implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField pwdPassword;
	private JButton btnLogin;
	private RegistrationJframe rj = new RegistrationJframe();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("login");
		textField.setBounds(166, 80, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(166, 140, 86, 20);
		frame.getContentPane().add(pwdPassword);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(34, 83, 86, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(40, 143, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 31, 182, 38);
		frame.getContentPane().add(lblNewLabel);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(163, 211, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			
			String username = textField.getText();
			String password = pwdPassword.getText();
			
			if(username.contains("s1") && password.contains("1234")) {
				
				RegistrationJframe.main(null);
				
			}
			
			else if(username.contains("s2") && password.contains("1234")) {
				
				RegistrationJframe.main(null);
				
			}
			
            else if(username.contains("s3") && password.contains("1234")) {
				
				RegistrationJframe.main(null);
				
			}
			
            else if(username.contains("a1") && password.contains("1234")) {
				
				RegistrationJframe.main(null);
				
			}

            else if(username.contains("a2") && password.contains("1234")) {
				
				RegistrationJframe.main(null);
				
			}

			
		}
		
	}
}
