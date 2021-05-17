docker-compose build --build-arg BUILDKIT_INLINE_CACHE=1 service1
docker-compose run service1
docker-compose push service1