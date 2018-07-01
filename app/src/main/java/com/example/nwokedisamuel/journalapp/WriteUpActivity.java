package com.example.nwokedisamuel.journalapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteUpActivity extends AppCompatActivity {
            EditText titlEdit,ideaEdit;
           public Button addEntryButton;
           JournalDatabase database;
           String title;
           String idea;
           int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_up);
        titlEdit=(EditText) findViewById(R.id.caption);
        ideaEdit=(EditText) findViewById(R.id.writupedit);
        addEntryButton=(Button) findViewById(R.id.save);

        database= Room.databaseBuilder(getApplicationContext(), JournalDatabase.class, "JOURNAL")
                .allowMainThreadQueries()
                .build();
    }


    public void addEntry(View view) {

        title=titlEdit.getText().toString();
        idea=ideaEdit.getText().toString();

           if(title!=null && idea!=null){
        modelJournal mj=new modelJournal(id,title,idea);
        database.getdao().insert(mj);
        startActivity(new Intent(WriteUpActivity.this, HomeActivity.class));
           }

           else if(title==null && idea==null){
            startActivity(new Intent(WriteUpActivity.this, HomeActivity.class));
        }


    }
}
