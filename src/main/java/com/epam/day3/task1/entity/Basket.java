package com.epam.day3.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
  private List<Ball> balls=new ArrayList<>();
  public void addBall(Ball ball) {
      balls.add(ball);
  }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }
}
