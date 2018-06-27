import javax.swing.JFrame;

public class BasicCalculator {

	public static void main(String[] args) {
		//Construct gui window
		Window obj = new Window();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		obj.setSize(1000,500);
		obj.pack();
		obj.setVisible(true);
	}

}
