package designMode.structure.facade;

public class MediaPlayer {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;

    public MediaPlayer() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    public void playAudioFile(String fileName) {
        audioPlayer.playAudio("mp3", fileName);
    }

    public void playVideoFile(String fileName) {
        videoPlayer.playVideo("mp4", fileName);
    }
}