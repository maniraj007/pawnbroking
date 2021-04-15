docker build -t ghcr.io/maniraj007/test-docker --cache-from=ghcr.io/maniraj007/test-docker ./DockerImageTest
docker push ghcr.io/maniraj007/test-docker
docker run ghcr.io/maniraj007/test-docker
