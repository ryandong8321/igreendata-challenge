package indi.ryan.igreendatachallenge.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import indi.ryan.igreendatachallenge.enums.PaymentType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "transaction_info")
public class TransactionInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountName;
    private String bsb;
    private String accountNumber;
    private Double amount;
    private String description;
    private String paidBy;
    private Date date;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    @JsonIgnore
    private Account accountDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBsb() {
        return bsb;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Account getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(Account accountDetail) {
        this.accountDetail = accountDetail;
    }

    @Override
    public String toString() {
        return "TransactionInfo{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", bsb='" + bsb + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", paidBy='" + paidBy + '\'' +
                ", date=" + date +
                ", paymentType=" + paymentType +
                '}';
    }
}
