package com.example.a7ml1.presentaion.ui

import com.example.a7ml1.domain.model.Note
import com.example.a7ml1.domain.repository.NoteRepository

class AddNoteUseCase(private val noteRepository: NoteRepository) {

    fun addNote(note: Note) = noteRepository.addNote(note)
}