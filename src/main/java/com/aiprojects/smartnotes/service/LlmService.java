package com.aiprojects.smartnotes.service;

import com.aiprojects.smartnotes.model.SummarizeRequest;
import com.aiprojects.smartnotes.model.SummarizeResponse;
import org.springframework.stereotype.Service;

@Service
public class LlmService {

    public SummarizeResponse summarize(SummarizeRequest request) {
        // TODO: Implement AI summarization
        return new SummarizeResponse();
    }

}
