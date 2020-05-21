package pl.pogos.coverage;

public class SimpleFacade {

    public double add(double a, double b) {
        return new SumCalculator().add(a, b);
    }


    public double multiple(double a, double b) {
        return new MultipleCalculator().multiple(a, b);
    }

}
