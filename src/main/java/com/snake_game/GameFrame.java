package com.snake_game;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	public GameFrame() throws HeadlessException {
		super();
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack() ; 
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}	
	
	

}
