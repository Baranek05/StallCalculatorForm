package view;

import collections.AoACollection;
import collections.PlanesCollection;
import counting.CountStallSpeed;
import counting.ICountStallSpeed;
import data.AngleOfAttack;
import data.IPlane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.List;

public class stallCalculatorForm {
    private JPanel mainPanel;
    private JLabel modelPlaneLabel;
    private JComboBox chooseModelJComboBox;
    private JLabel AoALabel;
    private JComboBox chooseAoAJComboBox;
    private JLabel massLabel;
    private JTextField insertMassTextField;
    private JLabel resultLabel;
    private JTextField resultTextField;
    private JButton countButton;
    private JLabel roLabel;
    private JTextField roTextField;


    private PlanesCollection providerPlanes;
    private CountStallSpeed count;

    private static stallCalculatorForm form;
    private AoACollection providerAnglesOfAttack;

    public static void initRates(stallCalculatorForm frm)
    {
        frm.providerPlanes = new PlanesCollection();
        frm.providerAnglesOfAttack = new AoACollection();

        for (int i = 0; i < 7; i++)
            frm.providerPlanes.getPlane(i);
        for (int i = 0; i < 6; i++)
            frm.providerAnglesOfAttack.getCzmax(i);
        frm.count = new CountStallSpeed();

    }

    public static void initForm(stallCalculatorForm frm)
    {
        List<IPlane> pList = frm.providerPlanes.getPlanesList();
        List<AngleOfAttack> AoAList = frm.providerAnglesOfAttack.getAoAList();
        for (int i = 0; i < pList.size(); i++)
            frm.chooseModelJComboBox.addItem(pList.get(i));
        for (int j = 0; j < AoAList.size(); j++)
            frm.chooseAoAJComboBox.addItem(AoAList.get(j));

    }

    public stallCalculatorForm(){
        countButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valueMass, valueRo;
                String sValueMass = insertMassTextField.getText();
                String sValueRo = roTextField.getText();
                valueMass = Double.parseDouble(sValueMass);
                valueRo = Double.parseDouble(sValueRo);
                count = new CountStallSpeed();
                double result = count.countStallSpeed((IPlane)chooseModelJComboBox.getSelectedItem(), (AngleOfAttack)chooseAoAJComboBox.getSelectedItem(), valueMass, valueRo);
                resultTextField.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame mainFrame = new JFrame("Kalkulator prędkości przeciągnięcia samolotu");
        form = new stallCalculatorForm();
        mainFrame.setContentPane(form.mainPanel);
        initRates(form);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        initForm(form);
    }


}
