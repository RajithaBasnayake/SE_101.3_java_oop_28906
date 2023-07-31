
package com.mycompany.bankaccount;

public abstract class BAccount
{
    private int accountNumber;
    private float balance;
    
    public void setValues(int ano, float b)
    {
        ano=accountNumber;
        b=balance;
    }
    
    public int getAccNo()
    {
        return accountNumber;
    }
    public float getBalance()
    {
        return balance;
    }
    
   public abstract void calculateInterest();
}
