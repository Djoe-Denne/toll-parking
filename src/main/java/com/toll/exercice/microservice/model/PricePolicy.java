package com.toll.exercice.microservice.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "POLICY_TYPE")
public abstract class PricePolicy {
    @Id
    @GeneratedValue
    protected int id;

    public abstract void fillBilling(Billing billing);
}