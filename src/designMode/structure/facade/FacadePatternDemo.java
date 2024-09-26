package designMode.structure.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        // 客户端通过门面类播放音频文件
        mediaPlayer.playAudioFile("song.mp3");

        // 客户端通过门面类播放视频文件
        mediaPlayer.playVideoFile("movie.mp4");
    }
}