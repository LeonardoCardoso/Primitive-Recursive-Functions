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