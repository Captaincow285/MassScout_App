import org.apache.poi.ss.*;
import org.apache.poi.hssf.*;
import javafx.*;
import javax.swing.*;
import java.awt.*;
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
		
		//Sets image above dropdown
		JLabel picLogo = new JLabel((Icon) logo);
		picLogo.setBounds(250, 10, 100, 100);
		appSelection.getContentPane().add(picLogo);
		
		//Dropdown menu creation
		String[] dropdownText = {"Nothing Selected", "Enter a match into the database", "Create a new Spreadsheet", "Load Spreadsheet", "Analyze Data (WIP)", "Exit Application"};
		JComboBox option1 = new JComboBox(dropdownText);
		option1.setBounds(190, 120, 220, 40);
		appSelection.getContentPane().add(option1);
		
		//Action...?
		SubmitAction plhdr = new SubmitAction("Submit");
		
		//Submit Button
		JButton submitB = new JButton("Submit");
		submitB.setBounds(250, 180, 100, 30);
		appSelection.getContentPane().add(submitB);
		
		//Action Listener
		submitB.addActionListener(plhdr);
		
		//Final validate and set Visible
		appSelection.setVisible(true);
		
	}
}
