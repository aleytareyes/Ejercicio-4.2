
package billing;

public class Billing {
    private Float tax;
    private Float price;
    private Integer quan;
    private Float cupon;
    
    
    public Float computeBill(Float price){
        Float dbt;
        dbt=this.price + ((this.price*(int)8)/100);
        return dbt;
    }
    public Float computeBill(Float price, Integer quan){
        Float dbt;
        dbt=(this.price*this.quan) + ((this.price*(int)8)/100);
        return dbt;
    }
    public Float computeBill(Float price, Integer quan, Float cupon){
        Float dbt;
        dbt=(this.price*this.quan)-((float)this.cupon);
        dbt=dbt + ((this.price*(int)8)/100);
        return dbt;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuan() {
        return quan;
    }

    public void setQuan(Integer quan) {
        this.quan = quan;
    }

    public Float getCupon() {
        return cupon;
    }

    public void setCupon(Float cupon) {
        this.cupon = cupon;
    }
    
    
    
}
