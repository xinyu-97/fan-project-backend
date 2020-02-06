package com.example.fanproject.model;

import javax.persistence.*;

@Entity
@Table(name = "fan")
public class Fan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String detail;

    @Column
    private String image;

    @OneToOne
    @JoinColumn(name = "fan_description_id", referencedColumnName = "id")
    private FanDescription fanDescription;

    @OneToOne
    @JoinColumn(name = "fan_technical_detail_id", referencedColumnName = "id")
    private FanTechnicalDetail fanTechnicalDetail;

    @OneToOne
    @JoinColumn(name = "fan_type_id", referencedColumnName = "id")
    private FanType fanType;

    @OneToOne
    @JoinColumn(name = "manufacturer_info_id", referencedColumnName = "id")
    private ManufacturerInfo manufacturerInfo;

    @OneToOne
    @JoinColumn(name = "sales_representative_id", referencedColumnName = "id")
    private SalesRepresentative salesRepresentative;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public FanDescription getFanDescription() {
        return fanDescription;
    }

    public void setFanDescription(FanDescription fanDescription) {
        this.fanDescription = fanDescription;
    }

    public FanTechnicalDetail getFanTechnicalDetail() {
        return fanTechnicalDetail;
    }

    public void setFanTechnicalDetail(FanTechnicalDetail fanTechnicalDetail) {
        this.fanTechnicalDetail = fanTechnicalDetail;
    }

    public FanType getFanType() {
        return fanType;
    }

    public void setFanType(FanType fanType) {
        this.fanType = fanType;
    }

    public ManufacturerInfo getManufacturerInfo() {
        return manufacturerInfo;
    }

    public void setManufacturerInfo(ManufacturerInfo manufacturerInfo) {
        this.manufacturerInfo = manufacturerInfo;
    }

    public SalesRepresentative getSalesRepresentative() {
        return salesRepresentative;
    }

    public void setSalesRepresentative(SalesRepresentative salesRepresentative) {
        this.salesRepresentative = salesRepresentative;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
