import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{
	Draw draw;
	
	public Frame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		setResizable(false);
		setTitle("Draw");
		
		init();
	}

	public void init (){
		setLocationRelativeTo(null);
	}
}
//https://www.youtube.com/watch?v=hIexVBm1cag