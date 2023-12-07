package com.example.fractionspringjava.services;

import com.example.fractionspringjava.models.Fraction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FractionServiceImpl implements FractionService{
    @Override
    public Boolean isCorrectFraction(Fraction fraction) {

        return fraction.getAnInteger() * fraction.getDenominator() + fraction.getNumerator() <= fraction.getDenominator();
    }

    @Override
    public Fraction reductionFraction(Fraction fraction) {
return null;
    }

    @Override
    public Fraction additionFractions(Fraction leftOperand, Fraction rightOperand) {
        return null;
    }

    @Override
    public Fraction subtractionFractions(Fraction leftOperand, Fraction rightOperand) {
        return null;
    }

    @Override
    public Fraction multiplicationFractions(Fraction leftOperand, Fraction rightOperand) {
        return null;
    }

    @Override
    public Fraction divisionFractions(Fraction leftOperand, Fraction rightOperand) {
        return null;
    }
}
