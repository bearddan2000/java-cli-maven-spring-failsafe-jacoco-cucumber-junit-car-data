import io.cucumber.java.en.Then;


import org.junit.jupiter.api.Assertions;

import example.model.Car;

public class CarYear {
/*
  example.model.Car car;

  @When("^Car created$")
  public void createCar() {
     example.service.CarService service = new example.service.CarServiceImpl();
     car = service.createCar();
  }
*/
  @Then("{car} year should be 0")
  public void checkYear(Car car) {
     Assertions.assertEquals(car.getYear(), 0);
  }
}
