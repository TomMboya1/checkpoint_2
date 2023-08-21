class circle extends shapes{
    private double radius;
    public circle (double radius){
        this.radius= radius;
    }

    public double calculateArea() {
        return math.pi*radius*radius
    }


}