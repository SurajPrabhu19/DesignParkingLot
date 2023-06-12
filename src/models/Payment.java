package models;

import java.util.Date;

public class Payment {
    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private Date timeOfPayment;

    private Payment payment;
    private Invoice invoice;
}
