package StartPack;

public class Word {
    private String word;
    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long inclusion(char symbol) {
        return word.chars().filter(ch -> ch == symbol).count();
    }

    @Override
    public String toString() {
        return word;
    }
}
