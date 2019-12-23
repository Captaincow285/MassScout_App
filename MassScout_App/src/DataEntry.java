import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.Panel;

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
	private static JTextField scraperHeightBox;
	private static JTextField heightInput;
	private static JTextField heightLabel1;
	private static JTextField heightLabel2;
	private static JTextField heightLabel3;
	private static JTextField heightLabel4;
	private static JTextField heightLabel5;
	private static JTextField heightLabel6;
	private static JTextField heightLabel7;
	private static JTextField heightLabel8;
	private static JTextField heightLabel9;
	private static JTextField heightLabel10;
	private static JTextField tableInput1;
	private static JTextField tableInput2;
	private static JTextField tableInput3;
	private static JTextField tableInput4;
	private static JTextField tableInput5;
	private static JTextField tableInput6;
	private static JTextField tableInput7;
	private static JTextField tableInput8;
	private static JTextField tableInput9;
	private static JTextField tableInput10;
	private static JTextField endgameFields;
	private static JTextField foundationMove;
	private static JComboBox foundationSelection;
	private static JTextField foundationMoved;
	private static JTextField buildZone;
	private static JComboBox parkSelection;
	private static JTextField notesField;
	private static JTextField teamNumberBox;
	private static JTextField numberBox;
	private static JTextField matchNumBox;
	private static JTextField matchNumber;
	private static JTextField allianceSelection;
	private static JTextField allianceSelectionOutput;
	private static JTextField pageLabel;
	private static JTextField subLabel;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void dataEntry(XSSFWorkbook sheet)
	{
		//Creates window
		JFrame window = new JFrame();
		window.setSize(1100, 700);
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
		autoLabel.setBounds(50, 190, 300, 30);
		window.getContentPane().add(autoLabel);
		autoLabel.setColumns(10);
		
		JTextField cycle1Text = new JTextField();
		cycle1Text.setText("Cycle Time Stone 1");
		cycle1Text.setEditable(false);
		cycle1Text.setBounds(50, 235, 100, 20);
		window.getContentPane().add(cycle1Text);
		cycle1Text.setColumns(10);
		
		String[] cycleOptions = {"Select One", "Attempted", "Succeded", "Did Not Attempt"};
		JComboBox cycle1Options = new JComboBox(cycleOptions);
		cycle1Options.setBounds(50, 260, 150, 20);
		window.getContentPane().add(cycle1Options);
		int dropdownIndex1 = cycle1Options.getSelectedIndex();
		
		JTextField cycle2Text = new JTextField();
		cycle2Text.setText("Cycle Time Stone 2");
		cycle2Text.setEditable(false);
		cycle2Text.setBounds(50, 355, 100, 20);
		window.getContentPane().add(cycle2Text);
		cycle2Text.setColumns(10);
		
		JComboBox cycle2Options = new JComboBox(cycleOptions);
		cycle2Options.setBounds(50, 380, 150, 20);
		window.getContentPane().add(cycle2Options);
		int dropdownIndex2 = cycle1Options.getSelectedIndex();
		
		questionCyclesAttempted = new JTextField();
		questionCyclesAttempted.setText("Number of Cycles Attempted (Whole number)");
		questionCyclesAttempted.setEditable(false);
		questionCyclesAttempted.setBounds(50, 475, 250, 20);
		window.getContentPane().add(questionCyclesAttempted);
		questionCyclesAttempted.setColumns(10);
		
		cyclesAttempted = new JTextField();
		cyclesAttempted.setBounds(50, 500, 86, 20);
		window.getContentPane().add(cyclesAttempted);
		cyclesAttempted.setColumns(10);
		
		bridgeParkBox = new JTextField();
		bridgeParkBox.setText("Parked under bridge?");
		bridgeParkBox.setEditable(false);
		bridgeParkBox.setBounds(50, 535, 120, 20);
		window.getContentPane().add(bridgeParkBox);
		bridgeParkBox.setColumns(10);
		
		String[] yesNo = {"Nothing Selected", "Yes", "No"};
		
		JComboBox bridgeOutput = new JComboBox(yesNo);
		bridgeOutput.setBounds(50, 560, 150, 20);
		window.getContentPane().add(bridgeOutput);
		
		foundationMoveBox = new JTextField();
		foundationMoveBox.setText("Foundation moved?");
		foundationMoveBox.setEditable(false);
		foundationMoveBox.setBounds(50, 595, 120, 20);
		window.getContentPane().add(foundationMoveBox);
		foundationMoveBox.setColumns(10);
		
		JComboBox comboBox = new JComboBox(yesNo);
		comboBox.setBounds(50, 620, 150, 20);
		window.getContentPane().add(comboBox);
		
		txtTeleopFields = new JTextField();
		txtTeleopFields.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTeleopFields.setEditable(false);
		txtTeleopFields.setText("TeleOp Fields");
		txtTeleopFields.setBounds(400, 190, 300, 30);
		window.getContentPane().add(txtTeleopFields);
		txtTeleopFields.setColumns(10);
		
		bridgeCyclesAlliance = new JTextField();
		bridgeCyclesAlliance.setText("Number of cycles under Alliance bridge (Whole Number)");
		bridgeCyclesAlliance.setEditable(false);
		bridgeCyclesAlliance.setBounds(400, 235, 300, 20);
		window.getContentPane().add(bridgeCyclesAlliance);
		bridgeCyclesAlliance.setColumns(10);
		
		cycleCount = new JTextField();
		cycleCount.setBounds(400, 260, 86, 20);
		window.getContentPane().add(cycleCount);
		cycleCount.setColumns(10);
		
		cycleBridgeCenter = new JTextField();
		cycleBridgeCenter.setText("Number of cycles under Center Bridge (Whole Number)");
		cycleBridgeCenter.setEditable(false);
		cycleBridgeCenter.setBounds(400, 295, 300, 20);
		window.getContentPane().add(cycleBridgeCenter);
		cycleBridgeCenter.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(400, 320, 86, 20);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		scraperHeightBox = new JTextField();
		scraperHeightBox.setEditable(false);
		scraperHeightBox.setText("Skyscraper Height");
		scraperHeightBox.setBounds(400, 355, 100, 20);
		window.getContentPane().add(scraperHeightBox);
		scraperHeightBox.setColumns(10);
		
		heightInput = new JTextField();
		heightInput.setEditable(false);
		heightInput.setText("Number of blocks @ height (Integer)");
		heightInput.setBounds(510, 355, 190, 20);
		window.getContentPane().add(heightInput);
		heightInput.setColumns(10);
		
		heightLabel1 = new JTextField();
		heightLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel1.setEditable(false);
		heightLabel1.setText("First Layer");
		heightLabel1.setBounds(400, 380, 100, 20);
		window.getContentPane().add(heightLabel1);
		heightLabel1.setColumns(10);
		
		heightLabel2 = new JTextField();
		heightLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel2.setText("Second Layer");
		heightLabel2.setEditable(false);
		heightLabel2.setBounds(400, 405, 100, 20);
		window.getContentPane().add(heightLabel2);
		heightLabel2.setColumns(10);
		
		heightLabel3 = new JTextField();
		heightLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel3.setText("Third Layer");
		heightLabel3.setEditable(false);
		heightLabel3.setBounds(400, 430, 100, 20);
		window.getContentPane().add(heightLabel3);
		heightLabel3.setColumns(10);
		
		heightLabel4 = new JTextField();
		heightLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel4.setText("Fourth Layer");
		heightLabel4.setEditable(false);
		heightLabel4.setBounds(400, 455, 100, 20);
		window.getContentPane().add(heightLabel4);
		heightLabel4.setColumns(10);
		
		heightLabel5 = new JTextField();
		heightLabel5.setText("Fifth Layer");
		heightLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel5.setEditable(false);
		heightLabel5.setBounds(400, 480, 100, 20);
		window.getContentPane().add(heightLabel5);
		heightLabel5.setColumns(10);
		
		heightLabel6 = new JTextField();
		heightLabel6.setText("Sixth Layer");
		heightLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel6.setEditable(false);
		heightLabel6.setBounds(400, 505, 100, 20);
		window.getContentPane().add(heightLabel6);
		heightLabel6.setColumns(10);
		
		heightLabel7 = new JTextField();
		heightLabel7.setText("Seventh Layer");
		heightLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel7.setEditable(false);
		heightLabel7.setBounds(400, 530, 100, 20);
		window.getContentPane().add(heightLabel7);
		heightLabel7.setColumns(10);
		
		heightLabel8 = new JTextField();
		heightLabel8.setText("Eighth Layer");
		heightLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel8.setEditable(false);
		heightLabel8.setBounds(400, 555, 100, 20);
		window.getContentPane().add(heightLabel8);
		heightLabel8.setColumns(10);
		
		heightLabel9 = new JTextField();
		heightLabel9.setText("Ninth Layer");
		heightLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel9.setEditable(false);
		heightLabel9.setBounds(400, 580, 100, 20);
		window.getContentPane().add(heightLabel9);
		heightLabel9.setColumns(10);
		
		heightLabel10 = new JTextField();
		heightLabel10.setText("Tenth Layer");
		heightLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel10.setEditable(false);
		heightLabel10.setBounds(400, 605, 100, 20);
		window.getContentPane().add(heightLabel10);
		heightLabel10.setColumns(10);
		
		tableInput1 = new JTextField();
		tableInput1.setBounds(510, 380, 86, 20);
		window.getContentPane().add(tableInput1);
		tableInput1.setColumns(10);
		
		tableInput2 = new JTextField();
		tableInput2.setBounds(510, 405, 86, 20);
		window.getContentPane().add(tableInput2);
		tableInput2.setColumns(10);
		
		tableInput3 = new JTextField();
		tableInput3.setBounds(510, 430, 86, 20);
		window.getContentPane().add(tableInput3);
		tableInput3.setColumns(10);
		
		tableInput4 = new JTextField();
		tableInput4.setBounds(510, 455, 86, 20);
		window.getContentPane().add(tableInput4);
		tableInput4.setColumns(10);
		
		tableInput5 = new JTextField();
		tableInput5.setBounds(510, 480, 86, 20);
		window.getContentPane().add(tableInput5);
		tableInput5.setColumns(10);
		
		tableInput6 = new JTextField();
		tableInput6.setBounds(510, 505, 86, 20);
		window.getContentPane().add(tableInput6);
		tableInput6.setColumns(10);
		
		tableInput7 = new JTextField();
		tableInput7.setBounds(510, 530, 86, 20);
		window.getContentPane().add(tableInput7);
		tableInput7.setColumns(10);
		
		tableInput8 = new JTextField();
		tableInput8.setBounds(510, 555, 86, 20);
		window.getContentPane().add(tableInput8);
		tableInput8.setColumns(10);
		
		tableInput9 = new JTextField();
		tableInput9.setBounds(510, 580, 86, 20);
		window.getContentPane().add(tableInput9);
		tableInput9.setColumns(10);
		
		tableInput10 = new JTextField();
		tableInput10.setBounds(510, 605, 86, 20);
		window.getContentPane().add(tableInput10);
		tableInput10.setColumns(10);
		
		endgameFields = new JTextField();
		endgameFields.setFont(new Font("Tahoma", Font.PLAIN, 20));
		endgameFields.setText("Endgame Fields");
		endgameFields.setEditable(false);
		endgameFields.setBounds(750, 190, 300, 30);
		window.getContentPane().add(endgameFields);
		endgameFields.setColumns(10);
		
		foundationMove = new JTextField();
		foundationMove.setText("Foundation moved out of build zone?");
		foundationMove.setEditable(false);
		foundationMove.setBounds(750, 235, 200, 20);
		window.getContentPane().add(foundationMove);
		foundationMove.setColumns(10);
		
		String[] foundationOption = {"Nothing Selected", "Yes", "No", "Wasn't Originally Moved"};
		foundationSelection = new JComboBox(foundationOption);
		foundationSelection.setBounds(750, 260, 200, 20);
		window.getContentPane().add(foundationSelection);
		
		String[] endgameOption = {"Nothing Selected", "Yes", "No", "Wasn't Attempted"};
		foundationMoved = new JTextField();
		foundationMoved.setText("Was the skyscraper capped?");
		foundationMoved.setEditable(false);
		foundationMoved.setBounds(750, 295, 200, 20);
		window.getContentPane().add(foundationMoved);
		foundationMoved.setColumns(10);
		
		JComboBox capSelection = new JComboBox(endgameOption);
		capSelection.setBounds(750, 320, 200, 20);
		window.getContentPane().add(capSelection);
		
		buildZone = new JTextField();
		buildZone.setText("Parked in building zone?");
		buildZone.setEditable(false);
		buildZone.setBounds(750, 355, 200, 20);
		window.getContentPane().add(buildZone);
		buildZone.setColumns(10);
		
		parkSelection = new JComboBox(endgameOption);
		parkSelection.setBounds(750, 380, 200, 20);
		window.getContentPane().add(parkSelection);
		
		notesField = new JTextField();
		notesField.setText("Notes");
		notesField.setEditable(false);
		notesField.setBounds(750, 430, 50, 20);
		window.getContentPane().add(notesField);
		notesField.setColumns(10);
		
		TextArea notesOutput = new TextArea();
		notesOutput.setBounds(750, 455, 300, 100);
		window.getContentPane().add(notesOutput);
		
		JButton submitB = new JButton("Submit Data");
		submitB.setBounds(900, 600, 150, 40);
		window.getContentPane().add(submitB);
		
		teamNumberBox = new JTextField();
		teamNumberBox.setText("Team Number (5-digit integer)");
		teamNumberBox.setEditable(false);
		teamNumberBox.setBounds(400, 10, 200, 20);
		window.getContentPane().add(teamNumberBox);
		teamNumberBox.setColumns(10);
		
		numberBox = new JTextField();
		numberBox.setBounds(400, 35, 100, 20);
		window.getContentPane().add(numberBox);
		numberBox.setColumns(10);
		
		matchNumBox = new JTextField();
		matchNumBox.setText("Match Number");
		matchNumBox.setEditable(false);
		matchNumBox.setBounds(400, 70, 80, 20);
		window.getContentPane().add(matchNumBox);
		matchNumBox.setColumns(10);
		
		matchNumber = new JTextField();
		matchNumber.setBounds(400, 95, 80, 20);
		window.getContentPane().add(matchNumber);
		matchNumber.setColumns(10);
		
		allianceSelection = new JTextField();
		allianceSelection.setEditable(false);
		allianceSelection.setText("Alliance");
		allianceSelection.setBounds(510, 70, 80, 20);
		window.getContentPane().add(allianceSelection);
		allianceSelection.setColumns(10);
		
		allianceSelectionOutput = new JTextField();
		allianceSelectionOutput.setBounds(510, 95, 80, 20);
		window.getContentPane().add(allianceSelectionOutput);
		allianceSelectionOutput.setColumns(10);
		
		pageLabel = new JTextField();
		pageLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pageLabel.setText("MassScout Alliance");
		pageLabel.setEditable(false);
		pageLabel.setBounds(50, 10, 300, 50);
		window.getContentPane().add(pageLabel);
		pageLabel.setColumns(10);
		
		subLabel = new JTextField();
		subLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subLabel.setText("Data Entry Application");
		subLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		subLabel.setEditable(false);
		subLabel.setBounds(50, 70, 300, 35);
		window.getContentPane().add(subLabel);
		subLabel.setColumns(10);
		
		//Final render
		window.setVisible(true);
		
		//Setup for logic within loop
		int cycle1Index, cycle2Index, autoParkIndex, foundMoveIndex, endFoundMoveIndex, capIndex, endParkIndex;
		boolean executeCycle1Box = true, executeCycle2Box = true;
		
		//Action Listener and Holder
		SubmitAction submit = new SubmitAction("Submit");
		while(!submit.hasButtonBeenClicked())
		{
			submitB.addActionListener(submit);
			
			cycle1Index = cycle1Options.getSelectedIndex();
			cycle2Index = cycle1Options.getSelectedIndex();
			
			JTextField cycle1Instructions = new JTextField();
			cycle1Instructions.setBounds(50, 285, 200, 20);
			cycle1Instructions.setText("Cycle time (Seconds, rounded)");
			cycle1Instructions.setEditable(false);
			cycle1Instructions.setColumns(10);
			
			JTextField cycle1Time = new JTextField();
			cycle1Time.setBounds(50, 310, 80, 20);
			cycle1Time.setColumns(10);
			
			JTextField cycle2Instructions = new JTextField();
			cycle2Instructions.setBounds(50, 405, 200, 20);
			cycle2Instructions.setText("Cycle time (Seconds, rounded)");
			cycle2Instructions.setEditable(false);
			cycle2Instructions.setColumns(10);
			
			JTextField cycle2Time = new JTextField();
			cycle2Time.setBounds(50, 430, 80, 20);
			cycle2Time.setColumns(10);
			
			if(cycle1Index == 2)
			{
				if(executeCycle1Box)
				{
					
					window.getContentPane().add(cycle1Instructions);
					window.getContentPane().add(cycle1Time);
					
					executeCycle1Box = false;
				}
			}
			else
			{
				cycle1Instructions.setVisible(false);
				cycle1Time.setVisible(false);
				
				executeCycle1Box = true;
			}
			
			if(cycle2Index == 2)
			{
				if(executeCycle2Box)
				{
					window.getContentPane().add(cycle2Instructions);
					window.getContentPane().add(cycle2Time);
					
					executeCycle2Box = false;
				}
			}
		}
		
		//Sets up objects for writing data
		
		
		//Closes after everything is done
		window.dispose();
	}
}
