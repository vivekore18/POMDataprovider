package com.gmail;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
    
	@DataProvider
    public static Object[][] getData(){
		
		Object [][] data = new Object[3][2];
		data[0][0] ="vkverygood@gmail.com";
		data[0][1] ="BadguY@18";
				
		data[1][0] ="vkverygood@gmail.com";
		data[1][1] ="BadguY@18";
								
		data[2][0] ="vkverygood@gmail.com";
		data[2][1] ="BadguY@18";
		return data;
		
	}
		}
       /*{
        return new Object[][] {
           { "vkverygood@gmail.com", "BadguY1"  },
    	   {"vkverygood@gmail.com",  "BadguY@18"},
    	   {"vkverygood@gmail.com",  "BadguY2"  }};
    	}*/
    