import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class SubmitAction extends AbstractAction
{
	private boolean buttonClicked = false;
	
	public SubmitAction(String text)
	{
		super(text);
	}
	
	@Override
	public void actionPerformed(ActionEvent plhdr) 
	{
		buttonClicked = true;
	}
	
	public boolean hasButtonBeenClicked()
	{
		return buttonClicked;
	}
	
	public void setClickedFalse()
	{
		buttonClicked = false;
	}
}
