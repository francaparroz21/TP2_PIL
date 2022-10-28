public class Dog {
    private String name;
    private int years;

    @Override
    public String toString() {
        return "Name: "+getName()+"\n" +
                "Years: "+getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Dog(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public boolean equals(Dog d){
        return getName().equals(d.getName())&&getYears()==d.getYears();
    }
}