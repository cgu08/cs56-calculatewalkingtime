import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;

public class ImagePanel {

    public static void main( String[] args){

	JFrame F =  new JFrame("UCSB MAP");
	JLabel content = new JLabel();
	ImageIcon image = new ImageIcon("/cs/student/mcaccamo/cs56/cs56-calculatewalkingtime/src/map.gif");
	content.setIcon(image);
	content.setLayout( new BorderLayout() ) ;
	F.setContentPane( content);
	  
	//	try{
	
	//	  F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/cs/student/mcaccamo/cs56/cs56-calculatewalkingtime/src/map.gif")))));
	//	}
	//catch( IOException e){
	// System.out.println("Image doesn't exist");
	//	}
	F.setResizable(false);
	JButton test = new JButton("TESTER");
	//	F.getContentPane().add(BorderLayout.SOUTH,test);
	F.add(content);

	F.setSize(860, 1050);
	F.setVisible(true);

	JPanel panel = new JPanel();
	F.add(panel);
	panel.add(test);
	
    }
}

					  
    
