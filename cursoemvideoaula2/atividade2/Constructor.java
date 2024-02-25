package cursoemvideoaula2.atividade2;

public class Constructor {
    private String name;
    private int amoutStock;
    private float price;
    
    public Constructor(String name, int amoutStock, float price) {
    this.name = name;
    this.amoutStock = amoutStock;
    this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmoutStock() {
        return amoutStock;
    }

    public void setAmoutStock(int amoutStock) {
        this.amoutStock = amoutStock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
}
