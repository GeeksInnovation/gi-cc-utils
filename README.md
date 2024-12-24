# gi-cc-utils Repository

The `gi-cc-utils` repository contains all the utility classes and methods required for the `gi-cc` application. These utilities are packaged into a `.jar` file that can be used across multiple services within the `gi-cc` ecosystem.

## Version Details

- **Java Version**: 17

## Getting Started

## Initial Setup

1. **Clone the Repository**:
   
   Clone the repository to your local machine:

   ```bash
   git clone https://github.com/GeeksInnovation/gi-cc-be.git

2. **Build the Project**: 

    The `mvn clean install` command is included for installing the dependencis for the project.

3. **Package the Project**: 

    The `mvn clean package` command is included for building the building the project. This command will generate `.jar` file that you can found inside the `target` directory

4. **Deploy the Project**: 

    The `mvn deploy` command to deploy the .jar file to the package repository in GitHub, update the `version in the pom.xml` file and run
    This will publish the `.jar` file to the GitHub package repository.

5. **Use the Published .jar in gi-cc-be Applications**

    After deploying the `.jar`, follow these steps to integrate it into your gi-cc-be application:
    Update the version of the utility package in the pom.xml file of your `gi-cc-be` project.
    Run the following command  mvn install`in your gi-cc-be project to install and use the updated .jar:
   
    The updated utility .jar will now be pulled and used in the gi-cc-be application.

