package com.github.eventasia.eventstore.event;

public interface EventPublisher {

    void publishEvent(EventasiaMessage eventMessage);
}
