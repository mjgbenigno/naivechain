import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class Crypto{

    public Crypto(){

    }

    public String getHashOfString(String data){
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}