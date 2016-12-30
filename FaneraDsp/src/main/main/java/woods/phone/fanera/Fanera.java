package woods.phone.fanera;

import woods.phone.phoneshopcart.ShopProduct;

/**
 * Created by MagicDeCore on 01.12.2016.
 */
public class Fanera implements ShopProduct{



    int id;
    String faneraname;
    String size_format;
    String depth;
    String treatment;
    String water_resistance;
    String wetness;
    String material;
    Byte image;
    String description;


    public Fanera(){
    }

    protected Fanera(int id, String faneraname, String size_format, String depth, String treatment, String water_resistance, String wetness,
                     String material, Byte image, String description){

        this.id = id;
        this.faneraname = faneraname;
        this.size_format = size_format;
        this.depth = depth;
        this.treatment = treatment;
        this.water_resistance = water_resistance;
        this.wetness = wetness;
        this.material = material;
        this.image = image;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    @Override
    public String getModel() {
        return faneraname;
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getPhoto1() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaneraName() {
        return faneraname;
    }

    public void setName(String name) {
        this.faneraname = name;
    }

    public String getSize_format() {
        return size_format;
    }

    public void setSize_format(String size_format) {
        this.size_format = size_format;
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

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
