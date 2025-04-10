package LLDCaseStudies.ParkingLot;

import LLDCaseStudies.ParkingLot.enums.GateType;
import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        ParkingLot parkingLot =
                new ParkingLot("123 Baker Street", 200);
        List<Gate> gates = new ArrayList<>();
        List<Floor> floors = new ArrayList<>();

        Operator entryGateOperator = new Operator("Akash", 123, 32);
        Operator exitGateOperator = new Operator("Atul", 124, 35);

        gates.add(new Gate("1A", entryGateOperator, GateType.ENTRY));
        gates.add(new Gate("2A", exitGateOperator, GateType.EXIT));

        floors.add(new Floor("0", Status.VACANT));
        floors.add(new Floor("1", Status.VACANT));
        floors.add(new Floor("2", Status.VACANT));
        floors.add(new Floor("3", Status.VACANT));

        parkingLot.setGates(gates);
        parkingLot.setFloors(floors);





    }
}
