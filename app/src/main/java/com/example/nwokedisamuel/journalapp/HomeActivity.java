package com.example.nwokedisamuel.journalapp;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import java.util.List;


public class HomeActivity extends AppCompatActivity {
    JournalDatabase database;
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
     Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mRecyclerView =  findViewById(R.id.rcv);
        mRecyclerView.setHasFixedSize(true);


        database= Room.databaseBuilder(getApplicationContext(), JournalDatabase.class, "JOURNAL")
                .allowMainThreadQueries()
                .build();

        List<modelJournal> modelJournals =  database.getdao().getJournalEntry();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new UserAdapter(modelJournals, context);
        mRecyclerView.setAdapter(mAdapter);
    }


    public void createEntry(View view) {
        startActivity(new Intent(HomeActivity.this,WriteUpActivity.class));

    }



    public void signout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(HomeActivity.this,LoginActivity.class));
    }

    public void edit(View view) {

        startActivity(new Intent(HomeActivity.this,updateActivity.class));
    }
}