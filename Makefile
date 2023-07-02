SHELL=/bin/bash

REPOSITORY := https://github.com/sekijum/isolating-the-domain.git
COMPOSE_FILE = compose.yaml

.PHONY: init
init:
	make clean
	docker-compose -f $(COMPOSE_FILE) build --no-cache --build-arg BUILDKIT_INLINE_CACHE=1

.PHONY: clean
clean:
	docker-compose -f $(COMPOSE_FILE) down --volumes

.PHONY: bash
bash:
	docker-compose -f $(COMPOSE_FILE) run --rm --service-ports -ti api /bin/bash --login
