package com.secure.notes.services;

import com.secure.notes.models.Note;

import java.util.List;

public interface NoteService {
    public Note createNoteForUsser(String username, String content);

    public Note updateNoteForUser(Long noteId, String content, String username);

    public void deleteNoteForUser(Long noteId, String username);

    public List<Note> getNotesForUser(String username);
}
