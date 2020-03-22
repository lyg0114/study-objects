package com.johngrib.objects._06_refactoring_01;

import lombok.Getter;

/** 관람객. */
public class Audience {
  @Getter
  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public long setTicket(Ticket ticket) {
    return bag.setTicket(ticket);
  }
}
