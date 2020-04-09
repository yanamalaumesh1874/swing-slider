import javax.swing.*;  
public class slider extends JFrame{  
public slider()
{  
JSlider slider = new JSlider(JSlider.VERTICAL,0,50, 25);  
slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
slider.setPaintTicks(true);  
slider.setPaintLabels(true);    
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
public static void main(String s[])
{  
slider frame=new slider();  
frame.pack();  
frame.setVisible(true);  
}  
}  
