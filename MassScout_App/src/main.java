import org.apache.poi.ss.*;
import org.apache.poi.hssf.*;
import javafx.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.File.*;
@SuppressWarnings("unused")

public class main {

	public static void main(String[] args)
	{
		
		//Create Window (Using absolute layout)
		JFrame appSelection = new JFrame();
		appSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appSelection.setSize(600, 300);
		appSelection.getContentPane().setLayout(null);
		appSelection.setLocationRelativeTo(null);
		
		//Application Icon
		ImageIcon logo = new ImageIcon("C:\\Users\\Captaincow285\\git\\MassScout_App\\MassScout_App\\img\\Logo.png");
		appSelection.setIconImage(logo.getImage());
		
		//Dropdown menu creation
		String[] dropdownText = {"Nothing Selected", "Enter a match into the database", "Create a new Spreadsheet", "Load Spreadsheet", "Analyze Data (WIP)", "Exit Application"};
		JComboBox option1 = new JComboBox(dropdownText);
		option1.setBounds(190, 120, 220, 40);
		appSelection.getContentPane().add(option1);
		
		//Action...?
		SubmitAction submit = new SubmitAction("Submit");
		
		//Submit Button
		JButton submitB = new JButton("Submit");
		submitB.setBounds(250, 180, 100, 30);
		appSelection.getContentPane().add(submitB);
		
		//Final validate and set Visible
		appSelection.setVisible(true);
		
		//Creates stuff for the coming loop
		String filePath;
		
		while(true)
		{
			//Holds application in place before button is pressed
			while(!submit.hasButtonBeenClicked())
			{
				submitB.addActionListener(submit);
			}
			
			//Resets the button
			submit.setClickedFalse();
			
			//Checks for Index
			int dropdownIndex = option1.getSelectedIndex();
			appSelection.setVisible(false);
			
			if(submit.hasButtonBeenClicked())
			{
				//Picks index items
				if(dropdownIndex == 0)
				{
					
				}
				else if(dropdownIndex == 1)
				{
					ErrorPopup.errorMessage();
				}
				else if(dropdownIndex == 2)
				{
					ErrorPopup.errorMessage();
				}
				else if(dropdownIndex == 3)
				{
					//Loads chosen spreadsheet
					LoadSheet loading = new LoadSheet();
					filePath = loading.sheetUI();
					loading.makeSheet(filePath);
					
					//Adds a textfield listing the sheet chosen
					JLabel sheetName = new JLabel(filePath);
					sheetName.setBounds(150, 80, 300, 30);
					appSelection.getContentPane().add(sheetName);
				}
				else if(dropdownIndex == 4)
				{
					ErrorPopup.errorMessage();
				}
				else if(dropdownIndex == 5)
				{
					appSelection.dispatchEvent(new WindowEvent(appSelection, WindowEvent.WINDOW_CLOSING));
				}
			}
			
			appSelection.setVisible(true);
			
			
		}
	}
}
