package com.example.review.service

import co.elastic.clients.elasticsearch.ElasticsearchClient
import co.elastic.clients.elasticsearch.core.IndexRequest
import com.example.review.document.ReviewDocument
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ReviewEsService (
    private val esClient: ElasticsearchClient
) {
    fun insertReviews() {
    }
}