package intro_to_array_lists;

import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton view = new JButton();
	String input;
	ArrayList<String> guestbook = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook lets = new GuestBook();
		lets.getStarted();
	}
	
	public void getStarted() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(view);
		add.setText("Add");
		view.setText("View");
		frame.add(panel);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source == add) {
			input = JOptionPane.showInputDialog("Enter a name to be added:");
			guestbook.add(input);
		}
		if (source == view) {
			String message = "";
			for (int i = 0; i < guestbook.size(); i++) {
				message += "Guest #" + (i + 1) + ": " + guestbook.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}
		
	}
}
