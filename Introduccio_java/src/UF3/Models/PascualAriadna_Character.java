package UF3.Models;

public class PascualAriadna_Character {
    private String name;
    private int chapter;
    private int episode;
    private int year;
    private String note;

    // Constructor
    public PascualAriadna_Character(String name, int chapter, int episode, int year, String note) {
        this.name = name;
        this.chapter = chapter;
        this.episode = episode;
        this.year = year;
        this.note = note;
    }

    // Getters  iseters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Métode que imprimeix
    @Override
    public String toString() {
        return "Character: " + name +
                ", Chapter: " + chapter +
                ", Episode: " + episode +
                ", Year: " + year +
                ", Note: " + note;
    }
}
