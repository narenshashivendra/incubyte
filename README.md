# incubyte
# String Calculator TDD Kata

# Requirement 1: Create a simple String calculator with a method signature:
             int Add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.
For example "" or "1" or "1,2" as inputs. (for an empty string it will return 0)

Answer: 
Java Implementation & Java Test:
![image](https://user-images.githubusercontent.com/72397494/161413265-a42faf56-5eab-4cdd-8f34-7598155d9044.png)

![image](https://user-images.githubusercontent.com/72397494/161413277-f29a004b-d752-43e7-93f7-2863d05acd70.png)


# Requirement 1.1: For an empty string it will return 0
Java Implementation & Java Test:
![image](https://user-images.githubusercontent.com/72397494/161413331-9e12b37a-8be5-43c5-871b-d45a667a5d18.png)
![image](https://user-images.githubusercontent.com/72397494/161413344-9c0884ee-db9d-4610-bce0-a4b0ef384696.png)

# Requirement 1.2: Method will return sum 
Java Implementation & Java Test
![image](https://user-images.githubusercontent.com/72397494/161413369-9e07445c-1c20-484e-9f3a-7166de09002c.png)
![image](https://user-images.githubusercontent.com/72397494/161413374-ecd7d6f9-be29-406f-b982-41a47d030c82.png)

# Requirement 2: Allow the Add method to handle an unknown amount of numbers
The following input is ok: "1\n2,3" (will equal 6)
The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

Answer:
Java Implementation & Java Test:
![image](https://user-images.githubusercontent.com/72397494/161413410-78cc8302-7942-487f-9855-8b2f99af6e03.png)
![image](https://user-images.githubusercontent.com/72397494/161413433-c0d5e341-e822-414a-b7a1-7d4a7828dc06.png)

# Requirement 3: Allow the Add method to handle new lines between numbers (instead of commas).
The following input is ok: "1\n2,3" (will equal 6)
The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

Answer:
Java Implementation & Java test
![image](https://user-images.githubusercontent.com/72397494/161413819-2b3eaede-f5cc-4b4c-87b3-b0c102a8696c.png)
![image](https://user-images.githubusercontent.com/72397494/161413836-09481ec3-8b86-40a8-8ad4-f7d4af0daf10.png)

# Requirement 4: Support different delimiters
To change a delimiter, the beginning of the string will contain a separate line that looks like this:
"//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"
The first line is optional. all existing scenarios should still be supported

Answer:
Java Implementation & Java Test
![image](https://user-images.githubusercontent.com/72397494/161413657-fba2e868-e52b-4216-8a41-d57544e3c575.png)
![image](https://user-images.githubusercontent.com/72397494/161413665-54d4f033-b975-4701-849f-a7ceefebfc53.png)

# Requirement 5: Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.
If there are multiple negatives, show all of them in the exception message.
Answer:
Java Implementation & Java test
![image](https://user-images.githubusercontent.com/72397494/161413483-2f9ca15d-bbfc-437b-b266-bd11d76b2836.png)
![image](https://user-images.githubusercontent.com/72397494/161413505-4bfdfe54-f9d9-4839-afbd-b739a109781a.png)

