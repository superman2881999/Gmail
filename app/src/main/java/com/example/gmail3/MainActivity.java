package com.example.gmail3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {
    List<ContactModel> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contacts = new ArrayList<>();
        for(int i=0; i <=15;i++) {
            Faker faker = new Faker();
            contacts.add(new ContactModel(faker.name.name(), faker.lorem.sentence(), faker.lorem.paragraph(), "07:03 AM"));
        }
        ImageAdapter adapter = new ImageAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}


