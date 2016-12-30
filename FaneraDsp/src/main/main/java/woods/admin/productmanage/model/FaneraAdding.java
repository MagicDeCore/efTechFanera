package woods.admin.productmanage.model;

import javax.persistence.*;

/**
 * Created by MagicDeCore on 26.12.2016.
 */


@Entity
@Table(name = "fanera")
public class FaneraAdding {

    public FaneraAdding(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "faneraname")
    private String faneraName;

    @Column(name = "size_format")
    private String sizeFormat;

    @Column(name = "depth")
    private String depth;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "water_resistance")
    private String water_resistance;

    @Column(name = "wetness")
    private String wetness;

    @Column(name = "material")
    private String material;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFaneraName() {
        return faneraName;
    }

    public void setFaneraName(String faneraName) {
        this.faneraName = faneraName;
    }

    public String getSizeFormat() {
        return sizeFormat;
    }

    public void setSizeFormat(String sizeFormat) {
        this.sizeFormat = sizeFormat;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getWater_resistance() {
        return water_resistance;
    }

    public void setWater_resistance(String water_resistance) {
        this.water_resistance = water_resistance;
    }

    public String getWetness() {
        return wetness;
    }

    public void setWetness(String wetness) {
        this.wetness = wetness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
