import java.util.Objects;

public class Smartphone extends Product {

    protected String Manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        Manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

   @Override
  public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;
     Smartphone that = (Smartphone) o;
      return Objects.equals(Manufacturer, that.Manufacturer);
   }

   @Override
  public int hashCode() {
    return Objects.hash(Manufacturer);
    }
}
