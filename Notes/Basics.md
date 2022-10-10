Introduction
- `Every Java program has a class name`
- `The class name of a program must match the filename`
- `And that every program must contain the main() method.`

# Variables are
- `String (inside double qoutes.)`
- `int`
- `float`
- `Boolean`
- `char (single charactors inside single qoutes)`

# Data Types
## These are devided into two chategories;
### Primitive types
Exp - predefined by Java, can be used to call methods to perform operations, always have a value, starts with lowercase latter, size depend on datatype.
- `int - whole number between -2,147,483,648 to 2,147,483,647`
- `boolean - true false`
- `char - single character/letter or ASCII values`
- `float - fractional numbers with 6 to 7 decimal digits`
- `byte - whole numbers from -128 to 127`
- `long -  whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807`
- `double - fractional numbers with 15 decimal digits`
- `short - whole numbers from -32,768 to 32,767`

### None Primitive Types
Exp - defined by dev except for String, cannot be used call certain method to perform operations, their value can be null, starts with uppercase letter, all have the same size.
- `String`
- `Class`
- `Array`

# Type Casting
## There are 2 type of type casting
### Widening  Casting - converts small type to large type.
- `byte -> short -> char -> int -> long -> float -> double`
- `Happens automatically - int x = 8; double y = x`
### Narrowing  Casting - converts large type to small type.
- `double -> float -> long -> int -> char -> short -> byte`
- `Is manually done - double x = 8; int y = (int) x`

# Operators
- `Arithmetic operators`
- `Assignment operators`
- `Comparison operators`
- `Logical operators`
- `Bitwise operators`

# String Methods
- `Check length - String x = "Hello"; x.length();.`
- `Convert case - String x = "Hello"; x.toUpperCase(); x.toLowerCase();`
- `Find charator(s) - String x = "Hello"; x.indefOf('llo');`
- `Concatinate - String x = "Hello"; String y = " Bob"; x.concat(y);`

# Math
- `This give you a random number - int randomNum = Math.random();`

# If Else Shot hand
- `String result = (10 < 18) ? "Good day." : "Good evening.";`

# Switch 
- `Used to avoid many if else statements.`
```
int day = 2
switch(day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  default:
    System.out.println("Wednesday");
    break;
}
```
# While Loop
- `There are 2 type of while loop, while loop an do while`
```
While loop runs the code as long as the condition is true

int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```
```
A do while first run the code then check the condition
  
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

# For Loop
```
Mostly used when you know how many times you want to loop

for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
```

# For-Each Loop
```
"For-each" loop is used exclusively to loop through elements in an array`

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

# Arrays
- `Defined as String[] cars;`
- `With elements - String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};`

# For Loop in an Array
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```

# For Each Loop in an Array
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```