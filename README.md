# FGOServantApp

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.3.14.
The backend folder contains a basic java and postgres project to practice http requests with Angular.

## Setting up the projects

These instructions assume you are using intellij and vs code to set these projects up and have node.js installed.
You can skip the back end setup if you do not need to perform any http requests in the front end project.

### Setting up the backend
1. Create a Postgresql database with the same name in the application.yml file.
2. Add your own data to the database to see the fetch all and search methods work
3. Import the project in IntelliJ.
4. Run the application.
### Setting up the frontend
1. Open the ngfrontend folder in vs code.
2. Open a terminal and type `npm install` to get the latest dependancies. 
3. Refer below to run the application.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
