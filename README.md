# Year-11-CS-Unit-6-Quiz-Student

Ensure that you read all instructions carefully. Do not include any additional variables or methods that are not specified in this quiz description. Each question is worth one mark and is binary. That is, you either get 1 mark or 0 marks for each question (there are 19 questions on this quiz hence this quiz is worth 19 marks in total). The only application that is to be running on your computer is your IDE (until you are ready to submit your quiz). When you are ready to submit your quiz, please share it on github and ensure that all of your work has been pushed to your repository. Double check this by confirming that your completed classes exist in your repository on github. Submit the link to your repository on Schoology.
Good luck, have fun! :)

# class Address
1. An Address class will have three instance variables. Ensure that each instance variable is declared as private.
* district (String)
* street (String)
* streetNumber (int)
2. An Address class will have one constructor. 
* The constructor will have three parameters. The three parameters will be used to initialize the three instance variables. 
3. An Address class will have a getter method for each instance variable.
4. An Address class will have a setter method for each instance variable.
5. An Address class will have a toString method that returns, for example, a String in the following format:
* "180 Tung Lo Wan Road, Causeway Bay"
# class Student
1. A Student class will have five instance variables. Ensure that each instance variable is declared as private.
* age (int)
* firstName (String)
* lastName (String)
* year (int)
* address (Address)
2. A Student class will have one constructor.
* The constructor will have five parameters. The five parameters will be used to initialize the five instance variables. 
3. A Student class will have a getter method for each instance variable.
4. A Student class will have a setter method for each instance variable.
5. A Student class will have a private method called addOneAge that is parameterless and increments the age of the Student.
6. A Student class will have a method called birthday that calls addOneAge and returns the age of the Student.
7. A Student class will have a toString method that returns, for example, a String in the following format:
* "Belinda Yu, age 17, year 12, 180 Tung Lo Wan Road, Causeway Bay"
# class StudentMaker
Inside the main method …
1. Create an Address object. The reference to this Address object should be called address. The district should be Causeway Bay, street Tung Lo Wan Road, street number 180.
2. Create a Student object. The reference to this Student object should be called student. The Student’s name should be Belinda Yu, age 17, year 12, address 180 Tung Lo Wan Road, Causeway Bay. This should be done in a single statement.
3. Use a setter method to change the Student's first name from Belinda to Bella.
4. Use a getter method and print statement to print out the age of Bella. Print out the age only, and use the println method to print. Do this using a single statement.
5. Call the birthday method and store this into a variable called age.
6. Print out the contents of the variable called age. Use the println method to print.
7. Print out the current state of the Student object. That is, print the reference to the Student object. This will automatically call the toString method.
