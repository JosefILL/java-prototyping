@echo off
@cls

cd ../
if not exist "./target" (mkdir "./target")
find ./src/main -name "*.java" | xargs javac
jar -cMf ./target/primitive-datatypes.jar -C src/main . -C src/resource . 
java -cp ./target/primitive-datatypes.jar;. com.csahula.app.PrimitiveDatatypesApp

  


