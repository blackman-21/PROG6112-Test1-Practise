public class Recording {
    private String title;
    private String artist;
    private int playingTime; // in seconds

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    // Display the recording details
    public void displayRecording() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Playing Time: " + playingTime + " seconds");
    }
}
