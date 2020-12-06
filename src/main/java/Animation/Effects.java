package Animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;




public class Effects {
    Bandeau bandeau;
    List<Font> fonts = new LinkedList<>();
    List<Color> colors = new LinkedList<>();
    
    
    public Effects(){
        bandeau = new Bandeau();
        addFonts();
        addColors();
    }
    public void zoom(){
        Font baseFont = bandeau.getFont();    
        bandeau.setMessage("We will Zoom!");
	bandeau.sleep(2000);
	bandeau.setMessage("ZOOM...");
	for (int i = 0; i <= 100; i+=5)
        {            
		bandeau.setFont(new Font("Dialog", Font.BOLD, 10+i));
		bandeau.sleep(100);
        }
        bandeau.setFont(baseFont);
    }
    public void rotate(){
        Font baseFont = bandeau.getFont();
        bandeau.setMessage("Now we will Rotate!");
        bandeau.sleep(2000);
        bandeau.setMessage("Rotate!");
        for (int i = 0; i <= 20; i++){
            bandeau.setRotation(2*Math.PI*i / 20);
            bandeau.sleep(100);
        }
        bandeau.setFont(baseFont);
   
    }
    public void flashingText() {
        Font baseFont = bandeau.getFont();
        bandeau.setMessage("Now we will do Flashing Text");
        bandeau.sleep(2000);
        for (int i = 0; i <= 5; i++) {    
            bandeau.setMessage("FLASHING!");
            bandeau.sleep(300);
            bandeau.setMessage("");
            bandeau.sleep(300);
        }
        bandeau.setFont(baseFont);
    }
    
    private void addFonts(){
        fonts.add(new Font("Dialog", Font.BOLD, 20));
        fonts.add(new Font("SansSerif", Font.PLAIN, 20));
        fonts.add(new Font("Monospaced", Font.BOLD, 20));
        fonts.add(new Font("Serif", Font.PLAIN, 20));
    }
    public void changeFont(){
        Font baseFont = bandeau.getFont();
        bandeau.setMessage("We will Change Font!");
        bandeau.sleep(1000);
        bandeau.setMessage("Available Fonts...");
        for(int i = 0; i<fonts.size();i++){
            bandeau.setFont(fonts.get(i));
            bandeau.sleep(1000);
        }
        bandeau.setFont(baseFont);
    }   
    private void addColors(){
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);
        colors.add(Color.CYAN);
        colors.add(Color.GREEN);
        colors.add(Color.BLACK);
    }
    public void changeBackground(){
        Color baseColor = bandeau.getBackground();
        bandeau.setMessage("Change Background Color");
        for (int i=0;i< colors.size();i++){
        bandeau.sleep(1000);
        bandeau.setBackground(colors.get(i));
        }
        bandeau.setBackground(baseColor);	
    }
    public void changeForground(){
        Color baseColor = bandeau.getBackground();
        bandeau.setMessage("Change Forground Color");
        for(int i=0;i<colors.size();i++){
            bandeau.sleep(1000);
            bandeau.setForeground(colors.get(i)); 
        }
        bandeau.setBackground(baseColor);       
    }
    public void closeBandeau(){
        bandeau.setMessage("BYE");
        bandeau.sleep(2000);
	bandeau.close();
    }  
}
