
package com.mycompany.bankaccount;

public class BankAccount 
{

    public static void main(String[] args) 
    {
       SavingsAccount savingacc=new SavingsAccount();
       savingacc.setValues(45, 2000000 );
       savingacc.calculateInterest();
       
       CheckingAccount checkacc=new CheckingAccount();
       checkacc.setValues(78, 1000000);
       checkacc.calculateInterest();
    }
}
