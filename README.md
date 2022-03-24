Previous step: OCP-1 https://github.com/olgakushakova/solid-example/tree/OCP-1

**SOLID principle to demonstrate: OCP**

Changes from the previous step:
- Inheritance added: `CalculatePaintingArea` and `CalculateTileArea` now inherit `CalculateArea` and can use all fields and methods of the base class. This leads to storing formulas in one class `CalculateArea` and two other calculations classes can just use its methods
- New formula to calculate triangle area is used. But it is still needed to fix high level class `CalculateArea` in case if such changes are implemented, OCP principle continues to be violated :( 