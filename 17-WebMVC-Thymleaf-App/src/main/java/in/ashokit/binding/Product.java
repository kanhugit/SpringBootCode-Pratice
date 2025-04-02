package in.ashokit.binding;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {

    @NotNull(message = "Product ID is required")
    private Integer pid;

    @NotEmpty(message = "Product name is required")
    @Size(min = 3, max = 9, message = "Product name must be between 3 and 9 characters")
    private String pname;

    @NotNull(message = "Product price is required")
    private Double price;

    // Getters & Setters
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }
}
