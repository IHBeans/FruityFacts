package fruit.fruityfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //Specifies the back button.

        String fruitID = getIntent().getStringExtra(MainActivity.FRUIT_ID);
        final Fruit fruit = DataProvider.fruitMap.get(fruitID); //Specifies the specific fruit details being called.

        TextView tv = (TextView) findViewById(R.id.nameText);
        tv.setText(fruit.getName()); //Sets the TextView to display the name of the fruit stored in Fruit.java

        TextView descView = (TextView) findViewById(R.id.descriptionText);
        descView.setText(fruit.getDescription()); //sets the TextView to display the fruit description stored in Fruit.java

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Links the back button to MainActivity.java
    }

}