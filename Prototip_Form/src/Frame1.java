
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Frame1 {


	public static void main(String[] args) {

					Frame window = new Frame();
					window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

	class Frame extends JFrame{

		public Frame() {
		JFrame frame = new JFrame();
		frame.setSize(450, 250);
        frame.setLocation(100, 100);
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
		//frame.getContentPane().setLayout(null);
        Default def = new Default();
        frame.addWindowListener(def);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 6, 200, 100);
		frame.getContentPane().add(panel);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"ModEAS System"));
		panel.setLayout(null);
		
		 String[] elements = new String[] {"CPU 1", "CPU 2", "CPU 3"};
		 
        final JComboBox comboBox = new JComboBox(elements);
        
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboBox.setBounds(149, 31, 111, 39);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        //comboBox.addActionListener(actionListener);
        panel.add(comboBox);
        
        JButton button = new JButton("��������");
        button.setBounds(10, 104, 105, 23);
        panel.add(button);
        
        JButton button_1 = new JButton("�������������");
        button_1.setBounds(125, 104, 158, 23);
        panel.add(button_1);
        
        JButton button_2 = new JButton("�������");
        button_2.setBounds(293, 104, 89, 23);
        panel.add(button_2);
        
        //������ ��� ��������
        JButton button_3 = new JButton("������ �� ...1");
        button_3.setBounds(10, 160, 200, 23);
        panel.add(button_3);
        
        JButton button_4 = new JButton("������ �� ...2");
        button_4.setBounds(220, 160, 200, 23);
        panel.add(button_4);

		
		//////////////�������
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String Design = comboBox.getSelectedItem().toString();
                 if (Design!=null){
                 Edit_cpu form2 = new Edit_cpu(Design);
                 form2.setVisible(true);
                             }
            }
       });
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                 ADD_cpu form2 = new ADD_cpu();
                 form2.setVisible(true);
                         }
       });
        
              
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		 }



class Default implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Object[] options = {"��", "���!"};
        int n = JOptionPane
                .showOptionDialog(e.getWindow(), "������� ���������?",
                        "�������������", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options,
                        options[0]);
        if (n == 0) {
            int i = JOptionPane
                    .showOptionDialog(e.getWindow(), "��������� ������?",
                            "�������������", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options,
                            options[0]);
        }
        e.getWindow().setVisible(false);
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
	}
