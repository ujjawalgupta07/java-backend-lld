package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.GateType;

public class Gate {

    private String number;
    private Operator operator;
    private GateType gateType;

    public Gate(String number, Operator operator, GateType gateType) {
        this.number = number;
        this.operator = operator;
        this.gateType = gateType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}

