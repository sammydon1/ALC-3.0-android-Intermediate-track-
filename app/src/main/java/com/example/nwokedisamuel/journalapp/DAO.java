package com.example.nwokedisamuel.journalapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by nwokedi samuel on 6/29/2018.
 */
@Dao
public interface DAO {



    @Update
    void update(modelJournal...entry);

    @Insert
    void insert(modelJournal...entry);

    @Query("SELECT * FROM ENTRY")
    List<modelJournal> getJournalEntry();



}


