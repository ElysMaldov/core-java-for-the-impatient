package ch01.sec01;

import java.util.random.RandomGenerator;

public class RandomNumber {
  public static void main(String[] args) {
    // var abc = new Random();
    RandomGenerator generator = RandomGenerator.getDefault();

    System.out.println(generator.nextInt());
    System.out.println(generator.nextInt());
    System.out.println(generator.nextInt());
  }
}
