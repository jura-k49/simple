package net.ukr.jura.simple.interfaces_classes;

import net.ukr.jura.simple.base.BaseComponent;

public class EventComponent {
    public int eventSenderId;
    public BaseComponent eventReceiverComponent;
    public EventComponent(int sender, BaseComponent receiver) {
        eventSenderId = sender;
        eventReceiverComponent = receiver;
    }
}
