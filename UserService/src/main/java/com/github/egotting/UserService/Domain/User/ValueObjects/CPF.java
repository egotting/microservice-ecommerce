package com.github.egotting.UserService.Domain.User.ValueObjects;

public class CPF {
    private String value;

    public CPF(String value) {
        if (!Valid(value)) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }
        this.value = NumberFormat(value);
    }

    public Boolean Valid(String value) {
        String cpf = value.replaceAll("[^0-9]", "");
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }

        int[] digits = new int[11];

        for (char i : cpf.toCharArray()) {
            digits[i - '0']++;
        }

        for (int val : digits) {
            if (val > 9) {
                throw new IllegalArgumentException("CPF INVALIDO");
            }
        }

        return true;
    }

    public String NumberFormat(String value) {
        return value.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

}
