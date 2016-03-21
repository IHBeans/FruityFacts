package fruit.fruityfacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String FRUIT_ID = "FRUIT_ID"; //Defines the reference for the fruits.

    private List<Fruit> fruits = DataProvider.fruitList; //calls the fruit details from DataProvider.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = getResources().getStringArray(R.array.fruits); //calls the array of strings specified in fruits.xml
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1, items); //Converts the array of strings into a list of items.
        ListView lv = (ListView) findViewById(R.id.fruitListView);
        lv.setAdapter(adapter); //Puts the list of items into the listview specified in activity_main.xml

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class); //checks for when a user clicks on the list.

                Fruit fruit = fruits.get(position);
                intent.putExtra(FRUIT_ID, fruit.getFruitId());
                //Matches the position of the item clicked in the list to the corresponding information for that fruit in the hashmap from DataProvider.java
                //This data is then stored in an instance of the class Fruit.java, which is then used by DetailActivity.java
                startActivity(intent); //Starts DetailActivity.java
            }
        });
    }
}
