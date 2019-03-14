import Blocks;

public class VotingBlockchain{
private Crypto c;
private Blocks b;

private static LinkedList<Blocks> ledger = new LinkedList<Blocks>(); //this is a list that contains Blocks objects

    public VotingBlockChain(){
        c = new Crypto();
        //initialize chain
        b = new Blocks(); //should return a blocks object containing the genesis block
        ledger.add(0,b);
    }

    /**
     * Adds a new block to the ledger LinkedList
     */
    public void addBlockToChain(Blocks newBlock){
        
    }

    /**
     * Verify this ledger from beginning to end;
     */
    public void verifyLedger(){

    }

    /**
     * Verify a specific ledger
     */
    public void verifyLedger(LinkedList ledger){

    }

    public void verifyBlockInLedger(int blockIndex){
        Blocks previousBlock,blockToCheck;
        if (blockIndex == 0) {
            //check genesis block
            Blocks genesis = new Blocks();
            blockToCheck = ledger.get(0);

        } else if (blockIndex == 1){
            previousBlock = new Blocks();
            blockToCheck = ledger.get(1);
        } else {
            previousBlock = ledger.get(blockIndex - 1);
            blockToCheck = ledger.get(blockIndex);
        }

        //TODO
    }

    public LinkedList getLedger(){
        return ledger;
    }
}