Previous step: SRP-1 https://github.com/olgakushakova/solid-example/tree/SRP-1

**SOLID principle to demonstrate: OCP**

Current state of the project:
- Each `Calculate...` class contains formulas to calculate area of figures, which leads to the changes in all three classes if we would decide to use a new formula for a triangle for example. It is also required to get figure type from user input and call corresponding method for every figure