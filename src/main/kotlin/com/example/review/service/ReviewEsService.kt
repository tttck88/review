package com.example.review.service

import co.elastic.clients.elasticsearch.ElasticsearchClient
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ReviewEsService (
) {
    fun insertReviews() {

    }
}