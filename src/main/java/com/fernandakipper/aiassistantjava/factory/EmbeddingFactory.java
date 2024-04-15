package com.fernandakipper.aiassistantjava.factory;

import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;

public class EmbeddingFactory {

    public static EmbeddingModel createEmbeddingModel() {
        return new AllMiniLmL6V2EmbeddingModel();
    }

    public static EmbeddingStore createEmbeddingStore() {
        return new InMemoryEmbeddingStore();
    }
}

