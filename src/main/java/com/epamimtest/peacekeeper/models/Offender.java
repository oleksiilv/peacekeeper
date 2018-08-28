package com.epamimtest.peacekeeper.models;

import javax.persistence.*;

@Entity
public class Offender {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable=false)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private RiskLevel riskLevel;

    public Offender() {}

    public Offender(String name) {
        this.name = name;
        this.riskLevel = RiskLevel.LOW;
    }

    public Offender(String name, RiskLevel riskLevel) {
        this.name = name;
        this.riskLevel = riskLevel;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return String.format(
                "Offender[id=%d, name='%s', riskLevel='%s']",
                this.getId(), this.getName(), this.getRiskLevel());
    }
}
