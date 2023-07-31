package calculatorProject;

public class Calculator {

    private double add;
    private double subtract;
    private double multiply;
    private double division;


    public Calculator(double add, double subtract, double multiply, double division) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.division = division;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public double getSubtract() {
        return subtract;
    }

    public void setSubtract(double subtract) {
        this.subtract = subtract;
    }

    public double getMultiply() {
        return multiply;
    }

    public void setMultiply(double multiply) {
        this.multiply = multiply;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "add=" + add +
                ", subtract=" + subtract +
                ", multiply=" + multiply +
                ", division=" + division +
                '}';
    }
}
