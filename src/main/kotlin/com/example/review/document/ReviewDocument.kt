package com.example.review.document

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "review")
class ReviewDocument (
    private val reviewSeq: Long,
    private val content: String
)