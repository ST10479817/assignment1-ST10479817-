"# assignment1-ST10479817-" 

## Project Overview
This is an android app that suggests meals based on the time of day. The user inputs a time and the app provides a meal recommendation.

## Repository Link
https://github.com/ST10479817/assignment1-ST10479817-

## Youtube Video Demo
https://youtu.be/b0ThWCNd_Eo


## The Report

### 1. Purpose of the App
The Meal Suggestion App helps users decide what to eat based on the time of day. It is designed to provide quick meal ideas, making meal planning easier using RadioButtons and images.

### 2. Design Considerations

#### User Interface
Made to be simple and have as minimum chances of errors. The user picks one of the radiobuttons which allows for the user to only pick out of only 6 options.
It then takes to a display screen for each option.
In which we only see the text and a clear button.
The clear button takes you back to the main screen, which is where the user picks their time of day.

#### Meal Suggestion Logic

Early Morning = "You may consider having Eggs in the Early Morning for your Breakfast."
Mid Morning = "Some fruits would be a suitable choice in the Mid-Morning for a Light Snack."
Afternoon = "A Sandwich would be an appropriate meal for your Afternoon."
Late Afternoon = "A slice of Cake is a good quick bite for the Late Afternoon. "
Evening = "A pasta dish is a great choice for Dinner in the Evening."
Night = "Ice cream would be a delightful treat for Dessert at Night."


### 3. Utilization of GitHub and GitHub Actions

#### GitHub Version Control
I have been updating my project, adding comments for changes.

#### GitHub Actions
I manage to get the Action test to work. main.yml and it is in (.github/workflows).

#### Workflow File:
name: Android CI

on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      
      - uses: actions/setup-java@v3
        with:
          distribution: 'zulu'
          java-version: '17'
      
      - name: Grant execute permission to Gradle wrapper
        run: chmod +x gradlew
      
      - name: Build the project
        run: ./gradlew build

## Screenshots

### App images

![Screenshot 2025-04-02 101948](https://github.com/user-attachments/assets/2c1bd827-6094-4b5f-be10-1910705f4ffb)
![Screenshot 2025-04-02 102015](https://github.com/user-attachments/assets/527b7661-8ffb-49e9-bdee-5b0943df9472)
![Screenshot 2025-04-02 102038](https://github.com/user-attachments/assets/0ca7a252-2192-4558-ad11-0c68b7cd6e09)


