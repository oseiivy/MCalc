package com.example.mcalc;

public class MortgageModel
    {
        private String principle;
        private String amortization;
        private String interestrate;

        public MortgageModel(String p, String a, String i)
        {
            this.principle = p;
            this.amortization = a;
            this.interestrate = i;
        }

        public String computepayment()
        {
            int amortization = Integer.parseInt(this.amortization);
            double interestrate = Double.parseDouble(this.interestrate);
            double P = Double.parseDouble(this.principle);
            double r = interestrate/1200;
            int n = amortization * 12;
            double result = (r * P)/(1-Math.pow((1+r), -1*n));
            String payment = String.format("%,.2f", result);
            return payment;
        }
    }

