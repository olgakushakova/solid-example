Previous step: OCP-3 https://github.com/olgakushakova/solid-example/tree/OCP-3

**SOLID principle to demonstrate: LSP**

Changes from the previous step:
- `Rectangle` data object is added to represent new figure type
- `Square` now extends `Rectangle` because we know from the school curriculum that a square is actually a rectangle. But it causes problems in client code as in programming a square is not a rectangle at all. So this inheritance can only be used with additional code changes which looks not good