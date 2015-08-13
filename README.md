# Primitive-Recursive-Functions

Developed by <a href='https://github.com/LeonardoCardoso' target='_blank'>@LeonardoCardoso</a>. 

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
>mult(x, 0) = 0
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


Equal
----
Function:
>eq(x, y)
    
Rules:
>cosg(lt(x, y) + gt(x, y))


Different
----
Function:
>diff(x, y)
    
Rules:
>cosg(eq(x, y))


Predicates
----
A predicate P defines a function p: N x N x N... x N → {0, 1}, named as characteristic function, which computes the values
1 (true) ou 0 (false). Thus, the logical operators ¬(not), &or;(or) and &and;(and) are set up as:


| predicate     	| interpretation 	|
|-----------------	|---------------	|
| cosg(p1)        	| ¬p1           	|
| mult(p1, p2)    	| p1 ∧ p2       	|
| sg(sum(p1, p2)) 	| p1 ∨ p2       	|


## License

    Copyright 2015 Leonardo Cardoso

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
