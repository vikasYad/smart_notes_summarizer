package com.aiprojects.smartnotes.model;

import lombok.Data;
import java.util.List;

@Data
public class SummarizeResponse {
    private String title;
    private String summary;
    private List<String> keyPoints;
    private List<String> actionItems;
}
