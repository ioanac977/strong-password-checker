# strong-password-checker

##Run:

- open terminal 
- git clone <url-of-the-git-project>
- load the project using Intellij/Eclipse or a proper IDE capable of reading Java code
- select JDK with version 8
- go to src directory, click on Main class and run 

##Code description and assumptions:

- if a password has less than 3 letters, the change that a user should make is INSERT more characters for the password
- if a password has more than 20 letters, the change that a user should make is DELETE some characters for the password
- if a password doesn't containt at least one lowercase letter, at least one uppercase letter, and at least one 
digit , the change that a user should make is INSERT/REPLACE some characters for the password
- if a password has more that 3 letters in a row then the change that a user should make is REPLACE some of them for the password 

if the password has all the elements described above then user receive a 0 string as a response meaning that the password is strong. 


