package quiz07_song;

public class Producer {

	private String name;

	
	public void produce(Singer singer, Song song) {
		singer.addSong(song);
	}
	
}
