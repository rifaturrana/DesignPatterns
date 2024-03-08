public class ProxyInternet implements Connection{

    @Override
    public void createConnection(String sender, String receiver) {
        Internet i = new Internet();
if(!receiver.equals("192.168.1.1")) {
System.out.println("Receiver unauthorized.");
return;
}
i.createConnection("192.168.0.1", "192.168.1.1");
    }
    
}