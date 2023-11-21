setup:
	make -C app setup

clean:
	make -C app clean

build:
	make -C app build

lint:
	make -C app lint

test:
	make -C app test

run-dist: # выполняет запуск исполняемого файла
	make -C app run-dist

.PHONY: build