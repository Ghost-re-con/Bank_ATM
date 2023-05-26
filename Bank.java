package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Bank implements ActionListener {
    String pinValue = "5555";
    Savings savingsAccount = new Savings();
    Current currentAccount = new Current();

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome to X Bank");
    JLabel EnterPin = new JLabel("Enter pin");
    JTextField pin = new JTextField();
    JButton login = new JButton("Login");
    
    JFrame ChooseAcctType = new JFrame();
    JLabel chooseAcctType = new JLabel("Choose Account Type");
    JButton savings = new JButton("Savings");
    JButton current = new JButton("Current");

    JFrame chooseSavings = new JFrame();
    JLabel whatDoYouWant = new JLabel("What do you want ?");
    JButton depositSavings = new JButton("Deposit");
    JButton withdrawlSavings = new JButton("Withdrawl");

    JFrame chooseCurrent = new JFrame();
    JLabel WhatDoYouWant = new JLabel("What do you want ?");
    JButton depositCurrent = new JButton("Deposit");
    JButton withdrawlCurrent = new JButton("Withdrawl");

    JFrame DepositAmountSavings = new JFrame();
    JLabel enterDepositSavingsAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositSavingsLabel = new JLabel("Amount");
    JTextField amountDepositSavings = new JTextField();
    JButton depositSavingsButton = new JButton("Deposit");

    JFrame WithdrawlAmountSavings = new JFrame();
    JLabel enterWithdrawlSavingsAmountLabel = new JLabel("Enter withdrawl amount");
    JLabel amountWithdrawlSavingsLabel = new JLabel("Amount");
    JTextField amountWithdrawlSavings = new JTextField();
    JButton withdrawlSavingsButton = new JButton("Withdrawl");

    JFrame DepositAmountCurrent = new JFrame();
    JLabel enterDepositCurrentAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositCurrentLabel = new JLabel("Amount");
    JTextField amountDepositCurrent = new JTextField();
    JButton depositCurrentButton = new JButton("Deposit");

    JFrame WithdrawlAmountCurrent = new JFrame();
    JLabel enterWithdrawlCurrentAmountLabel = new JLabel("Enter withdrawl amount");
    JLabel amountWithdrawlCurrentLabel = new JLabel("Amount");
    JTextField amountWithdrawlCurrent = new JTextField();
    JButton withdrawlCurrentButton = new JButton("Withdrawl");


    Bank(){

       label.setFont(new Font("Consolas",Font.BOLD,20));
       label.setBounds(45,10,250,40);

       EnterPin.setFont(new Font("Consolas",Font.PLAIN,18));
       EnterPin.setBounds(45,50,250,40);

       pin.setFont(new Font("Consolas",Font.PLAIN,18));
       pin.setBounds(45,80,250,40);

       login.setFont(new Font("Consolas",Font.BOLD,18));
       login.setFocusable(false);
       login.setBounds(70,140,140,40);
       login.addActionListener(this);


       frame.setSize(400,400);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.add(label);
       frame.add(EnterPin);
       frame.add(pin);
       frame.add(login);
    }

    public void ChooseAccTypeWindow(){

        chooseAcctType.setFont(new Font("Consolas",Font.BOLD,20));
        chooseAcctType.setBounds(70,20,250,40);

        savings.setFont(new Font("Consolas",Font.BOLD,20));
        savings.setFocusable(false);
        savings.setBounds(10,140,150,40);
        savings.addActionListener(this);

        current.setFont(new Font("Consolas",Font.BOLD,20));
        current.setFocusable(false);
        current.setBounds(200,140,150,40);
        current.addActionListener(this);


        ChooseAcctType.setSize(400,400);
        ChooseAcctType.setVisible(true);
        ChooseAcctType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChooseAcctType.setLayout(null);
        ChooseAcctType.add(chooseAcctType);
        ChooseAcctType.add(savings);
        ChooseAcctType.add(current);
    }

    public void ChooseSavingsWindow(){
        whatDoYouWant.setFont(new Font("Consolas",Font.BOLD,20));
        whatDoYouWant.setBounds(70,20,250,40);

        depositSavings.setFont(new Font("Consolas",Font.BOLD,20));
        depositSavings.setFocusable(false);
        depositSavings.setBounds(70,100,150,40);
        depositSavings.addActionListener(this);

        withdrawlSavings.setFont(new Font("Consolas",Font.BOLD,20));
        withdrawlSavings.setFocusable(false);
        withdrawlSavings.setBounds(70,180,150,40);
        withdrawlSavings.addActionListener(this);

        chooseSavings.setSize(400,400);
        chooseSavings.setVisible(true);
        chooseSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseSavings.setLayout(null);
        chooseSavings.add(whatDoYouWant);
        chooseSavings.add(depositSavings);
        chooseSavings.add(withdrawlSavings);

    }

    public void ChooseCurrentWindow(){
        WhatDoYouWant.setFont(new Font("Consolas",Font.BOLD,20));
        WhatDoYouWant.setBounds(70,20,250,40);

        depositCurrent.setFont(new Font("Consolas",Font.BOLD,20));
        depositCurrent.setFocusable(false);
        depositCurrent.setBounds(70,100,150,40);
        depositCurrent.addActionListener(this);

        withdrawlCurrent.setFont(new Font("Consolas",Font.BOLD,20));
        withdrawlCurrent.setFocusable(false);
        withdrawlCurrent.setBounds(70,180,150,40);
        withdrawlCurrent.addActionListener(this);

        chooseCurrent.setSize(400,400);
        chooseCurrent.setVisible(true);
        chooseCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseCurrent.setLayout(null);
        chooseCurrent.add(WhatDoYouWant);
        chooseCurrent.add(depositCurrent);
        chooseCurrent.add(withdrawlCurrent);

    }

    public void DepositSavingsWindow() {

        enterDepositSavingsAmountLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        enterDepositSavingsAmountLabel.setBounds(45, 10, 250, 40);

        amountDepositSavingsLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountDepositSavingsLabel.setBounds(45, 50, 250, 40);

        amountDepositSavings.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountDepositSavings.setBounds(45, 80, 250, 40);

        depositSavingsButton.setFont(new Font("Consolas", Font.BOLD, 18));
        depositSavingsButton.setFocusable(false);
        depositSavingsButton.setBounds(70, 140, 140, 40);
        depositSavingsButton.addActionListener(this);

        DepositAmountSavings.setSize(400, 400);
        DepositAmountSavings.setVisible(true);
        DepositAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepositAmountSavings.setLayout(null);
        DepositAmountSavings.add(enterDepositSavingsAmountLabel);
        DepositAmountSavings.add(amountDepositSavingsLabel);
        DepositAmountSavings.add(amountDepositSavings);
        DepositAmountSavings.add(depositSavingsButton);
    }

    public void WithdrawlSavingsWindow() {

        enterWithdrawlSavingsAmountLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        enterWithdrawlSavingsAmountLabel.setBounds(45, 10, 250, 40);

        amountWithdrawlSavingsLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountWithdrawlSavingsLabel.setBounds(45, 50, 250, 40);

        amountWithdrawlSavings.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountWithdrawlSavings.setBounds(45, 80, 250, 40);

        withdrawlSavingsButton.setFont(new Font("Consolas", Font.BOLD, 18));
        withdrawlSavingsButton.setFocusable(false);
        withdrawlSavingsButton.setBounds(70, 140, 140, 40);
        withdrawlSavingsButton.addActionListener(this);

        WithdrawlAmountSavings.setSize(400, 400);
        WithdrawlAmountSavings.setVisible(true);
        WithdrawlAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithdrawlAmountSavings.setLayout(null);
        WithdrawlAmountSavings.add(enterWithdrawlSavingsAmountLabel);
        WithdrawlAmountSavings.add(amountWithdrawlSavings);
        WithdrawlAmountSavings.add(amountWithdrawlSavings);
        WithdrawlAmountSavings.add(withdrawlSavingsButton);
    }

    public void DepositCurrentWindow() {

        enterDepositCurrentAmountLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        enterDepositCurrentAmountLabel.setBounds(45, 10, 250, 40);

        amountDepositCurrentLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountDepositCurrent.setBounds(45, 50, 250, 40);

        amountDepositCurrent.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountDepositCurrent.setBounds(45, 80, 250, 40);

        depositCurrentButton.setFont(new Font("Consolas", Font.BOLD, 18));
        depositCurrentButton.setFocusable(false);
        depositCurrentButton.setBounds(70, 140, 140, 40);
        depositCurrentButton.addActionListener(this);

        DepositAmountCurrent.setSize(400, 400);
        DepositAmountCurrent.setVisible(true);
        DepositAmountCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepositAmountCurrent.setLayout(null);
        DepositAmountCurrent.add(enterDepositCurrentAmountLabel);
        DepositAmountCurrent.add(amountDepositCurrentLabel);
        DepositAmountCurrent.add(amountDepositCurrent);
        DepositAmountCurrent.add(depositCurrentButton);
    }

    public void WithdrawlCurrentWindow() {

        enterWithdrawlCurrentAmountLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        enterWithdrawlCurrentAmountLabel.setBounds(45, 10, 250, 40);

        amountWithdrawlCurrentLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountWithdrawlCurrentLabel.setBounds(45, 50, 250, 40);

        amountWithdrawlCurrent.setFont(new Font("Consolas", Font.PLAIN, 18));
        amountWithdrawlCurrent.setBounds(45, 80, 250, 40);

        withdrawlCurrentButton.setFont(new Font("Consolas", Font.BOLD, 18));
        withdrawlCurrentButton.setFocusable(false);
        withdrawlCurrentButton.setBounds(70, 140, 140, 40);
        withdrawlCurrentButton.addActionListener(this);

        WithdrawlAmountCurrent.setSize(400, 400);
        WithdrawlAmountCurrent.setVisible(true);
        WithdrawlAmountCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithdrawlAmountCurrent.setLayout(null);
        WithdrawlAmountCurrent.add(enterWithdrawlCurrentAmountLabel);
        WithdrawlAmountCurrent.add(amountWithdrawlCurrent);
        WithdrawlAmountCurrent.add(amountWithdrawlCurrent);
        WithdrawlAmountCurrent.add(withdrawlCurrentButton);
    }


    public  void depositSavingsFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("SavingFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.DepositS(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void withdrawlSavingsFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("SavingFile.txt");
            if(savingsAccount.WithdrawlS(amount) == 0){
                JOptionPane.showMessageDialog(null,"Cannot withdrawl over 20,000","Deposit too high",JOptionPane.ERROR_MESSAGE);
            }else{
                fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.WithdrawlS(amount));
                JOptionPane.showMessageDialog(null,"Transaction Complete");
            }
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void depositCurrentFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("CurrentFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+currentAccount.DepositC(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void withdrawlCurrentFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("CurrentFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.DepositC(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == login){
            if(pin.getText().equals(pinValue)){
                ChooseAccTypeWindow();
                frame.dispose();
            }else{JOptionPane.showMessageDialog(null,"Pin is incorrect","Incorrect pin",JOptionPane.ERROR_MESSAGE);}
        }else if(e.getSource() == savings) {
            ChooseSavingsWindow();
            ChooseAcctType.dispose();
        }else if(e.getSource() == current){
            ChooseCurrentWindow();
            ChooseAcctType.dispose();
        }else if(e.getSource() == depositSavings) {
            DepositSavingsWindow();
            chooseSavings.dispose();
        }else if(e.getSource() == withdrawlSavings) {
            WithdrawlSavingsWindow();
            chooseSavings.dispose();
        } else if (e.getSource() == depositCurrent) {
            DepositCurrentWindow();
            chooseCurrent.dispose();
    } else if (e.getSource() == withdrawlCurrent) {
            WithdrawlCurrentWindow();
            chooseCurrent.dispose();
        } else if (e.getSource() == depositSavingsButton) {
            try{depositSavingsFile(Float.parseFloat(amountDepositSavings.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }else if (e.getSource() == withdrawlSavingsButton) {
            try{withdrawlSavingsFile(Float.parseFloat(amountWithdrawlSavings.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }else if(e.getSource() == depositCurrentButton){
            try{depositCurrentFile(Float.parseFloat(amountDepositCurrent.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        } else if (e.getSource() == withdrawlCurrentButton) {
            try{withdrawlCurrentFile(Float.parseFloat(amountWithdrawlCurrent.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }
    }
}
