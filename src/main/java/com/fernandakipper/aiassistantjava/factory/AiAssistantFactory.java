package com.fernandakipper.aiassistantjava.factory;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.huggingface.HuggingFaceChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import java.time.Duration;

public class AiAssistantFactory {

    public static ChatLanguageModel createHuggingFace(String accessToken) {
        return HuggingFaceChatModel.builder()
                .accessToken(accessToken)
                .modelId("EleutherAI/gpt-neo-125m")
                .timeout(Duration.ofSeconds(300))
                .build();
    }

    public static ChatLanguageModel createLocalChatModel() {
        return OpenAiChatModel.builder()
                .baseUrl("http://localhost:1234/v1")
                .apiKey("ignore")
                .logRequests(true)
                .timeout(Duration.ofSeconds(300))
                .build();
    }
}
