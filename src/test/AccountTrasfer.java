package test;

public class AccountTrasfer  {

    void withdraw (int amt) throws InvalidAmountEXcetion {
        if (amt > 10000){
            throw new InvalidAmountEXcetion();
        }
    }

}

class InvalidAmountEXcetion extends RuntimeException {

}
