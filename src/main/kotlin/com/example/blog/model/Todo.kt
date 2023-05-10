package com.example.blog.model

import jakarta.persistence.*


@Entity
@Table(name = "Todo")
data class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") val id: Int,
    @Column(name = "title") val title: String,
    @Column(name = "date") val date: String,
    @Column(name = "time") val time: String,
    @Column(name = "complete") val complete: Boolean
)

