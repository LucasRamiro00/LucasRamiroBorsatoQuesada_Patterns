# Design Patterns

Implementação de três Design Patterns, um de cada categoria:

| Categoria      | Pattern          | Pasta                 |
|----------------|------------------|-----------------------|
| Criacional     | Abstract Factory | `src/abstractfactory` |
| Estrutural     | Decorator        | `src/decorator`       |
| Comportamental | Strategy         | `src/strategy`        |

## Como executar

```bash
javac -d out $(find src -name "*.java")
java -cp out abstractfactory.Main
java -cp out decorator.Main
java -cp out strategy.Main
```
