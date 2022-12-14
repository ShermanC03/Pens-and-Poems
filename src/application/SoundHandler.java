package application;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundHandler {

	
	public static void RunMusic(String path) {
		try {
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.loop(0);

		} catch(UnsupportedAudioFileException e){
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
	public static void Runpoem(String path) {
		try {
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.loop(0);

		} catch(UnsupportedAudioFileException e){
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
	public static void Runbutton(String path) {
		try {
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
		Clip clip = AudioSystem.getClip();
		clip.open(inputStream);
		clip.loop(0);

		} catch(UnsupportedAudioFileException e){
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}