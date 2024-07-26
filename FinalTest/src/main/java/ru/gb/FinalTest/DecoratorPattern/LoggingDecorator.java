package ru.gb.FinalTest.DecoratorPattern;

public class LoggingDecorator implements DataService {
    private final DataService delegate;

    public LoggingDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void fetchData() {
        delegate.fetchData();
    }
}
