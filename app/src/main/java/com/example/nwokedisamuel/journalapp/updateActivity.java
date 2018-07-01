package com.example.nwokedisamuel.journalapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class updateActivity extends AppCompatActivity {
     EditText caption,idea;
     Button update;
     int id=0;
    JournalDatabase  database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        caption=findViewById(R.id.caption);
        idea=findViewById(R.id.writupedit);
        update=findViewById(R.id.update);


          database= Room.databaseBuilder(getApplicationContext(), JournalDatabase.class, "JOURNAL")
                .allowMainThreadQueries()
                .build();




    }

    public void updateEntry(View view) {
           String title=caption.getText().toString();
           String message=idea.getText().toString();
             modelJournal mj=new modelJournal(id,title,message);
              database.getdao().update(mj);
              startActivity(new Intent(updateActivity.this, HomeActivity.class));





    }
}
