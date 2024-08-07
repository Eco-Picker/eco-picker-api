package com.eco_picker.api.domain.newsletter.data

import com.eco_picker.api.domain.newsletter.constant.NewsletterCategory
import io.swagger.v3.oas.annotations.media.Schema
import java.time.ZonedDateTime

data class Newsletter(
    @field:Schema(description = "newsletter ID (PK)", required = true)
    val id: Long? = null,

    @field:Schema(description = "title", required = true)
    val title: String,

    @field:Schema(description = "content", required = true)
    val content: String,

    @field:Schema(description = "category", required = true)
    val category: NewsletterCategory,

    @field:Schema(description = "source", required = true)
    val source: String,

    @field:Schema(description = "published datetime", required = true)
    val publishedAt: ZonedDateTime,
)
