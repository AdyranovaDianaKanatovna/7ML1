package com.example.a7ml1.presentaion.ui

import com.example.a7ml1.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {
    fun getAllNotes() = noteRepository.getAllNotes()

}