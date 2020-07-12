package neusoft_pro.entity;

public class Pro {
    private Integer proID;
    private String sku;
    private String title;

    public Pro(Integer proID, String sku, String title, double aDouble) {
        this.proID = proID;
        this.sku = sku;
        this.title = title;
    }

    public Integer getProID() {
        return proID;
    }

    public void setProID(Integer proID) {
        this.proID = proID;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Pro{" +
                "proID=" + proID +
                ", sku='" + sku + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
