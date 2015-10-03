package com.gdgdlima.materializeyourapp.view.listeners;


import com.gdgdlima.materializeyourapp.entity.NoteEntity;
import com.gdgdlima.materializeyourapp.storage.db.CRUDOperations;

/**
 * Created by emedinaa on 15/09/15.
 */
public interface OnNoteListener {

     CRUDOperations getCrudOperations();
     void deleteNote(NoteEntity noteEntity);
     void editNote(NoteEntity noteEntity);
}
