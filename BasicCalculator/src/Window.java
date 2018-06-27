import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Window extends JFrame {

	private JButton[] numberbuttons = new JButton[10];
	private JButton[] operbuttons = new JButton[5];
	
	
	private JTextField result;
	
	private String display = "";
	
	public Window() {
		super("Calculate with Java!"); //inherit from JFrame class. Easier notation?
		
		//Make Panels and set layouts
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,3));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,1));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		
		JPanel p = new JPanel();
        p.setLayout(new GridLayout());
		
		p3.add(result = new JTextField(20));
		result.setHorizontalAlignment(JTextField.RIGHT); //Text starts from the right
		result.setEditable(false); //Cant type inside this text field
		result.setText(""); //Set the text upon program run to an empty string
		
		
		for (int i=0;i<numberbuttons.length;i++) {
			numberbuttons[i] = new JButton(Integer.toString(i));
			numberbuttons[i].setPreferredSize(new Dimension(50,50));
			p1.add(numberbuttons[i]);
		}
		
		//Add operations buttons

		final String[] OPS = {"+","-","x","/","ENTER"};
		
		for (int i = 0; i<OPS.length;i++) {
			operbuttons[i] = new JButton(OPS[i]);
			operbuttons[i].setPreferredSize(new Dimension(50,50));
			p2.add(operbuttons[i]);
		}
		
        p.add(p1, BorderLayout.SOUTH);
        p.add(p2, BorderLayout.EAST);
        p.add(p3, BorderLayout.NORTH);
        
        add(p);
        setContentPane(p);
        
        
        for (JButton button:numberbuttons) {
        		button.addActionListener(new PrintNumToDisplay(button.getText()));
        }
        
 
	} //End of Window method
	
	//Classes to handle the action listening.
	
	private class PrintNumToDisplay implements ActionListener {
		private String str;
		
		public PrintNumToDisplay(String str) {
			this.str = str;
		}
		public void actionPerformed(ActionEvent event) {
			display = result.getText();
			result.setText(display + str);

		}
	}
	
	

	
}//End of Window class
	
	
	

