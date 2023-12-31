package fop.w9store;

public class Screw {
    private final double diameter;
    private final double length;
    private double price;
    private final ScrewDrive head;

    public Screw(ScrewDrive head,double diameter, double length, double price ) {
        this.head = head;
        this.diameter = diameter;
        this.length = length;
        this.price = price;

    }

    @Override
    public int hashCode() {
        return head.hashCode() + 7 * Double.hashCode(diameter)
                + 49 * Double.hashCode(length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }else if(obj == null || obj.getClass() != this.getClass())
            return false;
        else {
            Screw temp = (Screw) obj;
            return this.getHead().toString().equals(temp.getHead().toString());
        }
    }

    public ScrewDrive getHead() {
        return head;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     @Override
    public String toString() {
        return "Screw [head= " + head + ", diameter= " + diameter + ", length= "
                + length + ", price= " + price + "]";
    }
}
