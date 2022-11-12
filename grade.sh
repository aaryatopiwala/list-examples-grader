# Create your grading script here
#set -e
CPATH=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"

rm -rf student-submission

git clone $1 student-submission

cp TestListExamples.java student-submission
cp -r lib student-submission
cd student-submission

javac -cp $CPATH *.java
if [ $? -eq 0 ];
then
    echo "Files complied"
else
    echo "Files failed to compile"
    exit 1
fi
java -cp $CPATH org.junit.runner.JUnitCore TestListExamples