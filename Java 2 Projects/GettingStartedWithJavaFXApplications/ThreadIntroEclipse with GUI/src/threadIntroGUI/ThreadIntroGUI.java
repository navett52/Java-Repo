package threadIntroGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ThreadIntro.MyThread;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ThreadIntroGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumberOfThreads;
	private JLabel lblNewLabel;
	private int clickCounter;
	private JLabel lblClickCounter;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreadIntroGUI frame = new ThreadIntroGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThreadIntroGUI() {
		clickCounter = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnGo.setEnabled(false);
				clickCounter++;
				lblClickCounter.setText(clickCounter + " clicks.");
				for (int i = 0; i < Integer.parseInt(txtNumberOfThreads.getText()); i++) {
					MyThread mt = new MyThread(lblNewLabel, i);
					mt.start();
				}
				btnGo.setEnabled(true);
			}
		});
		btnGo.setBounds(10, 239, 91, 23);
		contentPane.add(btnGo);
		
		JLabel lblOfThreads = new JLabel("# of threads");
		lblOfThreads.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOfThreads.setBounds(10, 38, 110, 14);
		contentPane.add(lblOfThreads);

		txtNumberOfThreads = new JTextField();
		txtNumberOfThreads.setText("100");
		txtNumberOfThreads.setBounds(130, 35, 47, 20);
		contentPane.add(txtNumberOfThreads);
		txtNumberOfThreads.setColumns(10);

		lblNewLabel = new JLabel("Results Here");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(10, 80, 206, 104);
		contentPane.add(lblNewLabel);
		
		lblClickCounter = new JLabel("");
		lblClickCounter.setBounds(112, 243, 153, 14);
		contentPane.add(lblClickCounter);
	}
}
