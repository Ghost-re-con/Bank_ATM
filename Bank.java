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

    
}
