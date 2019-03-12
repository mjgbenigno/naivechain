public class Blocks{
    public int index;
    public String previousHash, hash;
    public long timeStamp;
    public Object data;

    /**
     * Creates a block object with set parameters
     */
    public Blocks(int index, String previousHash, long timeStamp, Object data, String hash){
        this.index = index;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.data = data;
        this.hash = hash;
    }

    /**
     * When a empty constructor is called this creates a block object with a genesis block.
     */
    public Blocks(){
        return new Block(0, "0", 1465154705, "my genesis block!!", "816534932c2b7154836da6afc367695e6337db8a921823784c14378abed4f7d7");
    }

}