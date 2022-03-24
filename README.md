Previous step: LSP-2 https://github.com/olgakushakova/solid-example/tree/LSP-2

**SOLID principle to demonstrate: ISP**

Changes from the previous step:
- New package `output` is created. It contains `Process Result` big interface with several methods and three classes to implement it. The problem is none of these classes use all methods from the interface. There are a lot of methods with `return null` signature which is a bad practice