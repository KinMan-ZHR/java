package designMode.structure.facade;

public class VideoPlayer {
    public void playVideo(String videoType, String fileName) {
        System.out.println("Playing " + videoType + " file: " + fileName);
    }
}
