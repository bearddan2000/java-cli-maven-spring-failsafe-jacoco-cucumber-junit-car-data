
import io.cucumber.java.ParameterType;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
public class RunCucumberTest {

  @ParameterType("car")  // regexp
  public example.model.Car car(String all){  // type, name (from method)
    example.service.CarService service = new example.service.CarServiceImpl();
    example.model.Car car = service.createCar();
    return car;       // transformer function
  }
}
