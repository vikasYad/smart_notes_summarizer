package com.aiprojects.smartnotes.controller;

import com.aiprojects.smartnotes.model.SummarizeRequest;
import com.aiprojects.smartnotes.model.SummarizeResponse;
import com.aiprojects.smartnotes.service.LlmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/summarize")
public class SummarizeController {

    @Autowired
    private LlmService llmService;

    @PostMapping
    public SummarizeResponse summarize(@RequestBody SummarizeRequest request) {
        return llmService.summarize(request);
    }

}
