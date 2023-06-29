package Sem6_HW_LapTop;

import java.util.Objects;

public class LapTop {
    private String brand;
    private String operationalSysytem;
    private Integer monitorSize;
    private Integer ram;

    public LapTop(String brand, String operationalSysytem, int monitorSize, int ram) {
        this.brand = brand;
        this.operationalSysytem = operationalSysytem;
        this.monitorSize = monitorSize;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("brand: %s, operation system: %s, monitor size: %d, RAM: %d \n" , brand,operationalSysytem,monitorSize, ram);
//        return "LapTop{" +
//                "brand='" + brand + '\'' +
//                ", operationalSysytem='" + operationalSysytem + '\'' +
//                ", monitorSize=" + monitorSize +
//                ", ram=" + ram +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LapTop lapTop = (LapTop) o;
        return monitorSize == lapTop.monitorSize && ram == lapTop.ram && Objects.equals(brand, lapTop.brand) && Objects.equals(operationalSysytem, lapTop.operationalSysytem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, operationalSysytem, monitorSize, ram);
    }

    public String getBrand() {
        return brand;
    }

    public String getOperationalSysytem() {
        return operationalSysytem;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public int getRam() {
        return ram;
    }


}

