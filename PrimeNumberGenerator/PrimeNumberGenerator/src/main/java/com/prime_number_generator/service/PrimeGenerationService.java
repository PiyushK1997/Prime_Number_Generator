package com.prime_number_generator.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prime_number_generator.model.PrimeGenerationRecord;
import com.prime_number_generator.repository.UserRepository;

@Service
public class PrimeGenerationService {

	@Autowired
	private UserRepository userRepository;

	public List<Integer> generatePrimesBasic(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<>();
		for (int num = start; num <= end; num++) {
			if (isPrime(num)) {
				primes.add(num);
			}
		}
		saveUser(start, end, "basic", primes.size());
		return primes;
	}

	public List<Integer> generatePrimesSieve(int start, int end) {
		boolean[] isPrime = new boolean[end + 1];
		for (int i = 2; i <= end; i++) {
			isPrime[i] = true;
		}

		for (int p = 2; p * p <= end; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= end; i += p) {
					isPrime[i] = false;
				}
			}
		}

		List<Integer> primes = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		saveUser(start, end, "sieve", primes.size());
		return primes;
	}

	private boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private void saveUser(int start, int end, String strategy, int numberOfPrimes) {
		PrimeGenerationRecord priRecord = new PrimeGenerationRecord();
		priRecord.setStart(start);
		priRecord.setEnd(end);
		priRecord.setStrategy(strategy);
		priRecord.setNumberOfPrimes(numberOfPrimes);
		userRepository.save(priRecord);
	}
}
