package com.prime_number_generator.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.prime_number_generator.service.PrimeGenerationService;

@CrossOrigin("*")
@RestController
public class PrimeController {

	@Autowired
    private final PrimeGenerationService primeGenerationService;

    @Autowired
    public PrimeController(PrimeGenerationService primeGenerationService) {
        this.primeGenerationService = primeGenerationService;
    }

    @GetMapping("/primes/{strategy}")
    public ResponseEntity<List<Integer>> generatePrimes(
            @PathVariable String strategy,
            @RequestParam int start,
            @RequestParam int end) {

        // Logic to generate prime numbers based on the selected strategy
        List<Integer> primes;
        if ("basic".equals(strategy)) {
            primes = primeGenerationService.generatePrimesBasic(start, end);
        } else if ("sieve".equals(strategy)) {
            primes = primeGenerationService.generatePrimesSieve(start, end);
        } else {
            return ResponseEntity.badRequest().body(null); // Invalid strategy
        }

        // Optionally, you can also save the generated prime numbers to the database here

        return ResponseEntity.ok(primes);
    }
}
