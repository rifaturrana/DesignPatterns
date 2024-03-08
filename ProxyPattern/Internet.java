
public class Internet implements Connection{

    @Override
    public void createConnection(String sender, String receiver) {
        System.out.println("Connecting to " + receiver + " from " + sender);        
    }
    
}
