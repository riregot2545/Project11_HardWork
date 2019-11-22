package com.nix;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class CustomersReportTest {

    static final Logger logger = LoggerFactory.getLogger(FinancialReport.class);
    @Test
    public void build() {
        logger.debug("Testing FinancialReport");
        Header header = new Header("RANDOM BANK","Document Header");
        Footer footer = new Footer("Kyiv");
        CustomersBody body = new CustomersBody("Customer text Customer text\nCustomer text Customer text\nCustomer text Customer text",
                "Customer 1 - 0.1\n" +
                        "Customer 2 - .2\n" +
                        "Customer 3 - 1");
        CustomersReport customersReport = new CustomersReport(header,body,footer);
        assertEquals("RANDOM BANK\n" +
                "Document Header\n" +
                "Customer text Customer text\n" +
                "Customer text Customer text\n" +
                "Customer text Customer text\n" +
                "Customer 1 - 0.1\n" +
                "Customer 2 - .2\n" +
                "Customer 3 - 1\n" +
                "Kyiv\n" +
                "2019",customersReport.build());
        logger.debug("\n"+customersReport.build());
    }
}