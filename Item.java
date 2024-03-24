public class Item
{

    private String game;
    private String category;
    private Double rating;

    public Item(String game, String category, String rating)
    {
        setGame(game);
        setCategory(category);
        setRating(rating);
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

    public Double getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = Double.parseDouble(rating);
    }

    @Override
    public String toString() {
        return  "game='" + game + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                '}';
    }

}