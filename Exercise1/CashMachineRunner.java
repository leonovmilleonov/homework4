package Exercise1;

public class CashMachineRunner {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10, 10, 10);
        if(!cashMachine.withdraw(900)){
            System.out.println("Not successful");
        }
        cashMachine.printState();
        if(!cashMachine.withdraw(600)){
            System.out.println("Not successful");
        }
        cashMachine.printState();
        cashMachine.depositMoney(0, 0, 10);
        cashMachine.printState();

    }
}
