system.graph('test_v10').option("graph.allow_scan").set("true").ifNotExists().create()

:remote config alias g test_v10.g

schema.clear()

schema.propertyKey('field1').Text().ifNotExists().create()
schema.propertyKey('field2').Text().ifNotExists().create()
schema.propertyKey('field3').Text().ifNotExists().create()
schema.propertyKey('field4').Text().ifNotExists().create()
schema.propertyKey('field5').Text().ifNotExists().create()

schema.vertexLabel('vertex1').partitionKey('field1').properties('field1','field2').ifNotExists().create()
