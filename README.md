# digraph-parser

Simple, standalone Java parser for digraph DSL (domain-specific language) in Graphviz DOT syntax

See also
* http://www.graphviz.org/doc/info/lang.html

#### Usage
```java
GraphParser parser = new GraphParser(new FileInputStream("src/test/resources/test1.dg"));
Map<String, GraphNode> nodes = parser.getNodes();
Map<String, GraphEdge> edges = parser.getEdges();	

log("--- nodes:");
for (GraphNode node : nodes.values()) {
	log(node.getId() + " " + node.getAttributes());
}

log("--- edges:");
for (GraphEdge edge : edges.values()) {
	log(edge.getNode1().getId() + "->" + edge.getNode2().getId() + " " + edge.getAttributes());
}
```

#### Maven dependency
```xml
<dependency>
  <groupId>com.paypal.digraph</groupId>
  <artifactId>digraph-parser</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
