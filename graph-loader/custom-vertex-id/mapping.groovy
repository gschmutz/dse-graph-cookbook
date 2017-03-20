// CONFIGURATION
// Configures the data loader to create the schema
config create_schema: false, load_new: false, load_vertex_threads: 0, load_edge_threads: 0

// DATA INPUT
inputFileDir = './'

dataInput = File.text(inputFileDir + "data.txt").delimiter(',').header('field1','field2')


load(dataInput).asVertices {
    label "vertex1"
	key "field1":"field1"
}



