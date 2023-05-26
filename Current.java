package Bank;


public class Current{
    public float Balance = 1000000;

    public float WithdrawlC(float amount){
        Balance -= amount;
        return Balance;
    }

    public float DepositC(float amount){
        Balance += amount;
        return Balance;
    }

}
