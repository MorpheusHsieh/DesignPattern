package behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

// A concrete colleague
public class BtnView extends JButton implements Command 
{
	private static final long serialVersionUID = 1250241617517382758L;

	IMediator med;

	BtnView(ActionListener al, IMediator m) 
	{
	 super("View");
	 addActionListener(al);
	 med = m;
	 med.registerView(this);
	}

	public void execute() {
	 med.view();
	}
}
