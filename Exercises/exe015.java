import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exe015 {
    public static void main(String[] args) {

        String filepath = "/home/joel-pereira/IdeaProjects/Java_exercises/retro.wav";
        File file = new File(filepath);

        try (Scanner sc = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = " ";
            while (!response.equals("q")){
                System.out.println("P = play\nS = Stop\n");
                System.out.println("R = Reset\nQ = Quit");
                System.out.println("Enter your choice: ");
                response = sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not located");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio not supported");
        } catch (IOException | LineUnavailableException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Bye");
        }

    }
}
