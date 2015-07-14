package sef.module14.activity;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	JSlider slider;
	JSlider slider_1;
	JSlider slider_2;
	JSpinner spinner1;
	JSpinner spinner2;
	JSpinner spinner3;

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

	
	
	public void changeSlider(JLabel label,JPanel panel,JSpinner spinner,JSlider slider){
		int value = slider.getValue();
		label.setText(Integer.toString(value));
		panel.setBackground(new Color(this.slider.getValue(), slider_1.getValue(), slider_2.getValue()));
		spinner.setValue((Object)new Integer(value));
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(312, 11, 34, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(312, 45, 34, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(312, 79, 34, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 215, 434, 47);
		frame.getContentPane().add(panel);
		
		JLabel lblResult = new JLabel("Result");
		panel.add(lblResult);
		
		slider = new JSlider();
		slider.setMaximum(255);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				changeSlider(lblNewLabel,panel,spinner1,slider);
				//
			}
		});
		slider.setBounds(10, 11, 200, 23);
		frame.getContentPane().add(slider);
		
		slider_1 = new JSlider();
		slider_1.setMaximum(255);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				changeSlider(lblNewLabel_1,panel,spinner2,slider_1);
			} 
		});
		slider_1.setBounds(10, 45, 200, 23);
		frame.getContentPane().add(slider_1);
		
		
		slider_2 = new JSlider();
		slider_2.setMaximum(255);
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				changeSlider(lblNewLabel_2,panel,spinner3,slider_2);
			}
		});
		slider_2.setBounds(10, 79, 200, 23);
		frame.getContentPane().add(slider_2);
		
		spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider.setValue((Integer)spinner1.getValue());
			}
		});
		spinner1.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spinner1.setBounds(356, 8, 47, 20);
		frame.getContentPane().add(spinner1);
		
		spinner2 = new JSpinner();
		spinner2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_1.setValue((Integer)spinner2.getValue());
			}
		});
		spinner2.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spinner2.setBounds(356, 42, 47, 20);
		frame.getContentPane().add(spinner2);
		
		spinner3 = new JSpinner();
		spinner3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_2.setValue((Integer)spinner3.getValue());
			}
		});
		spinner3.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spinner3.setBounds(356, 76, 47, 20);
		frame.getContentPane().add(spinner3);
		
		JLabel lblNewLabel_3 = new JLabel("Red value:");
		lblNewLabel_3.setBounds(220, 11, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Green value:");
		lblNewLabel_4.setBounds(220, 45, 82, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Blue value:");
		lblNewLabel_5.setBounds(220, 79, 66, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}
