package com.example.mynotebook.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "note_category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class NoteCategory {

    @Id
    @Column(name = "note_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne (mappedBy = "noteCategory",fetch = FetchType.LAZY,cascade = {})
    private Note note;

    public NoteCategory(){
        super();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
