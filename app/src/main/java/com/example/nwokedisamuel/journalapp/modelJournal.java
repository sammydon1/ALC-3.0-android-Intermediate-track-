package com.example.nwokedisamuel.journalapp;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by nwokedi samuel on 6/29/2018.
 */
@Entity(tableName = "ENTRY")
public class modelJournal {
    @PrimaryKey(autoGenerate = true)
  public int id;
  public String title;
  public String idea;

    public modelJournal(int id, String title, String idea){
            this.id=id;
            this.title=title;
            this.idea=idea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdea() {return idea;}

    public void setIdea(String idea) {
        this.idea = idea;
    }
}
