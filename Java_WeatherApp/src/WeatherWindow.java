import java.awt.*; //Abstract Window Toolkit (awt)
import javax.swing.*;
import java.util.ArrayList;

public class WeatherWindow {
	//Create JFrame
	public JFrame createWindow() {
		JFrame weatherframe = new JFrame("Weather Request!");
		weatherframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		weatherframe.setPreferredSize(new Dimension(512, 512));
		
		return weatherframe;
	}

	public void IncludeLabels(String ... args) {
	//Include the requested weather info
		
		JFrame weatherFrame = createWindow();
		JPanel weatherPanel = new JPanel(new BorderLayout());
		
		weatherPanel.setBackground(Color.CYAN); //set background color
		
	//Fill out a Labels array of JLabels
		ArrayList <JLabel> Labels = new ArrayList();
		for (String arg:args) {
			JLabel label = new JLabel(arg,SwingConstants.CENTER);
			Labels.add(label);
		}
		
	//Loop through and add to pane
		int start = 250;
		weatherPanel.setLayout(null);
		for (int i=0;i<Labels.size();i++) {
			weatherPanel.add(Labels.get(i));
			Labels.get(i).setLocation(160,250+i*25);
			Labels.get(i).setSize(200,20);
		}
		/*
		weatherPanel.add(Labels.get(0));
		weatherPanel.add(Labels.get(1));
		weatherPanel.add(Labels.get(2));
		weatherPanel.add(Labels.get(3));

		
		Labels.get(0).setLocation(160, 250);
		Labels.get(1).setLocation(160, 275);
		Labels.get(2).setLocation(160, 300);
		Labels.get(3).setLocation(160, 325);
		
		Labels.get(0).setSize(200,20);
		Labels.get(1).setSize(200,20);
		Labels.get(2).setSize(200,20);
		Labels.get(3).setSize(200,20);
		*/
		
		weatherFrame.getContentPane().add(weatherPanel);
		
		weatherFrame.setLocationRelativeTo(null);
		weatherFrame.pack();
		weatherFrame.setResizable(false);
		weatherFrame.setVisible(true);
	}
	
}
