
package za.ac.tut;

import java.awt.*;
import javafx.scene.layout.Border;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ApplicationGUIFrame extends JFrame{
    private JPanel mainPnl;
    private JPanel contactInfoPnl;
    private JPanel heading1Pnl;
    private JPanel cell;
    private JPanel workTelPnl;
    private JPanel homeTelPnl;
    private JPanel emailPnl;
    private JPanel verifyEmailPnl;
    
    private JPanel resInfoPnl;
    private JPanel applyForResPnl;
    private JPanel heading2Pnl;
    
    private JPanel disInfoPnl;
    private JPanel heading3Pnl;
    private JPanel disabilityPnl;
    
    private JPanel buttonPnl;
    
    private JLabel cellPhoneLbl;
    private JLabel workTelLbl;    
    private JLabel homeTelLbl;      
    private JLabel emailLbl;
    private JLabel verifyEmailLbl;
    private JLabel applyForResLbl;
    private JLabel disabilityLbl;
    
    private JLabel heading1;
    private JLabel heading2;
    private JLabel heading3;
            
    private JComboBox cellPhoneCB;
    private JTextField workTelTf;
    private JTextField homeTelTf;
    private JTextField emailTf;
    private JTextField verifyEmailTf;
    private JComboBox resCB;
    private JCheckBox disabilityCB;
    
    private JButton back;
    private JButton next;
            
    public ApplicationGUIFrame() {
        
        setLayout(new BorderLayout());
        setTitle("Application Form");
        setSize(800,500);
        setResizable(false);
        setBackground(Color.blue);
        //
        heading1Pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cell = new JPanel(new FlowLayout());
        workTelPnl = new JPanel(new FlowLayout());
        homeTelPnl = new JPanel(new FlowLayout());
        emailPnl = new JPanel(new FlowLayout());
        verifyEmailPnl = new JPanel(new FlowLayout());
        
        contactInfoPnl = new JPanel(new GridLayout(6, 1, 1, 1));
        contactInfoPnl.setBorder(new TitledBorder("Contact Information"));
        
        //
        heading2Pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        applyForResPnl = new JPanel(new FlowLayout());
        
        resInfoPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        resInfoPnl.setBorder(new TitledBorder("Residence Information"));
        
        //
        heading3Pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        disabilityPnl = new JPanel(new FlowLayout());
        
        disInfoPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        disInfoPnl.setBorder(new TitledBorder("Disability Information"));
        
        //
        back = new JButton("Back");
        next = new JButton("Next");
        buttonPnl = new JPanel(new FlowLayout());
        
        //
        cellPhoneLbl = new JLabel("Do you have a South African cellPhone Number?");
        workTelLbl = new JLabel("Work Telephone Number:");
        homeTelLbl = new JLabel("Home Telephone Number:");      
        emailLbl = new JLabel("Email:");
        verifyEmailLbl = new JLabel("Verify Email:");
        applyForResLbl = new JLabel("Do you want to apply for residence?");
        disabilityLbl = new JLabel("Do you have a disability or impairment?");
        heading1 = new JLabel("Please enter your contact information");
        heading1.setFont(new Font("Tahoma",Font.BOLD,11));
        heading2 = new JLabel("Please select whether you want to apply for residence");
        heading2.setFont(new Font("Tahoma",Font.BOLD,11));
        heading3 = new JLabel("Please indicate whether you have any disabilities");
        heading3.setFont(new Font("Tahoma",Font.BOLD,11));
        
        //
        cellPhoneCB = new JComboBox();
        cellPhoneCB.addItem("---Please Select---");
        cellPhoneCB.addItem("Yes");
        cellPhoneCB.addItem("No");
        workTelTf = new JTextField(10);
        homeTelTf = new JTextField(10);
        emailTf = new JTextField(40);
        verifyEmailTf = new JTextField(40);
        resCB = new JComboBox();
        resCB.addItem("---Please Select---");
        resCB.addItem("Yes");
        resCB.addItem("No");
        disabilityCB = new JCheckBox();
        
        
        //add componets to panels
        heading1Pnl.add(heading1);
        cell.add(cellPhoneLbl);
        cell.add(cellPhoneCB);
        workTelPnl.add(workTelLbl);
        workTelPnl.add(workTelTf);
        homeTelPnl.add(homeTelLbl);
        homeTelPnl.add(homeTelTf);
        emailPnl.add(emailLbl);
        emailPnl.add(emailTf);
        verifyEmailPnl.add(verifyEmailLbl);
        verifyEmailPnl.add(verifyEmailTf);
        
        contactInfoPnl.add(heading1Pnl);
        contactInfoPnl.add(cell);
        contactInfoPnl.add(workTelPnl);
        contactInfoPnl.add(homeTelPnl);
        contactInfoPnl.add(emailPnl);
        contactInfoPnl.add(verifyEmailPnl);
        
        
        heading2Pnl.add(heading2);
        applyForResPnl.add(applyForResLbl);
        applyForResPnl.add(resCB);
        
        resInfoPnl.add(heading2Pnl);
        resInfoPnl.add(applyForResPnl);
        
        heading3Pnl.add(heading3);
        disabilityPnl.add(disabilityLbl);
        disabilityPnl.add(disabilityCB);
        
        disInfoPnl.add(heading3Pnl);
        disInfoPnl.add(disabilityPnl);
        
        buttonPnl.add(back);
        buttonPnl.add(next);
        
        mainPnl = new JPanel(new BorderLayout());
        mainPnl.add(contactInfoPnl, BorderLayout.NORTH);
        mainPnl.add(resInfoPnl, BorderLayout.CENTER);
        mainPnl.add(disInfoPnl, BorderLayout.SOUTH);
        
        add(mainPnl,BorderLayout.CENTER);
        add(buttonPnl,BorderLayout.SOUTH);
        
        setVisible(true);        
        
    }
    
}
