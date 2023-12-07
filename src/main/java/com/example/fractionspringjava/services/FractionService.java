package com.example.fractionspringjava.services;

import com.example.fractionspringjava.models.Fraction;

public interface FractionService {
    Boolean isCorrectFraction(Fraction fraction);
    Fraction reductionFraction(Fraction fraction);
    Fraction  additionFractions(Fraction leftOperand, Fraction rightOperand);
    Fraction  subtractionFractions(Fraction leftOperand, Fraction rightOperand);
    Fraction  multiplicationFractions(Fraction leftOperand, Fraction rightOperand);
    Fraction  divisionFractions(Fraction leftOperand, Fraction rightOperand);
}