import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;

public class CarModel {
  @Then("{car} model should be 'test'")
  public void checkModel(Car car) {
     Assertions.assertEquals(car.getModel(), "test");
  }
}
