# Sample Java Project

This is a sample Java project using Maven, designed to be used with Visual Studio Code.

## Prerequisites


- [Apache Maven](https://maven.apache.org/download.cgi) (`mvn` command)
- [Visual Studio Code](https://code.visualstudio.com/)
- [Java Extension Pack for Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
    - Java v.21 used for this project
    - `java` command

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/nick-popovic/samplejavaproject.git
cd samplejavaproject
```

## Notes
### Installing Maven

#### Windows

1. Download the Maven zip file from the [Apache Maven website](https://maven.apache.org/download.cgi).
2. Extract the zip file to a directory of your choice.
3. Add the `bin` directory of the extracted Maven directory to the `PATH` environment variable.
4. Verify the installation by opening a command prompt and typing:

```sh
mvn -version
```

#### macOS

1. Install Maven using Homebrew:

```sh
brew install maven
```

2. Verify the installation by opening a terminal and typing:

```sh
mvn -version
```

#### Linux

1. Install Maven using your package manager. For example, on Debian-based systems:

```sh
sudo apt update
sudo apt install maven
```

2. Verify the installation by opening a terminal and typing:

```sh
mvn -version
```