package etapa3.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import etapa2.view.InputStranicaDialog.CancelAction;
import etapa2.view.InputStranicaDialog.OkAction;

public class InputSlotDialog extends JDialog  {
	private String brojSlotova1;
	
	
	private JButton okButton = new JButton("Ok")	;
	private JButton cancelButton = new JButton("Cancel");
	private JLabel brojSlotova = new JLabel("Broj slotova:");
	private JTextField textSlotovi = new JTextField();
	private boolean status;
	
	public InputSlotDialog() {
		// TODO Auto-generated constructor stub
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Unos slota");
		setSize(new Dimension(330,250));

		setLocationRelativeTo(null);
		okButton.setSize(new Dimension(20,20));
		okButton.addActionListener(new OkAction());
		cancelButton.setSize(new Dimension(20,20));
		cancelButton.addActionListener(new CancelAction());
		this.setLayout(new BorderLayout());
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.add(okButton);
		p.add(cancelButton);
		add(p,BorderLayout.SOUTH);
		Panel panelCenter = new Panel();
		panelCenter.setLayout(new BorderLayout());
		Panel plabele = new Panel();
		plabele.setLayout(new BoxLayout(plabele, BoxLayout.Y_AXIS));
		plabele.add(brojSlotova);
		panelCenter.add(plabele,BorderLayout.WEST);
		Panel PTextFields= new Panel();
		PTextFields.setLayout(new BoxLayout(PTextFields, BoxLayout.Y_AXIS));
		PTextFields.add(textSlotovi);
		panelCenter.add(PTextFields,BorderLayout.CENTER);
		add(panelCenter,BorderLayout.NORTH);
		
	}
	
	public class OkAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			brojSlotova1 = textSlotovi.getText();
			
			status = true;
			setVisible(false);
		}	
	}
	public class CancelAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			status = false;
			setVisible(false);
		}
		
	}

	public String getBrojSlotova1() {
		return brojSlotova1;
	}
	public void setBrojSlotova1(String brojSlotova1) {
		this.brojSlotova1 = brojSlotova1;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
