package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frmBonganChart;
	private JTextField textInputPath;
	private JButton btnBrowseInput;
	private JLabel lblOutputFile;
	private JTextField textOutputPath;
	private JButton btnBrowseOutput;
	private JLabel lblAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBonganChart.setVisible(true);
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
		frmBonganChart = new JFrame();
		frmBonganChart.setResizable(false);
		frmBonganChart.setTitle("Bongan Chart");
		frmBonganChart.setBounds(100, 100, 700, 200);
		frmBonganChart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblInputFile = new JLabel("Input file");
		
		textInputPath = new JTextField();
		textInputPath.setColumns(10);
		
		btnBrowseInput = new JButton("Browse");
		
		lblOutputFile = new JLabel("Output file");
		
		textOutputPath = new JTextField();
		textOutputPath.setColumns(10);
		
		btnBrowseOutput = new JButton("Browse");
		
		lblAbout = new JLabel("About");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frmBonganChart.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAbout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInputFile)
								.addComponent(lblOutputFile))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textOutputPath, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
								.addComponent(textInputPath, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnBrowseInput)
								.addComponent(btnBrowseOutput))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblInputFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textInputPath, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBrowseInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblOutputFile, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textOutputPath, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
							.addComponent(btnBrowseOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(18)
					.addComponent(lblAbout, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmBonganChart.getContentPane().setLayout(groupLayout);
	}
}
