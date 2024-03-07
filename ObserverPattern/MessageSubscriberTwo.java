
public class MessageSubscriberTwo implements Observer{

    @Override
    public void update(Message m) {
        // TODO Auto-generated method stub
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }

}
