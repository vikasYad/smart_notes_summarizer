# AI Agent Guidelines for smart_notes_summarizer

## Architecture Overview
This is a Spring Boot web application for AI-powered note summarization. Users paste text to receive AI-generated summaries, action items, key points, and title suggestions.

- **Main Entry Point**: `src/main/java/com/aiprojects/sns/SnsApplication.java` - Standard `@SpringBootApplication` class.
- **Configuration**: `src/main/resources/application.yaml` - Sets `spring.application.name: sns`.
- **Build System**: Maven with wrapper (`mvnw.cmd` on Windows, `mvnw` on Unix).

## Key Dependencies
- Spring Boot 4.0.3 (starters: `spring-boot-starter-webmvc`, `spring-boot-starter-data-jpa`).
- Lombok for boilerplate reduction.
- Java 25.

## Developer Workflows
- **Run App**: `./mvnw.cmd spring-boot:run` (starts on default port 8080).
- **Build**: `./mvnw.cmd clean compile`.
- **Test**: `./mvnw.cmd test` (uses JUnit 5, as in `SnsApplicationTests.java`).
- **Package**: `./mvnw.cmd package` (creates executable JAR).

## Code Conventions
- **Package Naming**: All code in `com.aiprojects.sns` (e.g., main class `SnsApplication`).
- **Lombok Integration**: Configured in `pom.xml` with annotation processor paths; use for entities/DTOs (e.g., `@Data` for getters/setters).
- **App Abbreviation**: 'sns' used in artifact ID, app name, and likely future class names.

## Integration Points
- **AI Summarization**: Planned feature with no current implementation; add dependencies like OpenAI Java client when implementing.
- **Database**: JPA ready; create entities in `com.aiprojects.sns` package for storing notes/summaries.
- **Web Layer**: MVC setup; add controllers like `@RestController` classes for endpoints (e.g., POST /summarize).

## Patterns to Follow
- **Entity Example**: When adding JPA entities, place in `src/main/java/com/aiprojects/sns/` with `@Entity` and Lombok (e.g., `@Data @Entity public class Note { ... }`).
- **Controller Example**: REST controllers in same package, e.g., `@RestController @RequestMapping("/api") public class SummarizeController { ... }`.
- **Test Structure**: Tests in `src/test/java/com/aiprojects/sns/` mirroring main package, using `@SpringBootTest`.</content>
<parameter name="filePath">C:\Users\vikayada\Desktop\AI_Projects\smart_notes_summarizer\AGENTS.md
