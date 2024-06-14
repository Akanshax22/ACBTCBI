package com.example.unit_converter;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SearchView searchView;
    private ListView categoryList;
    private ArrayAdapter<String> adapter;
    private String[] categories = {"Length", "Weight", "Volume", "Temperature", "Speed", "Area", "Time", "Currency"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
        categoryList = findViewById(R.id.categoryList);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        categoryList.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        categoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String category = adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, ConversionActivity.class);
                intent.putExtra("CATEGORY", category);
                startActivity(intent);
            }
        });
    }
}

