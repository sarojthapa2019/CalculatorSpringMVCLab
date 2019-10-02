package edu.mum.cs.waa.lab.domain;

public class Calculator {
    private Integer add1;
    private Integer add2;
    private Integer mult1;
    private Integer mult2;
    private String sum;
    private String product;

    public Calculator(){}

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getAdd1() {
        return add1;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return add2;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public Integer getMult1() {
        return mult1;
    }

    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }

    public Integer getMult2() {
        return mult2;
    }

    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }
}
