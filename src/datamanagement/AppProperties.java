package datamanagement;
import java.util.*;
import java.io.*;
public class AppProperties {
private static AppProperties self = null; 
private Properties properties;

public static AppProperties getInstance() {
if (self == null ) { self = new AppProperties(); } return self;}
private AppProperties() {
    properties = new Properties() ;//created new object
try {properties.load(new FileInputStream("Properties.prop"));} 
catch (IOException e) //started exception command
{throw new RuntimeException("Could not read property file");}}
    public Properties getProperties() {return properties;
}}
