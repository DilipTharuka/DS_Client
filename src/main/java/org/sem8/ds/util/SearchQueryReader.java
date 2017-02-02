/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sem8.ds.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author amila
 */
public class SearchQueryReader {
    
    
    public static List<String> readQueryFile(File file) throws FileNotFoundException, IOException {
        List<String> queryList = new Vector<>();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String query = bufferedReader.readLine();
        while (query != null) {
            queryList.add(query);
            query = bufferedReader.readLine();
        }
        
        return queryList;
    }
    
}
