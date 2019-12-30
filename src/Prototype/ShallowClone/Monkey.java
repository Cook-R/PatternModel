package Prototype.ShallowClone;

import java.util.Date;

public class Monkey implements Cloneable {
    private int height;
    private int weight;
    private Date birthday;
    private GoldRingedStaff grsf;

    public Monkey() {
        this.birthday = new Date();
        this.grsf = new GoldRingedStaff();
    }

    @Override
    public Object clone() {
        Monkey tmep = null;
        try {
            tmep=(Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return tmep;
        }

    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GoldRingedStaff getGrsf() {
        return grsf;
    }

    public void setGrsf(GoldRingedStaff grsf) {
        this.grsf = grsf;
    }
}
