import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.File;
import java.io.IOException;
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
	 * @throws IOException 
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings({ "unused" , "resource" })
	public void sheetUI()
	{
		//New window
		JFrame window = new JFrame();
		window.setSize(300, 200);
		window.getContentPane().setLayout(null);
		window.setLocationRelativeTo(null);
		
		//The entry field. Editable
		directEntry = new JTextField();
		directEntry.setBounds(25, 60, 250, 20);
		window.getContentPane().add(directEntry);
		directEntry.setColumns(10);
		
		//Instructions text fields
		instructions = new JTextField();
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setText("Enter the directory and name of the");
		instructions.setEditable(false);
		instructions.setBounds(40, 15, 220, 20);
		window.getContentPane().add(instructions);
		instructionsCont = new JTextField("sheet you wish to enter. .xls files only!");
		instructionsCont.setHorizontalAlignment(SwingConstants.CENTER);
		instructionsCont.setEditable(false);
		instructionsCont.setBounds(40, 35, 220, 20);
		window.getContentPane().add(instructionsCont);
		
		SubmitAction submit = new SubmitAction("Submit");
		
		//Submit button.... Obviously.
		submitB = new JButton("Submit");
		submitB.setBounds(100, 100, 100, 30);
		window.getContentPane().add(submitB);
		
		window.setVisible(true);
		
		//Again, hold method in place while button has not been pressed
		while(!submit.hasButtonBeenClicked())
		{
			submitB.addActionListener(submit);
		}
		
		//Converts textbox input to full Spreadsheet object
		String filePath = directEntry.getText();
		File sheetPath = new File(filePath);
		
		try
		{
			POIFSFileSystem POIPath = new POIFSFileSystem(sheetPath);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Closes window
		window.dispose();
	}
}
