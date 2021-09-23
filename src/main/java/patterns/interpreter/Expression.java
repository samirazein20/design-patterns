package patterns.interpreter;

public interface Expression {
    String interpret(InterpreterContext ic);
}
