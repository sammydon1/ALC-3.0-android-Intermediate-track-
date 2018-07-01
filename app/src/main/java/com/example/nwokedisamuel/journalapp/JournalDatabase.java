package com.example.nwokedisamuel.journalapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by nwokedi samuel on 6/29/2018.
 */

    @Database(entities = modelJournal.class,version =1,exportSchema = false)
    public  abstract  class JournalDatabase extends RoomDatabase {

        public abstract DAO getdao();


    }

