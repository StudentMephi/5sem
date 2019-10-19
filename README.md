Java Lab1
------------

Write a console program that generates a hash value (md5 and sha256) for the text files.
In interactive mode the program should not exist until the user does not want this.
In simple mode the user can specify paths to the files which hash.

HOW TO INSTALL
------------
Download .java files
1. Main.java
2. Interactive.java
3. Simple.java

And please install libs: 
1. commons-codec-1.8.jar

HOW TO COMPILE
------------
cd ../Lib1
javac -sourcepath src -d bin -classpath lib/commons-codec-1.8.jar src/Main.java
jar cvfm Main.jar manifest.md -C bin .

HOW TO USE
------------
Write in terminal, if you want to run interactive mode:

java -jar Main.jar -i

And this command, if you want to run manual mode (flag -md5 or -sha256)

java -jar Main.jar -md5 -f test.txt 
