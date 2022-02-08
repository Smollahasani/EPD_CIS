package cispackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class DataProviders {
	@DataProvider(name = "AddPationesPersian")
	public Iterator<Object[]> AddPationesPersian() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\s.mollahasani\\EPD\\CIS\\src\\test\\resources\\data\\CSVFile\\AddPationesPersian.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddPationesForeign")
	public Iterator<Object[]> AddPationesForeign() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\s.mollahasani\\EPD\\CIS\\src\\test\\resources\\data\\CSVFile\\AddPationesForeign.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AdmitData")
	public Iterator<Object[]> AdmitExistingPatientElectronicNumber() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\s.mollahasani\\EPD\\CIS\\src\\test\\resources\\data\\CSVFile\\AdmitData.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}

	} 