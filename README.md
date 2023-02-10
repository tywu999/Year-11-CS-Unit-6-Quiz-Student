# Year-11-CS-Unit-6-Quiz-Student

Ensure that you read all instructions <b>carefully</b>. Do not include any additional variables or methods that are not specified in this quiz description. Each question is worth one mark and is binary. That is, you either get 1 mark or 0 marks for each question (there are 13 questions on this quiz hence this quiz is worth 13 marks in total). The <i>only</i> application that is to be running on your computer is your <b>IDE</b> (until you are ready to submit your quiz). When you are ready to submit your quiz, please share it on <b>github</b> and ensure that all of your work has been <b>pushed</b> to your repository. Double check this by <b>confirming</b> that your <b>completed</b> classes exist in your repository on <b>github</b>. Submit the <b>link</b> to your repository on <b>Schoology</b>. 

Good luck, have fun! :)

# class Address
1. An Address class will have <b>three</b> instance variables. Ensure that each instance variable is declared as <b>private</b>.
* district (String)
* street (String)
* streetNumber (int)
2. An Address class will have <b>one</b> constructor. 
* The constructor will have <b>three</b> parameters. The three parameters will be used to initialize the three instance variables. 
3. An Address class will have a <b>getter</b> method for each instance variable.
4. An Address class will have a <b>setter</b> method for each instance variable.
5. An Address class will have a <b>toString</b> method that returns, for example, a String in the following format:
* "180 Tung Lo Wan Road, Causeway Bay"
# class Student
1. A Student class will have <b>five</b> instance variables. Ensure that each instance variable is declared as <b>private</b>.
* age (int)
* firstName (String)
* lastName (String)
* year (int)
* address (Address)
2. A Student class will have <b>one</b> constructor.
* The constructor will have <b>five</b> parameters. The five parameters will be used to initialize the five instance variables. 
3. A Student class will have a <b>getter</b> method for each instance variable.
4. A Student class will have a <b>setter</b> method for each instance variable.
5. A Student class will have a <b>private</b> method called <b>addOneAge</b> that is parameterless and increments the age of the Student.
6. A Student class will have a method called <b>birthday</b> that <b>calls addOneAge</b> and <b>returns the age</b> of the Student.
7. A Student class will have a <b>toString</b> method that returns, for example, a String in the following format:
* "Belinda Yu, age 17, year 12, 180 Tung Lo Wan Road, Causeway Bay"
# class StudentMaker
Inside the main method …
1. Create an <b>Address</b> object. The reference to this Address object should be called <b>address</b>. The district should be Causeway Bay, street Tung Lo Wan Road, and street number 180.
2. Create a <b>Student</b> object. The reference to this Student object should be called <b>student</b>. The Student’s name should be Belinda Yu, age 17, year 12, address 180 Tung Lo Wan Road, Causeway Bay. This should be done in a <b>single</b> statement.
3. Use a <b>setter</b> method to change the Student's first name from Belinda to Bella.
4. Use a <b>getter</b> method and print statement to print out the age of Bella. Print out the age only, and use the println method to print. Do this using a single statement.
5. Call the <b>birthday</b> method and store this into a variable called <b>age</b>.
6. Print out the contents of the variable called <b>age</b>. Use the <b>println</b> method to print.
7. Print out the <b>current state</b> of the Student object. That is, print the <b>reference</b> to the Student object. This will automatically call the toString method.
