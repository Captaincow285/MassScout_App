import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LoadSheet 
{
	private JTextField textField;
	private JTextField directEntry;
	private JTextField instructions;
	private JTextField instructionsCont;
	private JButton submitB;
	
	public LoadSheet()
	{
		
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void sheetUI()
	{
		//New window
		JFrame plhdr = new JFrame();
		plhdr.setSize(300, 200);
		plhdr.getContentPane().setLayout(null);
		plhdr.setLocationRelativeTo(null);
		
		//The entry field. Editable
		directEntry = new JTextField();
		directEntry.setBounds(50, 60, 200, 20);
		plhdr.getContentPane().add(directEntry);
		directEntry.setColumns(10);
		
		//Instructions text fields
		instructions = new JTextField();
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setText("Enter the directory of the spreadsheet");
		instructions.setEditable(false);
		instructions.setBounds(40, 15, 220, 20);
		plhdr.getContentPane().add(instructions);
		instructionsCont = new JTextField("you wish to enter. .xls files only!");
		instructionsCont.setHorizontalAlignment(SwingConstants.CENTER);
		instructionsCont.setEditable(false);
		instructionsCont.setBounds(40, 35, 220, 20);
		plhdr.getContentPane().add(instructionsCont);
		
		SubmitAction submit = new SubmitAction("Submit");
		
		//Submit button.... Obviously.
		submitB = new JButton("Submit");
		submitB.setBounds(100, 100, 100, 30);
		plhdr.getContentPane().add(submitB);
		
		plhdr.setVisible(true);
		
		//Again, hold method in place while button has not been pressed
		while(!submit.hasButtonBeenClicked())
		{
			submitB.addActionListener(submit);
		}
		
		
	}
}
