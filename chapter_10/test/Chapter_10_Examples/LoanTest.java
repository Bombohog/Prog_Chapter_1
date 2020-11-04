package Chapter_10_Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    private Loan loan;

    void setup() {
        loan = new Loan(8.25, 1, 120000.95);
    }

    @Test
    void getAnnualInterestRate() {
        setup();
        assertEquals(8.25, loan.getAnnualInterestRate());
    }

    @Test
    void getNumberOfYears() {
        setup();
        assertEquals(1, loan.getNumberOfYears());
    }

    @Test
    void getLoanAmount() {
        setup();
        assertEquals(120000.95, loan.getLoanAmount());
    }

    @Test
    void getLoanDate() {
        assertTrue(false); // denne metode kan ikke testes uden en setter, og det giver ingen mening at ænder på programmet bare for at teste den.
    }

    @Test
    void setAnnualInterestRate() {
        setup();
        loan.setAnnualInterestRate(5);
        assertEquals(5, loan.getAnnualInterestRate());
    }

    @Test
    void setNumberOfYears() {
        setup();
        loan.setNumberOfYears(2);
        assertEquals(2, loan.getNumberOfYears());
    }

    @Test
    void setLoanAmount() {
        setup();
        loan.setLoanAmount(50000);
        assertEquals(50000, loan.getLoanAmount());
    }

    @Test
    void getMonthlyPayment() {
        setup();
        loan.setLoanAmount(1000);
        loan.setAnnualInterestRate(6);
        assertEquals(86.06, loan.getMonthlyPayment(), 0.01);
    }

    @Test
    void getTotalPayment() {
        setup();
        loan.setLoanAmount(1000);
        loan.setAnnualInterestRate(6);
        assertEquals(1032.79, loan.getTotalPayment(), 0.01);
    }
}