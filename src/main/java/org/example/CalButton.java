package org.example;

import java.awt.*;
import java.awt.event.*;

public class CalButton extends Button {

	public int m_posX;
	public int m_posY;
	
	public final int m_width = 120;
	public final int m_height = 60;
	
	public CalButton(int posX, int posY, String label){
		this.m_posX = posX;
		this.m_posY = posY;
		
		
		setBounds(m_posX, m_posY, m_width, m_height);
		setLabel(label);
		
	}

}
