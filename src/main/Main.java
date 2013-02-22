package main;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

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
		frmBonganChart.setTitle("Bongan Chart");
		frmBonganChart.setBounds(100, 100, 640, 200);
		frmBonganChart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBonganChart.setMinimumSize(new Dimension(640, 200));
		
		JLabel lblInputFile = new JLabel("Input file");
		
		textInputPath = new JTextField();
		
		btnBrowseInput = new JButton("Browse");
		btnBrowseInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileOpenChooser = new JFileChooser();
				fileOpenChooser.addChoosableFileFilter(new FileNameExtensionFilter(".str", "STR", "str"));
				fileOpenChooser.showOpenDialog(fileOpenChooser);

			}
		});
		
		
		lblOutputFile = new JLabel("Output file");
		
		textOutputPath = new JTextField();
		
		btnBrowseOutput = new JButton("Browse");
		btnBrowseOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileSaveChooser = new JFileChooser();
				fileSaveChooser.addChoosableFileFilter(new FileNameExtensionFilter("Autocad DXF file", "DXF", "dxf"));
				fileSaveChooser.showSaveDialog(fileSaveChooser);

			}
		});

		
		lblAbout = new JLabel("About");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnCreateDXF = new JButton("Create DXF");
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmBonganChart.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAbout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInputFile)
								.addComponent(lblOutputFile))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textOutputPath, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
								.addComponent(textInputPath, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
								.addComponent(btnCreateDXF, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
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
						.addComponent(lblOutputFile, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textOutputPath, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
							.addComponent(btnBrowseOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCreateDXF)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAbout, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmBonganChart.getContentPane().setLayout(groupLayout);
	}
}
