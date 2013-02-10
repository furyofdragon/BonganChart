package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	private JFrame frmBonganchart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBonganchart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBonganchart = new JFrame();
		frmBonganchart.setResizable(false);
		frmBonganchart.setTitle("Bongan Chart");
		frmBonganchart.setBounds(100, 100, 700, 200);
		frmBonganchart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
