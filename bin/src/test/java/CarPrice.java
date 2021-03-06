import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

public class CarPrice {

  example.model.Car car;

  @When("^Car created$")
  public void createCar() {
     example.service.CarService service = new example.service.CarServiceImpl();
     car = service.createCar();
  }

  @Then("^Car price should be 0$")
  public void checkPrice() {
     Assertions.assertEquals(car.getPrice(), 0);
  }
}
