import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.table.AbstractTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

 class Edit_cpu extends JFrame{
	 
	
	 
	 JTextField  nam, cor, bus;
	 JComboBox comboBox, comboBox1, comboBox2;
	 JButton button1, button2;
	    JButton ok,cancel;
	public Edit_cpu (String c){
		super("������ � �������� ������, �������� � ���������������");
		setLocation(500, 250);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Box mainBox = Box.createVerticalBox();

		 
	    Box box1 = Box.createHorizontalBox();
		JTextField b = new JTextField(c);
		//final JComboBox comboBox = new JComboBox(elements);
        b.setEditable(false);
		box1.add(b);
		//box1.add(comboBox); 
		box1.setBorder(new TitledBorder("Name"));
		
		Box box2 = Box.createHorizontalBox();
		final JTextField b1 = new JTextField(15);
		final JButton but= new JButton ("�������������");
		box2.add(b1);
		box2.add(but); 
		box2.setBorder(new TitledBorder("Cores"));
		
		Box box3 = Box.createHorizontalBox();
		final JTextField b2 = new JTextField(15);
		final JButton but1= new JButton ("�������������");
		box3.add(b2);
		box3.add(but1);
		box3.setBorder(new TitledBorder("Bus"));
		
		Box box4 = Box.createHorizontalBox();
		JButton button1 = new JButton("OK");
		JButton button2 = new JButton("������");
		box4.add(button1);
		box4.add(button2); 
		//box4.setBorder(new TitledBorder("Bus"));
		
		mainBox.add(box1);
		mainBox.add(box2);
		mainBox.add(box3);
		mainBox.add(box4);
		setContentPane(mainBox);
		pack();
		
		
		////////�������
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


 	                 ADD form3 = new ADD(b1.getText());
 	                 form3.setVisible(true);
                }
       });
        
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


 	                 Edit_bus form4 = new Edit_bus(b2.getText());
 	                 form4.setVisible(true);
                }
       });
        		
}

}

