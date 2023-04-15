import javax.swing.JOptionPane;

public class WorkerTest {
    public static void main(String[] args) {
        String workerID = "";
        int shift = 0;
        double hoursWorked = 0.0;
        double totalNetPay = 0.0;
        int numWorkers = 0;
        double maxNetPay = Double.MIN_VALUE;
        String maxNetPayWorkerID = "";

        while (true) {
            // Enter Worker ID
            workerID = JOptionPane.showInputDialog("Enter Worker ID (or END to finish):");

            if (workerID.equals("END")) {
                break;
            }

            // Enter Shift
            boolean validShift = false;
            while (!validShift) {
                String shiftString = JOptionPane.showInputDialog("Enter Shift (1, 2, or 3):");
                try {
                    shift = Integer.parseInt(shiftString);
                    if (shift == 1 || shift == 2 || shift == 3) {
                        validShift = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Shift. Please enter 1, 2, or 3.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Shift. Please enter 1, 2, or 3.");
                }
            }

            // Enter Hours Worked
            boolean validHoursWorked = false;
            while (!validHoursWorked) {
                String hoursWorkedString = JOptionPane.showInputDialog("Enter Hours Worked:");
                try {
                    hoursWorked = Double.parseDouble(hoursWorkedString);
                    if (hoursWorked > 0.0) {
                        validHoursWorked = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Hours Worked must be a positive value.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Hours Worked. Please enter a number.");
                }
            }

            // Calculate Gross Pay
            Worker worker = new Worker(workerID, shift, hoursWorked);
            double grossPay = worker.calculateGrossPay();

            // Calculate Overtime Pay
            double overtimePay = worker.calculateOvertimePay();

            // Calculate Retirement Deduction
            double retirementDeduction = worker.calculateRetirement();

            // Calculate Net Pay
            double netPay = grossPay + overtimePay - retirementDeduction;

            // Display Worker Information
            JOptionPane.showMessageDialog(null, String.format(
                "The worker %s had a gross pay of $%.2f with overtime of $%.2f and retirement plan of $%.2f. The Net Pay = $%.2f",
                workerID, grossPay, overtimePay, retirementDeduction, netPay
            ));

            // Update Totals
            totalNetPay += netPay;
            numWorkers++;
            if (netPay > maxNetPay) {
                maxNetPay = netPay;
                maxNetPayWorkerID = workerID;
            }
        }

        // Display Totals
        JOptionPane.showMessageDialog(null, String.format(
            "Total Net Pay: $%.2f\n" +
            "Maximum Net Pay: $%.2f (Worker %s)\n" +
            "Number of Workers: %d\n" +
            "Average Net Pay: $%.2f",
            totalNetPay, maxNetPay, maxNetPayWorkerID, numWorkers, totalNetPay / numWorkers
        ));
    }
}
