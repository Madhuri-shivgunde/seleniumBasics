package seleniumAdavacnce;

public class xpathTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Xpath : Xpath is address of html tag
		 Two type
		  1)Absolute Xpath: direct xpath starts with single / , starting from root html tag eg.. /html/body/div/
		 2)Relative Xpath: indirect xpath starts with double //.  eg.  //div[@id='mydiv']
		
		 
		 Syntax of relative xpath:
		 	
		 1)	//tagname[@sttributename='value']
		 	
		 2)	//*[@sttributename='value']
		 
		 3) xpath with multiple attributes joining with 'and/or'
		 	
		 		//tagname[@sttributename1='value1' and  @sttributename2='value2' and @sttributename3='value13']
		 		 
		 		//tagname[@sttributename1='value1' or  @sttributename2='value2' or @sttributename3='value13']
		 		 
		 4)text()
		 	
		 		//tagname[text()='text']
		 		 
		 		 //tagname[text()='text' and @attr='valu1']
		 		 
		 		 
		 5) contains() function used to locate dynamic elements
		 
		 		//tagname[contains(@attribute,'substringvalue')]
		 		 
		 		 
		 		//tagname[contains(@attribute,'substringvalue') and @attri1='value1']
		 		 
		 		 
		 		//agname[contains(text(),'substringvalue')
		 		 
		 	
		 6) xpath with indexing in case locating  webelement from aaray of webelements
		 	
		 		(//tagname[@attr='value'])[indexnumber]
		 		
		 7) position()
		 
		 		(//tagname[@attr='value'])[position()=indexnumber]
		 		
		 8)last() function to get last webelement from group of array
		  	
		  			(//tagname[@attr='value'])[last()]
		  			
		  9) starts-with()
		  	
		  		//tagname[strts-with(@attr,'value')]
		  		 
		  		 //tagname[starts-with(text(),'text')]
		  		  
		  		  
		  10) parent to child traversing xpath
		  
		  		a) direct child use / after parent xpath
		  		b) indirect child use // after parent xpath
		  
		  		a) direct child
		  			//tagname[@atrr='value']/tagname[]@attr='value']
		  			 
		  			 
		  			 //tagname[@atrr='value']/tagname
		  			  
		  			   //tagname[@atrr='value']/*
		  			    
		  			    
		  			  
		  		b) indirect child
		  			  
		  			 //tagname[@atrr='value'] //tagname[]@attr='value']
		  			 
		  			  
		  			 
		  		c) using child::
		  			
		  			//tagname[@atrr='value']/child::tagname[]@attr='value']
		  			 
		  			 //tagname[@atrr='value']/child::tagname
		  			 
		  			
		  	11) child to parent traversing
		  		
		  		a) immediate parents
		  	
		  				//tagname[@atrr='value']/..
		  				
		 		b) immediate grandparent
		 		
		 			//tagname[@atrr='value']/../..
		 			 
		 		 c) immediate grand grand parent
		 		 
		 		 	//tagname[@atrr='value']/../../..
		 	
		 	
		 	12) using parent::
		  			
		  			//tagname[@atrr='value']/parent::tagname[]@attr='value']
		  			 
		  			
		  	13) using ancestor::
		  			
		  			//tagname[@atrr='value']/ancestor::tagname[]@attr='value']
		  			 
		  			 (//tagname[@atrr='value']/ancestor::tagname)[indexnumber]
		  			 
		  			 (//tagname[@atrr='value']/ancestor::tagname)[last()]
		  			 
		  			  (//tagname[@atrr='value']/ancestor::tagname)[position()=indexnumber]
		 	
		 * */
		

	}

}
