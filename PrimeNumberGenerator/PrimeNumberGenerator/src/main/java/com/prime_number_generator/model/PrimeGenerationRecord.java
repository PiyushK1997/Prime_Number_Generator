package com.prime_number_generator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PrimeGenerationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int start;
    private int end;
    private String strategy;
    private int numberOfPrimes;

    // Constructor, getters, and setters
    public PrimeGenerationRecord() {
    }

    public PrimeGenerationRecord(int start, int end, String strategy, int numberOfPrimes) {
        this.start = start;
        this.end = end;
        this.strategy = strategy;
        this.numberOfPrimes = numberOfPrimes;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int getNumberOfPrimes() {
        return numberOfPrimes;
    }

    public void setNumberOfPrimes(int numberOfPrimes) {
        this.numberOfPrimes = numberOfPrimes;
    }
}
