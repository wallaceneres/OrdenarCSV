import java.util.ArrayList;

public class Item
{

    private String game;
    private String classification;
    private String score;

    public Item(String game, String classification, String score)
    {
        this.game = game;
        this.classification = classification;
        this.score = score;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setItens(Item[] itens) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Item{" +
                "game='" + game + '\'' +
                ", classification='" + classification + '\'' +
                ", score=" + score +
                '}';
    }

}