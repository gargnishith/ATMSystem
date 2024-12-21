package ATMMachine.ATMStates;

import ATMMachine.ATM;
import ATMMachine.card;

public abstract class ATMState {
    
    public void insertCard(ATM atm){

    }

    public void checkCash(){

    }
    
    public void releaseCash(){

    }

    public String stateName(){
        return "<> State";
    }
}

