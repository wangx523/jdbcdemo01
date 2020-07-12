package neusoft_pro.entity;

import java.util.Date;

public class OfferPrice {
    private Integer proID;
    private String sku;
    private String title;
    private Integer ofpId;
    private Date StartDate;
    private Date EndDate;
    private double price;
    private String typeCD;

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

    public Integer getOfpId() {
        return ofpId;
    }

    public void setOfpId(Integer ofpId) {
        this.ofpId = ofpId;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeCD() {
        return typeCD;
    }

    public void setTypeCD(String typeCD) {
        this.typeCD = typeCD;
    }

    @Override
    public String toString() {
        return "OfferPrice{" +
                "proID=" + proID +
                ", sku='" + sku + '\'' +
                ", title='" + title + '\'' +
                ", ofpId=" + ofpId +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", price=" + price +
                ", typeCD='" + typeCD + '\'' +
                '}';
    }

    public OfferPrice(Integer proID, String sku, String title, Integer ofpId, Date startDate, Date endDate, double price, String typeCD) {
        this.proID = proID;
        this.sku = sku;
        this.title = title;
        this.ofpId = ofpId;
        StartDate = startDate;
        EndDate = endDate;
        this.price = price;
        this.typeCD = typeCD;


    }
}
