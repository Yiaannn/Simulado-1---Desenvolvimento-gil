package br.pro.hashi.ensino.desagil.lucianogic.view;


import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;

class LeverButton extends JCheckBox{
    
    
    public LeverButton(){
        super();
    }
    
    @Override
	public void paintComponent(Graphics g) {
	    // Evita bugs visuais em alguns sistemas operacionais.
		super.paintComponent(g);
		
	    int height= this.getHeight();
	    int width= this.getWidth();
	    
	    g.clearRect(0, 0, height, width);
	    g.setColor(Color.DARK_GRAY);
	    g.fillOval(height/4, height/2, height/2, height/2);
	    
	    if (!this.isSelected()){
	        g.drawLine(0, 0, width/2, 3*height/4);
	        g.drawLine(1, 0, width/2, 3*height/4);
        }else{
	        g.drawLine(width, 0, width/2, 3*height/4);
	        g.drawLine(width-1, 0, width/2-1, 3*height/4);
	    }
	    
		

		// Evita bugs visuais em alguns sistemas operacionais.
		getToolkit().sync();
    }
}
