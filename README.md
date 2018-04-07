# project3
Project using Maven to show Junit Tests, JaCoCo, and PITest.

Download this project and unzip.  From IDE (I use IntelliJ), import a project, go to project files, and double click on the POM.xml file.

Once the project is loaded, do a Maven Install.  

The test results will be in the Target directory that Maven creates.

The JaCoCo coverage results will be in the "site" folder.  Under JaCoCo, double click the index.html file and open it in a browser to see the coverage drill down reports.

The PITest results will also be in the Target directory, under pit-reports.  The PITest reports will be in a folder named with the date and time that the tests were run.  Open the index.html under the dated folder and open it in a browser.  The mutants that were created for the PITests are located in the export folder.  Since PITest works on the Java bytecode, the mutants are in the .class file in each numbered folder.  I don't know what other IDE's do, but IntelliJ actually shows the decompiled .class file.  

