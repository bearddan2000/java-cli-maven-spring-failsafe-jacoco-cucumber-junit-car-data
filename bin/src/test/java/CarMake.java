import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;

public class CarMake {
  @Then("{car} make should be 'test'")
  public void checkMake(Car car) {
     Assertions.assertEquals(car.getMake(), "test");
  }
}
