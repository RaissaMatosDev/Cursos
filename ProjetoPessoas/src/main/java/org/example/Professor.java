package org.example;


public class Professor extends Pessoa {
    private String esp;
    private Float sal;


    private void ReceberAumento(Float aum) {
        this.sal += aum;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public Float getSal() {
        return sal;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }
}
