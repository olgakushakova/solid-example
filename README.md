Previous step: OCP-2 https://github.com/olgakushakova/solid-example/tree/OCP-2

**SOLID principle to demonstrate: OCP**

Changes from the previous step:
- Formulas to calculate figures areas are now included in figures classes to keep all figures fields and methods at the same place. It's now obvious that formulas can be changed at one place and also some new formulas for example to calculate volume should be added there.
- `Figure` is no more just enum, it becomes a separate data object to be used in `CalculateArea` interface
- `CalculateArea` interface is created to interact with other parts of the system and represent the main logic - `calculateArea` that take figure as an argument
- `Main` now contains creating of the particular calculation instance to implement interface based on the user input

In case new calculation type should be added, new `Calculate...` class would be created and its instance can be used in a client code