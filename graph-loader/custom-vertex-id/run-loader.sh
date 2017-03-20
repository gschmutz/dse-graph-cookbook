#!/bin/bash
export PATH=$PATH:/opt/dse-graph-loader-5.0.6/

graphloader mapping.groovy -graph test_v10 -address 192.168.69.134 -dryrun false -preparation false -abort_on_num_failures 10000 -abort_on_prep_errors false -vertex_complete false

