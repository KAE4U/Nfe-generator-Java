package model;

public class Imposto {

    private double icms;
    private double ipi;

    public Imposto(double icms, double ipi) {
        this.icms = icms;
        this.ipi = ipi;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi(double ipi) {
        this.ipi = ipi;
    }

    @Override
    public String toString() {
        return "ICMS: " + icms +
                "% | IPI: " + ipi + "%";
    }
}