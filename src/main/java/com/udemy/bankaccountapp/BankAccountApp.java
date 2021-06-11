package com.udemy.bankaccountapp;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BankAccountApp {

    public static void main(String[] args) {
        new BankAccountApp().process();
    }

    private void process() {
        try {
            List<Account> accounts = readCSV();
            System.out.println(accounts);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    private List<Account> readCSV() throws IOException {
        // Read CSV file
        Path in = Path.of("src/main/resources/NewBankAccounts.csv");
        CSVParser csvParser = CSVParser.parse(in, StandardCharsets.US_ASCII,
                CSVFormat.EXCEL);
        List<CSVRecord> listCsvRecord =  new ArrayList<>();
        listCsvRecord.addAll(csvParser.getRecords());
        return listCsvRecord.stream().map(record -> {
            if (record.get(2).equals("Savings")) {
                return new Savings(record.get(0), Integer.parseInt(record.get(1)), Integer.parseInt(record.get(3)));
            }
            else if (record.get(2).equals("Checking")) {
                return new Checking(record.get(0), Integer.parseInt(record.get(1)), Integer.parseInt(record.get(3)));
            }
            else {
                throw new IllegalArgumentException("Unknown account type.");
            }
        }).collect(Collectors.toList());
    }
}
