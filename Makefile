.PHONY: compile build run run-database

compile:
	./gradlew build

build: compile
	docker build -t doms:latest .

run:
	docker run -d -p 8080:8080 doms:latest

run-database:
	# do we want this here? hmmmmm...
	docker run --name domsdb -e MYSQL_ROOT_PASSWORD=g4a4b4i4 -d mysql:latest
