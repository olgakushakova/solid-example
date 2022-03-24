Previous step: SRP-1 https://github.com/olgakushakova/solid-example/tree/SRP-1

**SOLID principle to demonstrate: SRP**

Changes from the previous step:
- `Calculate...` classes only contains `if` statements to define what method to use (based on figures types) and formulas to calculate area themselves. Methods now take figures objects as arguments
- code that defines figures parameters based on user input is extracted to UserInteraction class methods
- two packages containing logic are created: `calculations` and `user.interactions`

So calculations and interactions with user are splitted here