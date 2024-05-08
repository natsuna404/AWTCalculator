package org.example;

import java.awt.*;
import java.awt.event.*;


public class CalWindow extends Frame {
	
	private int m_width;
	private int m_height;
	
	public CalWindow(int width, int height){
		
		this.m_height = height;
		this.m_width = width;
		
		setLayout(null);
		
		// Sets the position and the width and height of the window
		setBounds(0, 0, m_width, m_height);
		
		// Makes sure that this window is visible
		setVisible(true);
		
		setTitle("Windows Calculator by friends Nanimow, Strawbellei, and SirfeedsAlot");
		
		
		// Window Event for this project
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// terminate the program when the window is close
//				System.exit(1); // We can do this too but for some reason this gives an error
				dispose();
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			
			}
		});
		
		
	}
}
