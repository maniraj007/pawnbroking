version: '3.2'

services:
    service1:
        build:
            context: ./DockerImageTest
            cache_from: test-docker:1.0.0
        image: test-docker:1.0.0