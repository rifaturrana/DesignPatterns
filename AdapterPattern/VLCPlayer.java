public class VLCPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
    
}
