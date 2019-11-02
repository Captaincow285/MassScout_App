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
		ImageIcon icon = new ImageIcon("MassScout_App/img/Logo.png");
		//appSelection.setIconImage(icon);
		
		//Dropdown menu creation
		String[] dropdownText = {"Nothing Selected", "Enter a match into the database", "Create a new Spreadsheet", "Load Spreadsheet", "Analyze Data (WIP)", "Exit Application"};
		JComboBox option1 = new JComboBox(dropdownText);
		option1.setBounds(190, 120, 220, 40);
		appSelection.getContentPane().add(option1);
		
		//Submit Button
		JButton submit = new JButton("Submit");
		submit.setBounds(250, 180, 100, 30);
		appSelection.getContentPane().add(submit);
		
		//Final validate and set Visible
		appSelection.setVisible(true);
		
		//Check for button press
		
	}
}
