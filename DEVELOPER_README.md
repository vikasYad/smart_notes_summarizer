# Developer README for Smart Notes Summarizer

## Project Overview
Smart Notes Summarizer is a Spring Boot web application designed for AI-powered note summarization. Users can paste text into a web interface, and the application generates AI-driven summaries, action items, key points, and title suggestions.

## Architecture
- **Framework**: Spring Boot 4.0.3
- **Language**: Java 21
- **Build Tool**: Maven
- **Database**: H2 (in-memory for development/testing)
- **Frontend**: Simple HTML/JS served from static resources
- **Backend**: REST API with MVC pattern

### Key Components
- **Main Application**: `SmartNotesApplication.java` - Entry point
- **Controller**: `SummarizeController.java` - Handles API requests
- **Service**: `LlmService.java` - Business logic for summarization (placeholder for AI integration)
- **Models**: `SummarizeRequest.java`, `SummarizeResponse.java` - Data transfer objects
- **Config**: `WebClientConfig.java` - Configuration for HTTP client (for future AI API calls)

## How to Run
1. Ensure Java 21 is installed.
2. Run `./mvnw.cmd spring-boot:run` from the project root.
3. Access the application at `http://localhost:8080`.
4. Use the web interface to paste notes and get summaries (currently returns empty response, pending AI implementation).

## API Endpoints
- `POST /api/summarize` - Accepts JSON with `text` field, returns summary data.

## Dependencies
- Spring Boot Starters: Web MVC, Data JPA, WebFlux
- Lombok for boilerplate reduction
- H2 Database for testing

## Current Status
- Basic project structure created.
- Web server runs successfully.
- API endpoint defined but summarization logic is a placeholder.
- Tests pass.

## Change Log
This section summarizes changes made to the project. Updates are appended here on each push.

### Initial Setup (March 16, 2026)
- Created project structure with Spring Boot.
- Set up package `com.aiprojects.smartnotes`.
- Implemented basic REST API for summarization.
- Added H2 database for JPA configuration.
- Created simple HTML frontend.
- Configured WebClient for future AI integrations.
- Fixed Java version to 21 for compatibility.
- All tests passing.</content>
<parameter name="filePath">C:\Users\vikayada\Desktop\AI_Projects\smart_notes_summarizer\DEVELOPER_README.md
