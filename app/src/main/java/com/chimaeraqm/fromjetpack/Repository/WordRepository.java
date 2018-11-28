package com.chimaeraqm.fromjetpack.Repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.chimaeraqm.fromjetpack.DAO.WordDao;
import com.chimaeraqm.fromjetpack.Room.WordRoomDatabase;
import com.chimaeraqm.fromjetpack.objs.Word;

import java.util.List;

public class WordRepository
{
    private WordDao mWordDao;

    private LiveData<List<Word>> mAllWords;

    public WordRepository(Application application)
    {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }

    public LiveData<List<Word>> getAllWords()
    {
        return mAllWords;
    }

    public void insert(Word word)
    {
        new insertAsyncTask(mWordDao).execute(word);
    }

    private static class insertAsyncTask extends AsyncTask<Word,Void,Void>
    {
        private WordDao mAsyncTaskDao;

        insertAsyncTask(WordDao mAsyncTaskDao) {
            this.mAsyncTaskDao = mAsyncTaskDao;
        }

        @Override
        protected Void doInBackground(final Word... words)
        {
            mAsyncTaskDao.insert(words[0]);
            return null;
        }
    }
}
