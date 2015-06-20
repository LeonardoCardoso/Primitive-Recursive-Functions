# Primitive-Recursive-Functions
A class with the common Math operations using recursion using Natural Numbers &#8469;.


Sum (Addition)
----
Function:
>sum(x, y)
    
Rules:
>sum(x, 0) = x
>
>sum(x, y + 1) = sum(x, y) + 1


Multiplication
----
Function:
>mult(x, y)
    
Rules:
>mult(x, 0) = x
>
>mult(x, y + 1) = mult(x, y) + x


Predecessor
----
Function:
>pred(y)
    
Rules:
>pred(0) = 0
>
>pred(y + 1) = y


Subtraction
----
Function:
>sub(x, y)
    
Rules:
>sub(x, 0) = x
>
>sub(x, y + 1) = pred(sub(x, y))


Exponentiation
----
Function:
>exp(x, y)
    
Rules:
>exp(x, 0) = 1
>
>exp(x, y + 1) = mult(exp(x, y), x)


Signal
----
Function:
>sg(x)
    
Rules:
>sg(0) = 0
>
>sg(y + 1) = 1


Signal Complement
----
Function:
>cosg(x)
    
Rules:
>cosg(0) = 1
>
>cosg(y + 1) = 0


Greater Than
----
Function:
>gt(x, y)
    
Rules:
>gt(x, x) = 0
>
>gt(x, y) = sg(sub(x, y)


Less Than
----
Function:
>lt(x, y)
    
Rules:
>lt(x, x) = 0
>
>lt(x, y) = cosg(sub(x, y)