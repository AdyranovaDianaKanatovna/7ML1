package com.example.a7ml1.data.mapper

import com.example.a7ml1.data.model.NoteDto
import com.example.a7ml1.domain.model.Note

class NoteMapper {
    fun toNoteDto(note: Note): NoteDto {
        return NoteDto(
            title = note.title,
            description = note.description
        )
    }

    fun toNote(noteDto: NoteDto): Note {
        return Note(
            title = noteDto.title,
            description = noteDto.description
        )
    }
}