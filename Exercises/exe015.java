import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exe015 {
    public static void main(String[] args) {

        String filepath = "/home/joel-pereira/IdeaProjects/Java_exercises/retro.wav";
        File file = new File(filepath);

        try (Scanner sc = new Scanner(System.in)) {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

        } catch (FileNotFoundException e) {
            System.out.println("File not located");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio not supported");
        } catch (IOException | LineUnavailableException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Bye");

        }
        sc.close();
    }
}
