package org.example;

import java.awt.*;
import java.awt.event.*;


public class CalWindow extends Frame {
	
	
	public CalWindow(){
		
		
		setLayout(null);
		
		// Sets the position and the width and height of the window
		setBounds(300, 300, 1280, 720);
		
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
