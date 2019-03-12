import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class VoterWindow {

	private JFrame frame;
	private JTextField VoterIdTxt;
	private JTextField FNameTxt;
	private JTextField LNameTxt;
	private JTextField PNumTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoterWindow window = new VoterWindow();
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
	public VoterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 556, 593);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnVote = new JButton("Submit Ballot");
		btnVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnVote.setFont(new Font("Constantia", Font.BOLD, 18));
		btnVote.setBounds(205, 504, 175, 52);
		panel.add(btnVote);
		
		JLabel lblEvotingMachine = new JLabel("e-Voting Machine");
		lblEvotingMachine.setFont(new Font("Constantia", Font.BOLD, 23));
		lblEvotingMachine.setBounds(10, 10, 196, 41);
		panel.add(lblEvotingMachine);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 61, 522, 9);
		panel.add(separator);
		
		JLabel lblVoterId = new JLabel("Voter ID:");
		lblVoterId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVoterId.setFont(new Font("Constantia", Font.BOLD, 15));
		lblVoterId.setBounds(35, 80, 77, 19);
		panel.add(lblVoterId);
		
		VoterIdTxt = new JTextField();
		VoterIdTxt.setFont(new Font("Constantia", Font.PLAIN, 12));
		VoterIdTxt.setBounds(122, 80, 63, 19);
		panel.add(VoterIdTxt);
		VoterIdTxt.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Constantia", Font.BOLD, 15));
		lblFirstName.setBounds(30, 105, 82, 19);
		panel.add(lblFirstName);
		
		FNameTxt = new JTextField();
		FNameTxt.setFont(new Font("Constantia", Font.PLAIN, 12));
		FNameTxt.setColumns(10);
		FNameTxt.setBounds(122, 105, 84, 19);
		panel.add(FNameTxt);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Constantia", Font.BOLD, 15));
		lblLastName.setBounds(30, 130, 82, 19);
		panel.add(lblLastName);
		
		LNameTxt = new JTextField();
		LNameTxt.setFont(new Font("Constantia", Font.PLAIN, 12));
		LNameTxt.setColumns(10);
		LNameTxt.setBounds(122, 130, 84, 19);
		panel.add(LNameTxt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 195, 522, 9);
		panel.add(separator_1);
		
		JLabel lblDateOfBirth = new JLabel("District:");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateOfBirth.setFont(new Font("Constantia", Font.BOLD, 15));
		lblDateOfBirth.setBounds(0, 155, 112, 19);
		panel.add(lblDateOfBirth);
		
		PNumTxt = new JTextField();
		PNumTxt.setFont(new Font("Constantia", Font.PLAIN, 12));
		PNumTxt.setColumns(10);
		PNumTxt.setBounds(122, 155, 63, 19);
		panel.add(PNumTxt);
		
		JPanel ColorPanel = new JPanel();
		ColorPanel.setBorder(new TitledBorder(null, "Favorite Color", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ColorPanel.setBounds(10, 252, 522, 172);
		panel.add(ColorPanel);
		ColorPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnBlue);
		ColorPanel.add(rdbtnBlue, "2, 2");
		
		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		rdbtnYellow.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnYellow);
		ColorPanel.add(rdbtnYellow, "6, 2");
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnRed);
		ColorPanel.add(rdbtnRed, "2, 4");
		
		JRadioButton rdbtnPurple = new JRadioButton("Purple");
		rdbtnPurple.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnPurple);
		ColorPanel.add(rdbtnPurple, "6, 4");
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnGreen);
		ColorPanel.add(rdbtnGreen, "2, 6");
		
		JRadioButton rdbtnOrange = new JRadioButton("Orange");
		rdbtnOrange.setFont(new Font("Constantia", Font.PLAIN, 15));
		buttonGroup.add(rdbtnOrange);
		ColorPanel.add(rdbtnOrange, "6, 6");
	}
}
