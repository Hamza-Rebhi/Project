package com.hamza.core;

import com.hamza.api.Subscriber;

import java.util.function.Consumer;


public class DefaultSubscriber implements Subscriber {
    private Consumer<Object> consumer;

    public DefaultSubscriber(Consumer<Object> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void execute(Object event) {
        consumer.accept(event);
    }

}
