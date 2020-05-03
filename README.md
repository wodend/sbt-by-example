# sbt by example

sbt by example is a simple demonstration of a Scala build using
[sbt](https://www.scala-sbt.org/index.html). This repository walks through the
[sbt by example](https://www.scala-sbt.org/1.x/docs/sbt-by-example.html)
tutorial from the [sbt documentation](https://www.scala-sbt.org/1.x/docs/).

## Requirements

The software required to run sbt by example is listed below. Follow the links
for installation instructions.

- [Java Development Kit 8+](https://adoptopenjdk.net/installation.html)
- [sbt](https://www.scala-sbt.org/1.x/docs/Setup.html)

## Installation

sbt by example was created for educational purposes. Clone the repository to
browse the code on your local machine.

```bash
git clone https://github.com/wodend/sbt-by-example.git
```

## Usage

Use sbt to compile the project, and run the tests.

```bash
cd sbt-by-example
sbt compile
sbt test
```

## Deployment

Deploy the package as a .zip using sbt.

```bash
sbt dist
```

Run version `[version]` of the packaged application.

```bash
mkdir /tmp/sbt-by-example
unzip -o -d /tmp/sbt-by-example/ target/universal/sbt-by-example-[version].zip
/tmp/sbt-by-example/sbt-by-example-[version]/bin/sbt-by-example
```

*Optional*:

Deploy the package with [Docker](https://docs.docker.com/get-docker/) using
sbt.

```bash
sbt Docker/publishLocal
```

Run version `[version]` of the dockerized application.

```bash
docker run sbt-by-example:[version]
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to
discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
