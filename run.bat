cd C:\Users\owner\workspace\JavaTestNG
set ProjectPath=C:\Users\owner\workspace\JavaTestNG
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testNG_group.xml