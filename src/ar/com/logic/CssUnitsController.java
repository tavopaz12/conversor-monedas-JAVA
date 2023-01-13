package ar.com.logic;

public class CssUnitsController {

    public double pxToRem(Double px, Double rootPx) {
        return px / rootPx;
    }

    public double remToPx(Double rem, Double rootPx) {
        return rem * rootPx;
    }
}
