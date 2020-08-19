package tech.vlab.gridviewwithimage;

public class PhoTo {
    private String name;
    private int img;

    public PhoTo(String name, int img){
        this.name = name;
        this.img = img;
    }

    public String getName(){
        return name;
    }

    public Integer getPhoto(){
        return img;
    }
}
