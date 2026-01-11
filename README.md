[![Build](https://github.com/e-reznik/DocxJavaMapper/actions/workflows/maven.yml/badge.svg?branch=main)](
https://github.com/e-reznik/DocxJavaMapper/actions/workflows/maven.yml
)

# DocxJavaMapper

A lightweight Java library that parses Microsoft Word (.docx) files and maps them to Java POJOs using JAXB. Provides a
simple, clean API to read and navigate DOCX document content programmatically without the heavyweight Apache POI
dependency.

## Usage

Parse a DOCX file and navigate its structure using strongly typed Java objects:

```java
for (BodyElement element : doc.getBody().getBodyElements()) {
    if (element instanceof DJMParagraph paragraph) {
        // Process paragraph
    } else if (element instanceof DJMTable table) {
        // Process table
    }
}
```

## Tech Stack

- **Java 17**
- **JAXB** (Jakarta XML Binding) for XML-to-Java mapping
- **Lombok** for boilerplate reduction
- **JUnit 5** for testing
- **Maven** build system

## Architecture

```
DocxJM.map(file)  ->  DJMDocument
                          |
                          +-- DJMBody
                                 |
                                 +-- DJMParagraph
                                 |      +-- DJMRun (text, formatting)
                                 |      +-- DJMHyperlink
                                 |      +-- DJMParagraphProperties
                                 |
                                 +-- DJMTable
                                        +-- DJMTableRow -> DJMTableCell
```

## Supported Elements

| Category   | Elements                                                |
|------------|---------------------------------------------------------|
| Structure  | Document, Body, Paragraphs, Tables                      |
| Text       | Runs, Hyperlinks                                        |
| Formatting | Bold, Italic, Underline, Strike, Font, Color, Highlight |
| Layout     | Alignment, Numbering/Lists                              |
| Media      | Drawings, Anchors, Graphics, Pictures                   |
| Metadata   | Relationships                                           |

## Building

```bash
mvn clean package
```

## Testing

The project includes a real DOCX integration test executed in CI to validate end-to-end parsing.

```bash
mvn test
```

## Non-goals

- Full DOCX editing
- Rendering or layout calculation
- Word document creation
