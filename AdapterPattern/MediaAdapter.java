public class MediaAdapter implements MediaPlayer {

     AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type,String fileName)
    {
        if(type.equalsIgnoreCase("vlc"))
        {
            advanceMediaPlayer = new VLCPlayer();
        }
        else if(type.equalsIgnoreCase("mp4"))
        {
            advanceMediaPlayer = new MP4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advanceMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4"))
        {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
    
}
