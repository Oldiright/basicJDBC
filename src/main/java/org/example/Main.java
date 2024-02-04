package org.example;

import db.Database;
import db.DatabaseQueryService;
import db.dao.HighestPaidWorker;
import db.dao.LongestProject;
import db.dao.MaxProjectCountClient;
import db.dao.YoungestOrEldestWorker;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        DatabaseQueryService dbqs = new DatabaseQueryService();
        List<YoungestOrEldestWorker> result = null;

        result =  dbqs.findYoungestAndEldestWorkers();

        System.out.println(result);

    }
}