package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

  private String city;
  private String street;
  private String zipcode;

  public String getCity() {
    return city;
  }

  private void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  private void setStreet(String street) {
    this.street = street;
  }

  public String getZipcode() {
    return zipcode;
  }

  private void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Address address = (Address) o;

    if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
    if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
    return getZipcode() != null ? getZipcode().equals(address.getZipcode()) : address.getZipcode() == null;
  }

  @Override
  public int hashCode() {
    int result = getCity() != null ? getCity().hashCode() : 0;
    result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
    result = 31 * result + (getZipcode() != null ? getZipcode().hashCode() : 0);
    return result;
  }
}
