package behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;


// A concrete colleague
public class BtnBook extends JButton implements Command 
{
	private static final long serialVersionUID = -7816955735025152624L;

	IMediator med;

	BtnBook(ActionListener al, IMediator m) 
	{
	 super("Book");
	 addActionListener(al);
	 med = m;
	 med.registerBook(this);
	}

	public void execute() 
	{
	 med.book();
	}
}
