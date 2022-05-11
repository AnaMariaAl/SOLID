package ISegregation;

public class Main {
    public static void main(String[] args) {
        youtube youtube1= new youtube();
        System.out.println("Actions for Youtube are: ");
        youtube1.playAudio();
        youtube1.playVideo();
        System.out.println(" ");

        SoundCloud soundCloud= new SoundCloud();
        System.out.println("Actions for SoundCloud are: ");
        soundCloud.playAudio();
        System.out.println(" ");

        HBOMax hboMax= new HBOMax();
        System.out.println("Actions for HBOMax are: ");
        hboMax.playVideo();
    }

}
