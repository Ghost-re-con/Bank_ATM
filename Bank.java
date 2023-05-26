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
    
}
