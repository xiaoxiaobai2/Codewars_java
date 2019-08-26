package sorted;

public class Goods {
    private String name;
    private int fav;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods(String name, int fav, double price) {
        this.name = name;
        this.fav = fav;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("商品名：").append(this.name).append(",")
                .append("价格：").append(this.price).append(",")
                .append("点击量").append(this.fav).append("\n");

        return sb.toString();
    }
}
