package com.chimaeraqm.fromjetpack.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.chimaeraqm.fromjetpack.DAO.WordDao;
import com.chimaeraqm.fromjetpack.objs.Word;

@Database(entities = {Word.class},version = 1)
public abstract class WordRoomDatabase extends RoomDatabase
{
    public abstract WordDao wordDao();

    private static volatile WordRoomDatabase INSTANCE;

    public static WordRoomDatabase getDatabase(final Context context)
    {
        if(INSTANCE == null)
        {
            synchronized (WordRoomDatabase.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDatabase.class,"word_database").build();
                }
            }
        }
        return INSTANCE;
    }
}