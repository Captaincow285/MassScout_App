import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class ErrorPopup 
{
	private static JTextField errorMessage1;
	private static JTextField message2;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void errorMessage()
	{
		//Creates the window
		JFrame error = new JFrame();
		error.setSize(400, 200);
		error.setLocationRelativeTo(null);
		
		//Application Icon
		ImageIcon logo = new ImageIcon("C:\\Users\\Captaincow285\\git\\MassScout_App\\MassScout_App\\img\\Logo.png");
		error.setIconImage(logo.getImage());
		error.getContentPane().setLayout(null);
		
		//Textboxes for error message
		errorMessage1 = new JTextField();
		errorMessage1.setHorizontalAlignment(SwingConstants.CENTER);
		errorMessage1.setBounds(25, 50, 350, 20);
		errorMessage1.setText("Something went wrong. It could be because functionality");
		errorMessage1.setEditable(false);
		error.getContentPane().add(errorMessage1);
		errorMessage1.setColumns(10);
		message2 = new JTextField("for this option has not been implemented yet.");
		message2.setHorizontalAlignment(SwingConstants.CENTER);
		message2.setEditable(false);
		message2.setBounds(25, 70, 350, 20);
		error.getContentPane().add(message2);
		message2.setColumns(10);
		
		//Button and generic actionListener
		SubmitAction submitB = new SubmitAction("Submit");
		JButton closeButton = new JButton("Return to Application");
		closeButton.setBounds(100, 115, 200, 30);
		error.getContentPane().add(closeButton);
		
		//Render
		error.setVisible(true);
		
		//Again, hold method in place while button has not been pressed
		while(!submitB.hasButtonBeenClicked())
		{
			closeButton.addActionListener(submitB);
		}
		
		//Close and return to Main
		error.dispose();
	}
}
