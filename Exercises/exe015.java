import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class exe015 {
    public static void main(String[] args){

        String filepath = "/home/joel-pereira/IdeaProjects/Java_exercises/retro.wav";
        File file = new File(filepath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio not supported");
        } catch (IOException | LineUnavailableException e) {
            System.out.println("Something went wrong");
        }

    }
}
