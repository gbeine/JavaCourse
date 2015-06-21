package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Cockpit extends javax.swing.JPanel {
	private static final long serialVersionUID = -8853780340827609184L;
	private JLabel speedLabel;
	private JSlider speedSlider;
	private JButton speedDecreaseButton;
	private JLabel directionLabel;
	private JSlider directionSlider;
	private JButton directionIncreaseButton;
	private JButton directionDecreaseButton;
	private JPanel mousePanel;
	private JTextField directionTextField;
	private JButton speedIncreaseButton;
	private JTextField speedTextField;

	/**
	* Auto-generated main method to display this
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new Cockpit());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public Cockpit() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(400, 432));
			this.setLayout(null);
			{
				speedLabel = new JLabel();
				this.add(speedLabel);
				speedLabel.setText("Speed:");
				speedLabel.setBounds(38, 55, 49, 20);
			}
			{
				speedSlider = new JSlider();
				this.add(speedSlider);
				speedSlider.setBounds(118, 87, 200, 16);
				speedSlider.setValue(0);
				speedSlider.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent evt) {
						speedSliderStateChanged(evt);
					}
				});
			}
			{
				speedTextField = new JTextField();
				this.add(speedTextField);
				speedTextField.setText("0");
				speedTextField.setBounds(200, 52, 39, 27);
				speedTextField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						speedTextFieldActionPerformed(evt);
					}
				});
			}
			{
				speedDecreaseButton = new JButton();
				this.add(speedDecreaseButton);
				speedDecreaseButton.setText("<<");
				speedDecreaseButton.setBounds(118, 52, 50, 27);
				speedDecreaseButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						speedDecreaseButtonMouseClicked(evt);
					}
				});
			}
			{
				speedIncreaseButton = new JButton();
				this.add(speedIncreaseButton);
				speedIncreaseButton.setText(">>");
				speedIncreaseButton.setBounds(269, 52, 49, 27);
				speedIncreaseButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						speedIncreaseButtonMouseClicked(evt);
					}
				});
			}
			{
				directionLabel = new JLabel();
				this.add(directionLabel);
				directionLabel.setText("Direction:");
				directionLabel.setBounds(18, 138, 69, 20);
			}
			{
				directionSlider = new JSlider();
				this.add(directionSlider);
				directionSlider.setBounds(118, 167, 200, 16);
				directionSlider.setMaximum(180);
				directionSlider.setMinimum(-180);
				directionSlider.setValue(0);
				directionSlider.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent evt) {
						directionSliderStateChanged(evt);
					}
				});
			}
			{
				directionTextField = new JTextField();
				this.add(directionTextField);
				directionTextField.setText("0");
				directionTextField.setBounds(200, 131, 39, 27);
				directionTextField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						directionTextFieldActionPerformed(evt);
					}
				});
			}
			{
				directionDecreaseButton = new JButton();
				this.add(directionDecreaseButton);
				directionDecreaseButton.setText("<<");
				directionDecreaseButton.setBounds(118, 131, 50, 27);
				directionDecreaseButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						directionDecreaseButtonMouseClicked(evt);
					}
				});
			}
			{
				directionIncreaseButton = new JButton();
				this.add(directionIncreaseButton);
				directionIncreaseButton.setText(">>");
				directionIncreaseButton.setBounds(269, 131, 49, 27);
				directionIncreaseButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						directionIncreaseButtonMouseClicked(evt);
					}
				});
			}
			{
				mousePanel = new JPanel();
				this.add(mousePanel);
				mousePanel.setBounds(87, 203, 200, 200);
				mousePanel.setBackground(new java.awt.Color(192,192,192));
				mousePanel.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseMoved(MouseEvent evt) {
						mousePanelMouseMoved(evt);
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void speedSliderStateChanged(ChangeEvent evt) {
		speedTextField.setText(Integer.toString(speedSlider.getValue()));
	}

	private void speedTextFieldActionPerformed(ActionEvent evt) {
		int val = Integer.parseInt( speedTextField.getText() );
		if ( val < 0 ) {
			val = 0;
		} else if ( val > 100 ) {
			val = 100;
		}
		speedSlider.setValue(val);
		speedTextField.setText(Integer.toString(val));
	}

	private void speedDecreaseButtonMouseClicked(MouseEvent evt) {
		speedSlider.setValue( speedSlider.getValue() - 5 );
	}

	private void speedIncreaseButtonMouseClicked(MouseEvent evt) {
		speedSlider.setValue( speedSlider.getValue() + 5 );
	}

	private void directionDecreaseButtonMouseClicked(MouseEvent evt) {
		directionSlider.setValue( directionSlider.getValue() - 5 );
	}

	private void directionIncreaseButtonMouseClicked(MouseEvent evt) {
		directionSlider.setValue( directionSlider.getValue() + 5 );
	}

	private void directionSliderStateChanged(ChangeEvent evt) {
		directionTextField.setText(Integer.toString(directionSlider.getValue()));
	}

	private void directionTextFieldActionPerformed(ActionEvent evt) {
		int val = Integer.parseInt( directionTextField.getText() );
		if ( val < -180 ) {
			val = -180;
		} else if ( val > 180 ) {
			val = 180;
		}
		directionSlider.setValue(val);
		directionTextField.setText(Integer.toString(val));
	}

	private void mousePanelMouseMoved(MouseEvent evt) {
		//System.out.println("mousePanel.mouseMoved, event="+evt);
		//TODO add your code for mousePanel.mouseMoved
		double x = evt.getX() - this.mousePanel.getWidth()/2;
		double y = (evt.getY() - this.mousePanel.getHeight()/2) * -1;
		double speed = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		speedSlider.setValue(new Double(speed).intValue());

		double phi = 0;
		if (y < 0) {
			if (x < 0) {
				phi = Math.asin(-x/speed) - Math.PI;
			} else {
				phi = Math.PI - Math.asin(x/speed);
			}
		} else {
			phi = Math.asin(x/speed);
		}
		directionSlider.setValue(new Double(Math.toDegrees(phi)).intValue());
	}

	public void addSpeedListener(final Sprite s) {
		speedSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent evt) {
				s.setSpeed(Cockpit.this.speedSlider.getValue());
			}
		});
	}

	public void addDirectionListener(final Sprite s) {
		directionSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent evt) {
				s.setDirection(Cockpit.this.directionSlider.getValue());
			}
		});
	}

}
