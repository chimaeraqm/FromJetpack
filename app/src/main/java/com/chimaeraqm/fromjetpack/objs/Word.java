package com.chimaeraqm.fromjetpack.objs;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word
{
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(String mWord) {
        this.mWord = mWord;
    }

    @NonNull
    public String getmWord() {
        return mWord;
    }

    public void setmWord(@NonNull String mWord) {
        this.mWord = mWord;
    }
}
