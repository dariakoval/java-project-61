setup:
	gradle wrapper --gradle-version 7.4

clean:
	./gradlew clean

build:
	./gradlew clean build

lint:
	./gradlew checkstyleMain checkstyleTest

test:
	./gradlew test

run-dist: # выполняет запуск исполняемого файла
	@./build/install/app/bin/app

.PHONY: build
