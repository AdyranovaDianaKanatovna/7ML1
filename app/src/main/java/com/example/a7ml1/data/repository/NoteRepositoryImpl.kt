package com.example.a7ml1.data.repository

import android.util.Log
import com.example.a7ml1.data.mapper.NoteMapper
import com.example.a7ml1.data.model.NoteDto
import com.example.a7ml1.domain.model.Note
import com.example.a7ml1.domain.repository.NoteRepository

class NoteRepositoryImpl : NoteRepository {
    private val noteMapper = NoteMapper()
    private val notes = arrayListOf<NoteDto>()

    override fun addNote(note: Note) {
        notes.add(noteMapper.toNoteDto(note))
        Log.e("TAG", "addNote: $notes")

    }

    override fun getAllNotes(): List<Note> {
        return notes.map { noteDto ->
            noteMapper.toNote(noteDto)
        }
    }

    override fun deleteNote(index: Int) {
        notes.removeAt(index)
    }
}