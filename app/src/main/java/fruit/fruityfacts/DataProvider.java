package fruit.fruityfacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataProvider {

    public static List<Fruit> fruitList = new ArrayList<>(); //Creates an arraylist of the details for each fruit
    public static Map<String, Fruit> fruitMap = new HashMap<>(); //Creates a hashmap of the details for each fruit

    static {
//The groups below specify the ID, name and description for each fruit
        addFruit("f101",
                "Apple",
                "Apples are red or green coloured fruits which are crunchy and juicy inside. Common varieties include: Pink Lady, Gala and fuji. \n\n Calories: \t 130 \n Potassium (g): \t 260 \n Vitamin C (%DV): \t 8 \n (1 large apple)");

        addFruit("f102",
                "Banana",
                "Bananas are yellow crescent shaped fruits which are known for their high potassium content. The most popular variety is the Cavendish banana. \n\n Calories: \t 110 \n Potassium (g): \t 450 \n Vitamin C (%DV): \t 4 \n (1 medium banana)");

        addFruit("f103",
                "Grapes",
                "Grapes are small, round fruits which grow in bunches. They can be red or green and are commonly used in wine making. \n\n Calories: \t 90 \n Potassium (g): \t 240 \n Vitamin C (%DV): \t 2 \n (3/4 cup of grapes)");

        addFruit("f104",
                "Kiwi",
                "Kiwis are green, round fruits with a fuzzy skin but are soft and juicy on the inside. \n\n Calories: \t 90 \n Potassium (g): \t 450 \n Vitamin C (%DV): \t 240 \n (2  medium kiwis)");

        addFruit("f105",
                "Orange",
                "Oranges are tangy, orange-coloured fruits which are known for their high vitamin C content. Oranges are a variation between the Pomelo and the Mandarin fruits. \n\n Calories: \t 80 \n Potassium (g): \t 250 \n Vitamin C (%DV): \t 130 \n (1 medium orange)");

        addFruit("f106",
                "Peach",
                "Peaches are a round, soft fruit with a fuzzy skin and containing a central hard stone. Common varieties include: Lovell and Nemaguard. \n\n Calories: \t 60 \n Potassium (g): \t 230 \n Vitamin C (%DV): \t 15 \n (1 medium peach)");

        addFruit("f107",
                "Pear",
                "Pears are a soft fruit with an unusual shape somewhat resembling a teardrop. Common varieties include: Anjou, Bartlett and Seckel. \n\n Calories: \t 100 \n Potassium (g): \t 190 \n Vitamin C (%DV): \t 10 \n (1 medium pear)");

        addFruit("f108",
                "Plum",
                "Plums are a round, soft fruit which are typically purple when ripe and contain a hard stone. Common varieties include: Avalon and Victoria. \n\n Calories: \t 70 \n Potassium (g): \t 230 \n Vitamin C (%DV): \t 10 \n (2 medium plums)");

        addFruit("f109",
                "Strawberries",
                "Strawberries are tasty. \n\n Calories: \t 50 \n Potassium (g): \t 170 \n Vitamin C (%DV): \t 160 \n (8 medium strawberries)");
    }

    private static void addFruit(String itemId, String name,
                                 String description) {
        Fruit item = new Fruit(itemId, name, description); //Stores the Id, name and description for each fruit in one data set.
        fruitList.add(item); //Adds the data sets into the arraylist
        fruitMap.put(itemId, item); //Adds the Ids and datasets into the hashmap
    }
}