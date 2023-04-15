public class Worker {
    private String workerID;
    private int shift;
    private double hoursWorked;
    private final double SHIFT1_RATE = 17.0;
    private final double SHIFT2_RATE = 18.5;
    private final double SHIFT3_RATE = 22.0;

    // Constructor for Worker
    public Worker() {
        workerID = "XXX";
        shift = 1;
        hoursWorked = 0.0;
    }

    public Worker(String workerID, int shift, double hoursWorked) {
        this.workerID = workerID;
        this.shift = shift;
        this.hoursWorked = hoursWorked;
    }

    // Setter methods
    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getter methods
    public String getWorkerID() {
        return workerID;
    }

    public int getShift() {
        return shift;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Method to calculate gross pay
    public double calculateGrossPay() {
        double rate;
        switch (shift) {
            case 2:
                rate = SHIFT2_RATE;
                break;
            case 3:
                rate = SHIFT3_RATE;
                break;
            default:
                rate = SHIFT1_RATE;
        }
        double grossPay;
        if (hoursWorked > 40) {
            grossPay = (40 * rate) + ((hoursWorked - 40) * rate * 1.5);
        } else {
            grossPay = hoursWorked * rate;
        }
        return grossPay;
    }

    // Method to calculate overtime pay
    public double calculateOvertimePay() {
        double rate;
        switch (shift) {
            case 2:
                rate = SHIFT2_RATE;
                break;
            case 3:
                rate = SHIFT3_RATE;
                break;
            default:
                rate = SHIFT1_RATE;
        }
        double overtimePay;
        if (hoursWorked > 40) {
            overtimePay = (hoursWorked - 40) * rate * 0.5;
        } else {
            overtimePay = 0.0;
        }
        return overtimePay;
    }

    // Method to calculate retirement deduction
    public double calculateRetirement() {
        double grossPay = calculateGrossPay();
        if (shift == 2 || shift == 3) {
            return grossPay * 0.03;
        } else {
            return 0.0;
        }
    }

    // Method to calculate net pay
    public double calculateNetPay() {
        double grossPay = calculateGrossPay();
        double retirement = calculateRetirement();
        return grossPay - retirement;
    }
}
