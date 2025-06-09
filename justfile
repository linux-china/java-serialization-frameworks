fbs:
  flatc --java --java-package-prefix org.mvnsearch.serialization.fbs --gen-mutable -o src/main/java -b src/main/fbs/msg.fbs

updates:
  mvn versions:display-dependency-updates > updates.txt
