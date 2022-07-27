package com.example.a7ml1.presentaion.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.a7ml1.data.repository.NoteRepositoryImpl
import com.example.a7ml1.domain.model.Note


class MainViewModel : ViewModel() {
    private val repository = NoteRepositoryImpl()
    private val getAllNotesUseCase = GetAllNotesUseCase(repository)
    private val addNoteUseCase = AddNoteUseCase(repository)
    private val deleteNoteUseCase = DeleteNoteUseCase(repository)

    val liveData = MutableLiveData<List<Note>>()

    fun addNote(note: Note) {
        addNoteUseCase.addNote(note)
        getAllNotes()
    }

    fun getAllNotes() {
        liveData.value = getAllNotesUseCase.getAllNotes()
    }

    fun deleteNote(index: Int) {
        deleteNoteUseCase.deleteNote(index)
        getAllNotes()
    }

}