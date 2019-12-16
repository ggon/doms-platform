.PHONY: compile build clean run

compile:
	./gradlew build

build: compile
	docker build -t doms:latest .

clean:
	docker kill domsplatform
	docker rm domsplatform

run:
	docker run --network=domnet --name domsplatform -d -p 8080:8080 doms:latest
