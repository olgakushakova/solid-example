Initial state of the project to calculate area of different figures for construction and repearing.

**SOLID principle to demonstrate: SRP**

In `Calculate...` classes not only calculations are done but also user interaction to define figures parameters

Current project structure:
- `models` folder contains all supported figures and also enum Figure which is used for descision making in claculations
- `CalculateArea` class describes simple calculations for all types of figures (contains formulas and code to get figures parameters from user input)
- `CalculatePaintingArea` and `CalculateTileArea` classes contain the same code snippets as `CalculateArea`, with the difference in the use of coefficients for calculating the area with a small margin (for purchasing paint `painting` and tile `tile`)
- `UserInteraction` class is to define what type of calculations user needs and for what type of figure
