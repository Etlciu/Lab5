import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab5 extends Lab4 implements ActionListener
{
	//private int numClicks = 0;
	int ind = cbb.getSelectedIndex();
	public void init()
	{
		super.init();
		addListeners();
		this.setSize(getPreferredSize());
	}

	@Override
	public void  actionPerformed(ActionEvent e)  {
//		numClicks++;
//		System.out.println(numClicks);
		if (ind == 1)
		{
			System.out.println(ind);
			createFrame();
			
		}else {
			
			
		}
		
	}
	public void addListeners() 
	{
		
	}
}
