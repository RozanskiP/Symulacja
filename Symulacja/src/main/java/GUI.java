import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sun.nio.fs.ExtendedOptions.InternalOption;

public class GUI {

	private JFrame frame;
	private JLabel PositionOfNiewolnik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JButton ButtonToNextRound = new JButton("Nowa Tura");
		ButtonToNextRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositionOfNiewolnik = new JLabel("Niewolnik");
				PositionOfNiewolnik.setBounds(192, 169, 146, 114);
				frame.getContentPane().add(PositionOfNiewolnik);
				
			}
		});
		ButtonToNextRound.setBounds(351, 204, 89, 23);
		frame.getContentPane().add(ButtonToNextRound);
		
		//PositionOfNiewolnik = new JLabel("Niewolnik");
		//PositionOfNiewolnik.setBounds(92, 69, 89, 33);
		//frame.getContentPane().add(PositionOfNiewolnik);
		frame.setBounds(100, 100, 502, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
