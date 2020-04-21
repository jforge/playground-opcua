# OPC-UA Sample Client for Java

Demonstrates the use of Eclipse Milo as a OPC-UA library for Java.

## Prerequisites

Install at least a Java 8 RE and Maven.

## Compile

```bash
mvn clean install
```

## Run

Use one of the SampleNode programs and execute Maven:
```bash
mvn exec:java -Dexec.mainClass="io.eol.opcua.client.SampleNodeReaderSystemTime"
```

## References

- [Eclise Milo](https://projects.eclipse.org/projects/iot.milo)
- [OPC-UA](https://www.unified-automation.com/)
