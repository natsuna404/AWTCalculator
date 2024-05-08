package org.example;

import java.awt.*;
import java.awt.event.*;

public class CalTextField extends Label {
	
	private int m_posX;
	private int m_posY;
	private int m_width;
	private int m_height;
	
	
	
	public CalTextField(int posX, int posY, int width, int height){

		this.m_posX = posX;
		this.m_posY = posY;
		
		this.m_width = width;
		this.m_height = height;
		
		setBounds(m_posX, m_posY, m_width, m_height);
		
		setText("0");
		
		setAlignment(RIGHT);
		
		
		
		

	}
}
