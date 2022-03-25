Previous step: DIP-1 https://github.com/olgakushakova/solid-example/tree/DIP-1

**SOLID principle to demonstrate: DIP**

Changes from the previous step:
- Interfaces are used to get rid of dependency on particular logic

*Final state of the application:*

There are three main modules to cover three parts of the system functionality: `input` -> `calculations` -> `output`. Each of them has their own responsibilities and also provides abstractions to communicate to each other and build dependencies on