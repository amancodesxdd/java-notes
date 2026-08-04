import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class CompleteAudioPlayer {
    public static void main(String[] args) {
        // Get file from user or use default
        String filePath = "audiofile1.wav";  // Change this to your file
        
        playSound(filePath);
    }
    
    public static void playSound(String filePath) {
        try {
            File audioFile = new File(filePath);
            
            // Check if file exists
            if (!audioFile.exists()) {
                System.out.println("❌ File not found: " + filePath);
                System.out.println("📁 Looking in: " + System.getProperty("user.dir"));
                return;
            }
            
            // Get audio input stream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            // Create and open clip
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            // Play audio
            System.out.println("▶️ Playing: " + audioFile.getName());
            clip.start();
            
            // Wait for audio to finish
            while (clip.isRunning()) {
                Thread.sleep(100);
            }
            
            clip.close();
            System.out.println("✅ Playback finished!");
            
        } catch (UnsupportedAudioFileException e) {
            System.out.println("❌ Audio format not supported!");
            System.out.println("Supported formats: WAV, AU, AIFF");
        } catch (LineUnavailableException e) {
            System.out.println("❌ Audio system unavailable!");
        } catch (IOException e) {
            System.out.println("❌ Error reading file!");
        } catch (InterruptedException e) {
            System.out.println("❌ Playback was interrupted!");
        }
    }
}