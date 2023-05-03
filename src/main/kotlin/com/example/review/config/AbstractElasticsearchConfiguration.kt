package com.example.review.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.context.annotation.Bean
import org.springframework.data.elasticsearch.config.ElasticsearchConfigurationSupport
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate
import org.springframework.data.elasticsearch.core.convert.ElasticsearchConverter


abstract class AbstractElasticsearchConfiguration : ElasticsearchConfigurationSupport() {
    @Bean
    abstract fun elasticsearchClient(): RestHighLevelClient?

    @Bean(name = ["elasticsearchOperations", "elasticsearchTemplate"])
    fun elasticsearchOperations(
        elasticsearchConverter: ElasticsearchConverter,
        elasticsearchClient: RestHighLevelClient
    ): ElasticsearchOperations? {
        val template = ElasticsearchRestTemplate(
            elasticsearchClient, elasticsearchConverter
        )
        template.refreshPolicy = refreshPolicy()
        return template
    }
}