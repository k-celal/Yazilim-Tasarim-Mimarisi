public class MediaPlayer {
    private static MediaPlayer mp;
    private MediaPlayer(){}
    public static MediaPlayer getInstance(){
        if(mp == null){
            mp = new MediaPlayer();
        }
        return mp;
    }
    public void onCreate(){}
    public void play(Kanal kanal){
        System.out.println(kanal.getKanalAdi() + " Playing...");
    }
    public void stop(Kanal kanal){
        System.out.println(kanal.getKanalAdi()+" Stopped.");
    }
}
