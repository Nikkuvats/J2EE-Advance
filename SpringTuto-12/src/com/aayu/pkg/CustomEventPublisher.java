package com.aayu.pkg;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher publisher;
   
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
      this.publisher = publisher;
   }
   public void publish() {
      CustomerEvent ce = new CustomerEvent(this);
      publisher.publishEvent(ce);
   }
}