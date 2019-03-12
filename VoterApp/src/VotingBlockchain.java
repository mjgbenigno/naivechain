import Blocks;

public class VotingBlockchain{
Crypto c;
Blocks b;

public LinkedList<Blocks> ledger = new LinkedList<Blocks>(); //this is a list that contains Blocks objects

    public VotingBlockChain(){
        c = new Crypto();
        //initialize chain
        b = new Blocks(); //should return a blocks object containing the genesis block
    }

    public void addBlockToChain(Blocks newBlock){

    }

    public void verifyLedger(){

    }

    public void verifyLedger(LinkedList ledger){

    }
}