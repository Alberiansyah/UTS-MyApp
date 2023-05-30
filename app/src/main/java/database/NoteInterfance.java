package database;

import android.database.Cursor;

import model.Note;

public interface NoteInterfance {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
