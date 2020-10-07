# SoapUIProjects


This is a SoapUIProject that was made by jdk1.8.0_221 to run the test cases
And Groovy to write the scripts

If you want to run this project with Jenkins:

STEP1: SET THE COMPILERS ON THE WINDOW BATCH CONSOLE

javac -classpath SoapUI_Jars/* -d ./bin ./src/rest/*.java

javac -classpath SoapUI_Jars/* -d ./bin ./src/soap/*.java

NOTE: "rest" is the name of the Package
NOTE: "SoapUI_Jars" is the name of the folder that have all the Jars to run the project

STEP 2: This is the command to run TestNG

java -cp bin;SoapUI_Jars/* org.testng.TestNG testng.xml

STEP 3: Click on Build on Jenkins

CLICK ON "Build"
