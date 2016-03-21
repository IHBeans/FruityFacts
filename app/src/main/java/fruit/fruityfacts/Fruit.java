package fruit.fruityfacts;
//This class stores the specific fruit details called from DataProvider.java when an item is clicked, which is then used by DetailActivity.java
public class Fruit {
    private String fruitId;
    private String name;
    private String description;

    public String getFruitId() { return fruitId; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Fruit(String fruitId, String name, String description) {
        this.fruitId = fruitId;
        this.name = name;
        this.description = description;
    }
}

