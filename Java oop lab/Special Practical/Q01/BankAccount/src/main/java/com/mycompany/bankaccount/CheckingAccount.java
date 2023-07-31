
package com.mycompany.bankaccount;

public class CheckingAccount extends BAccount
{
    private static final double CHECKING_INTEREST_RATE=0.12;
    
     @Override
   
    public void calculateInterest()
    {
     double Interest= CHECKING_INTEREST_RATE*getBalance();
        System.out.println("Saving interest is: "+Interest);
    }
    
}
