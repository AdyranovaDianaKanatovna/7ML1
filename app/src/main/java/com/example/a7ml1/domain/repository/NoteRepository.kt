package com.example.a7ml1.domain.repository

import com.example.a7ml1.domain.model.Note

interface NoteRepository {
    fun addNote(note: Note)
    fun getAllNotes(): List<Note>
    fun deleteNote(index: Int)
}