package com.example.review.repository

import com.example.review.document.ReviewDocument
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest
class ReviewEsRepositoryTest {
    @Autowired
    private lateinit var reviewEsRepository: ReviewEsRepository

    @Test
    fun test() {
        val reviewDocument = ReviewDocument(reviewSeq = 1, content = "후기")
        reviewEsRepository.save(reviewDocument)
    }
}