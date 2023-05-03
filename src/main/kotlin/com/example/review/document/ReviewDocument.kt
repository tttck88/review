package com.example.review.document

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "review")
class ReviewDocument (
    @Id
    private val reviewSeq: Long,
    private val content: String
)