package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;
    private Boolean clean;

    public Chair(String material, String color, int legs, Boolean clean) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.clean = clean;
    }

    public boolean getClean(){
        return clean;
    }

    public boolean setClean(Boolean clean){
        return clean = clean;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
