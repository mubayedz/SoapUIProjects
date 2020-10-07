# SoapUIProjects


This is a SoapUIProject that was made by Java 1.8.0

If you want to run this project with Jenkins:

STEP1: SET THE COMPILERS ON THE WINDOW BATCH CONSOLE

javac -classpath SoapUI_Jars/* -d ./bin ./src/rest/*.java

javac -classpath SoapUI_Jars/* -d ./bin ./src/soap/*.java

STEP 2:

java -cp bin;SoapUI_Jars/* org.testng.TestNG testng.xml

STEP 3:

CLICK ON "Build"
