package com.example.a7ml1.presentaion.ui

import com.example.a7ml1.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {
    fun deleteNote(index: Int) = noteRepository.deleteNote(index)
}