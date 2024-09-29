package Exercise1;

public class CashMachine {
    private int tenDollarBill;
    private int twentyDollarBill;
    private int fiftyDollarBill;
    private Integer amountOfMoney;

    public CashMachine(int tenDollarBill, int twentyDollarBill, int fiftyDollarBill) {
        this.tenDollarBill = tenDollarBill;
        this.twentyDollarBill = twentyDollarBill;
        this.fiftyDollarBill = fiftyDollarBill;
        amountOfMoney = tenDollarBill * 10 + twentyDollarBill * 20 + fiftyDollarBill * 50;
    }

    public void depositMoney(int tenDollarBill, int twentyDollarBill, int fiftyDollarBill) {
        this.tenDollarBill += tenDollarBill;
        this.twentyDollarBill += twentyDollarBill;
        this.fiftyDollarBill += fiftyDollarBill;
        amountOfMoney += tenDollarBill * 10 + twentyDollarBill * 20 + fiftyDollarBill * 50;
    }

    public boolean withdraw(int withdrawnMoney) {
        if (withdrawnMoney > amountOfMoney) {
            return false;
        }
        amountOfMoney -= withdrawnMoney;
        int fiftyBillsToWithdraw = withdrawFiftyBills(withdrawnMoney);
        fiftyDollarBill -= fiftyBillsToWithdraw;
        withdrawnMoney -= fiftyBillsToWithdraw * 50;
        int twentyBillsToWithdraw = withdrawTwentyBills(withdrawnMoney);
        twentyDollarBill -= twentyBillsToWithdraw;
        withdrawnMoney -= twentyBillsToWithdraw * 20;
        int tenDollarBillToWithdraw = withdrawTenBills(withdrawnMoney);
        tenDollarBill -= tenDollarBillToWithdraw;
        withdrawnMoney -= tenDollarBillToWithdraw * 10;
        System.out.printf("You get: \n%d 50-dollar Bills \n%d 20-dollar Bills\n%d 10-dollar Bills\n\n",
                fiftyBillsToWithdraw, twentyBillsToWithdraw, tenDollarBillToWithdraw);

        return withdrawnMoney == 0;  // if withdrawnMoney != 0 something went wrong
    }

    private int withdrawFiftyBills(int withdrawnMoney) {
        return Math.min(fiftyDollarBill, withdrawnMoney / 50);
    }

    private int withdrawTwentyBills(int withdrawnMoney) {
        return Math.min(twentyDollarBill, withdrawnMoney / 20);
    }

    private int withdrawTenBills(int withdrawnMoney) {
        return Math.min(tenDollarBill, withdrawnMoney / 10);
    }
    public void printState(){
        System.out.println("Current balance: " + amountOfMoney);
        System.out.printf("%d 50-dollar Bills \n%d 20-dollar Bills\n%d 10-dollar Bills\n\n",
                fiftyDollarBill, twentyDollarBill, tenDollarBill);
    }

}
