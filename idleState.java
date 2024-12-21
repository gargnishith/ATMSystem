package ATMMachine.ATMStates;
//package ATMMachine;
import ATMMachine.card;
import ATMMachine.ATM;

public class idleState extends ATMState {
    
    @Override
    public void insertCard(ATM atm){
       System.out.println("ok Card is there1!!!!!");
       atm.setState(new CashWithdrawlState());
    }

    public String stateName(){
        return "Idle State";
    }

}
