public class Item
{

    private String game;
    private String category;
    private Double rating;

    public Item(String game, String category, Double rating)
    {
        setGame(game);
        setCategory(category);
        setrating(rating);
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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
        return  "game='" + game + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                '}';
    }

}