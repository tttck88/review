package com.example.review.repository

import com.example.review.document.ReviewDocument
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface ReviewEsRepository : ElasticsearchRepository<ReviewDocument, Long> {
}