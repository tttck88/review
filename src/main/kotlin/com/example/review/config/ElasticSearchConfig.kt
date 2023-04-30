package com.example.review.config

import co.elastic.clients.elasticsearch.ElasticsearchClient
import co.elastic.clients.json.jackson.JacksonJsonpMapper
import co.elastic.clients.transport.ElasticsearchTransport
import co.elastic.clients.transport.rest_client.RestClientTransport
import org.apache.http.HttpHost
import org.elasticsearch.client.RestClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ElasticSearchConfig {

    @Bean
    fun restClient(): RestClient {
        return RestClient.builder(
            HttpHost("localhost", 9200)
        ).build()
    }

    @Bean
    fun elasticsearchClient(): ElasticsearchClient {
        return ElasticsearchClient(elasticsearchTransport())
    }

    @Bean
    fun elasticsearchTransport(): ElasticsearchTransport {
        return RestClientTransport(restClient(), JacksonJsonpMapper())
    }
}