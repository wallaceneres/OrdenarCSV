import java.util.ArrayList;

public class Item
{

    private String game;
    private String category;
    private Double rating;

    public Item(String game, String category, Double rating)
    {
        this.game = game;
        this.category = category;
        this.rating = rating;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public Double getrating() {
        return rating;
    }

    public void setrating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Item{" +
                "game='" + game + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                '}';
    }

}