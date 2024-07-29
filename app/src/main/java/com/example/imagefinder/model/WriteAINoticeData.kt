package com.example.imagefinder.model

// Message.kt
data class Message(
    val role: String,
    val content: String
)

// ChatCompletionRequest.kt
data class ChatCompletionRequest(
    val model: String,
    val messages: List<Message>,
    val response_format: Map<String, String>
)

// ChatCompletionResponse.kt
data class ChatCompletionResponse(
    val choices: List<Choice>
)

data class Choice(
    val message: Message
)

data class MessageContent(
    val finish_reason: String,
    val index: Int,
    val message: Message,
    val logprobs: Int
)

data class WriteAINoticeResponse(
    val result: String
)