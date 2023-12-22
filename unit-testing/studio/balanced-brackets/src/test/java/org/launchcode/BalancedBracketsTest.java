package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void invertedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void balancedBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[baba booey]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsInMiddleOfStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Laun[chCo]de"));
    }

    @Test
    public void invertedBracketsInMiddleOfStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Laun]chCo[de"));
    }

    @Test
    public void multiplePairsOfBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void multiplePairsOfNestedBracketsReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void multiplePairsOfMixedUpBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]"));
    }

    @Test
    public void largeAmountOfNestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[]]]]]]]]]]"));
    }

    @Test
    public void wrongTypeOfBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void twoDifferentTypesOfBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void randomBracketsWithCorrectBracketsInTheMiddleReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{())(()([()())(){}{}{}{}]{}{}{}{}"));
    }
}