import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Font;
import javax.swing.JComboBox;

public class DataEntry 
{
	private JTextField autoLabel;
	private JTextField cycle1Text;
	private static JTextField questionCyclesAttempted;
	private static JTextField cyclesAttempted;
	private static JTextField bridgeParkBox;
	private static JTextField foundationMoveBox;
	private static JTextField txtTeleopFields;
	private static JTextField bridgeCyclesAlliance;
	private static JTextField cycleCount;
	private static JTextField cycleBridgeCenter;
	private static JTextField textField;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void dataEntry(XSSFWorkbook sheet)
	{
		//Creates window
		JFrame window = new JFrame();
		window.setSize(1200, 700);
		window.setLocationRelativeTo(null);
		
		//Application Icon
		ImageIcon logo = new ImageIcon("C:\\Users\\Captaincow285\\git\\MassScout_App\\MassScout_App\\img\\Logo.png");
		window.setIconImage(logo.getImage());
		window.getContentPane().setLayout(null);
		
		//Autonomous Section
		JTextField autoLabel = new JTextField();
		autoLabel.setText("Autonomous Fields");
		autoLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		autoLabel.setEditable(false);
		autoLabel.setBounds(50, 50, 300, 30);
		window.getContentPane().add(autoLabel);
		autoLabel.setColumns(10);
		
		JTextField cycle1Text = new JTextField();
		cycle1Text.setText("Cycle Time Stone 1");
		cycle1Text.setEditable(false);
		cycle1Text.setBounds(50, 110, 100, 20);
		window.getContentPane().add(cycle1Text);
		cycle1Text.setColumns(10);
		
		String[] cycleOptions = {"Select One", "Attempted", "Succeded", "Did Not Attempt"};
		JComboBox cycle1Options = new JComboBox(cycleOptions);
		cycle1Options.setBounds(50, 135, 150, 20);
		window.getContentPane().add(cycle1Options);
		int dropdownIndex1 = cycle1Options.getSelectedIndex();
		
		JTextField cycle2Text = new JTextField();
		cycle2Text.setText("Cycle Time Stone 2");
		cycle2Text.setEditable(false);
		cycle2Text.setBounds(50, 230, 100, 20);
		window.getContentPane().add(cycle2Text);
		cycle2Text.setColumns(10);
		
		JComboBox cycle2Options = new JComboBox(cycleOptions);
		cycle2Options.setBounds(50, 255, 150, 20);
		window.getContentPane().add(cycle2Options);
		int dropdownIndex2 = cycle1Options.getSelectedIndex();
		
		questionCyclesAttempted = new JTextField();
		questionCyclesAttempted.setText("Number of Cycles Attempted (Whole number)");
		questionCyclesAttempted.setEditable(false);
		questionCyclesAttempted.setBounds(50, 350, 250, 20);
		window.getContentPane().add(questionCyclesAttempted);
		questionCyclesAttempted.setColumns(10);
		
		cyclesAttempted = new JTextField();
		cyclesAttempted.setBounds(50, 375, 86, 20);
		window.getContentPane().add(cyclesAttempted);
		cyclesAttempted.setColumns(10);
		
		bridgeParkBox = new JTextField();
		bridgeParkBox.setText("Parked under bridge?");
		bridgeParkBox.setEditable(false);
		bridgeParkBox.setBounds(50, 410, 120, 20);
		window.getContentPane().add(bridgeParkBox);
		bridgeParkBox.setColumns(10);
		
		String[] yesNo = {"Nothing Selected", "Yes", "No"};
		
		JComboBox bridgeOutput = new JComboBox(yesNo);
		bridgeOutput.setBounds(50, 435, 120, 20);
		window.getContentPane().add(bridgeOutput);
		
		foundationMoveBox = new JTextField();
		foundationMoveBox.setText("Foundation moved?");
		foundationMoveBox.setEditable(false);
		foundationMoveBox.setBounds(50, 470, 120, 20);
		window.getContentPane().add(foundationMoveBox);
		foundationMoveBox.setColumns(10);
		
		JComboBox comboBox = new JComboBox(yesNo);
		comboBox.setBounds(50, 495, 120, 20);
		window.getContentPane().add(comboBox);
		
		txtTeleopFields = new JTextField();
		txtTeleopFields.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTeleopFields.setEditable(false);
		txtTeleopFields.setText("TeleOp Fields");
		txtTeleopFields.setBounds(400, 50, 300, 30);
		window.getContentPane().add(txtTeleopFields);
		txtTeleopFields.setColumns(10);
		
		bridgeCyclesAlliance = new JTextField();
		bridgeCyclesAlliance.setText("Number of cycles under Alliance bridge (Whole Number)");
		bridgeCyclesAlliance.setEditable(false);
		bridgeCyclesAlliance.setBounds(400, 110, 300, 20);
		window.getContentPane().add(bridgeCyclesAlliance);
		bridgeCyclesAlliance.setColumns(10);
		
		cycleCount = new JTextField();
		cycleCount.setBounds(400, 135, 86, 20);
		window.getContentPane().add(cycleCount);
		cycleCount.setColumns(10);
		
		cycleBridgeCenter = new JTextField();
		cycleBridgeCenter.setText("Number of cycles under Center Bridge (Whole Number)");
		cycleBridgeCenter.setEditable(false);
		cycleBridgeCenter.setBounds(400, 170, 300, 20);
		window.getContentPane().add(cycleBridgeCenter);
		cycleBridgeCenter.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(400, 195, 86, 20);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		//Final render
		window.setVisible(true);
		
		//Put the check dropdown in the add action listener thing
		/**
		if actionlistener
		
		check all the dropdowns
			within checks check if already done
		
		add actionlistener
		
		reset everything
		
		render
		 */
		
		
		
		//Code needed for later
		/**
		if (dropdownIndex == 0)
		{
			
		}
		else if (dropdownIndex == 1)
		{
			
		}
		else if (dropdownIndex == 2)
		{
			
		}
		else
		{
			
		}
		 */
	}
}
