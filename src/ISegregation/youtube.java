package ISegregation;

public class youtube implements Films, Music{
    @Override
    public  void playVideo(){
        System.out.println("Video starts");
    }
    @Override
    public void playAudio(){
        System.out.println("Turn on the music");
    }
}
