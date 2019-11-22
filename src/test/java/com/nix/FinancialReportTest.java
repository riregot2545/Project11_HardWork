package com.nix;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class FinancialReportTest {
    static final Logger logger = LoggerFactory.getLogger(FinancialReport.class);

    @Test
    public void build() {
        logger.debug("Testing FinancialReport");
        Header header = new Header("RANDOM BANK","Document Header");
        Footer footer = new Footer("Kyiv");
        FinancialBody body = new FinancialBody("Random text Random text\nRandom text Random text\nRandom text Random text",
                "------\n" +
                "| 1 |\n" +
                "| 2 |\n" +
                "-----");
        FinancialReport financialReport = new FinancialReport(header,body,footer);
        assertEquals("RANDOM BANK\n" +
                "Document Header\n" +
                "Random text Random text\n" +
                "Random text Random text\n" +
                "Random text Random text\n" +
                "------\n" +
                "| 1 |\n" +
                "| 2 |\n" +
                "-----\n" +
                "Kyiv\n" +
                "2019",financialReport.build());
        logger.debug("\n"+financialReport.build());

    }
}