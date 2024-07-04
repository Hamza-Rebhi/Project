package com.hamza.api;

/**
 *
 * The subscriber API
 *
 */
public interface Subscriber {

    /**
     * Execute event
     * @param event published event
     */
    void execute(Object event);

}
